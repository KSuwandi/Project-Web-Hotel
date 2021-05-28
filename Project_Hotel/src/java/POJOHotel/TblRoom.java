package POJOHotel;
// Generated Oct 19, 2020 9:20:20 PM by Hibernate Tools 4.3.1

import DAO.DAOuser;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;



@ManagedBean
/**
 * TblRoom generated by hbm2java
 */
public class TblRoom  implements java.io.Serializable {


     private Integer idRoom;
     private String namaRoom;
     private String type;
     private Long price;

     
    public List<TblRoom> getAllRecords(){
        DAOuser adm = new DAOuser();
        List<TblRoom> ladm = adm.retrieveTblRoom();
        return ladm;
    }
    
    public String getById()
    {
        String id_room = idRoom.toString();
        DAOuser adm = new DAOuser();
        List<TblRoom> lusr = adm.getbyID(id_room);
        namaRoom = lusr.get(0).namaRoom;
        type = lusr.get(0).type;
        price = lusr.get(0).price;
        return "admin_page";
    }
    
    public void edit()
    {
        
        DAOuser room = new DAOuser();
        room.editRoom(this);
        namaRoom = "";
        type = "";
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO,"Berhasil Update Data",null);
        
    }
    
    public void delete()
    {
        
        DAOuser room = new DAOuser();
        room.deleteRoom(idRoom);
        namaRoom = "";
        type = "";
       
    }
    
     
    public TblRoom() {
    }

    public TblRoom(String namaRoom, String type, Long price) {
       this.namaRoom = namaRoom;
       this.type = type;
       this.price = price;
    }
   
    public Integer getIdRoom() {
        return this.idRoom;
    }
    
    public void setIdRoom(Integer idRoom) {
        this.idRoom = idRoom;
    }
    public String getNamaRoom() {
        return this.namaRoom;
    }
    
    public void setNamaRoom(String namaRoom) {
        this.namaRoom = namaRoom;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Long getPrice() {
        return this.price;
    }
    
    public void setPrice(Long price) {
        this.price = price;
    }




}


