package POJOHotel;

import DAO.DAOLogin;
import DAO.DAOuser;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean

public class TblAdmin  implements java.io.Serializable {


     private Integer idAdmin;
     private String username;
     private String password;

    
    public void save_user()
    {
        DAOLogin add = new DAOLogin();
        add.add_user(this);
    } 
     
    public String login_user(){
        DAOLogin  uDao = new DAOLogin();
        List<TblAdmin> us = uDao.getBy(username, password);
        try {
            if(us != null) {
            username = us.get(0).username;
            password = us.get(0).password;
            return "index";
        }
        } catch (Exception e) {
            System.out.println(e);
        }
            return "login_failed";
    }
     
    public TblAdmin() {
    }

    public TblAdmin(String username, String password) {
       this.username = username;
       this.password = password;
    }
   
    public Integer getIdAdmin() {
        return this.idAdmin;
    }
    
    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


