package POJOHotel;

import DAO.DAOLogin;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean

public class TblPelanggan  implements java.io.Serializable {


     private Integer idPelanggan;
     private String nama;
     private String alamat;
     private String noTelp;
     private String email;
     private String password;

    public TblPelanggan() {
    }
    

    public TblPelanggan(String nama, String alamat, String noTelp, String email, String password) {
       this.nama = nama;
       this.alamat = alamat;
       this.noTelp = noTelp;
       this.email = email;
       this.password = password;
    }
   
    public Integer getIdPelanggan() {
        return this.idPelanggan;
    }
    
    public void setIdPelanggan(Integer idPelanggan) {
        this.idPelanggan = idPelanggan;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getNoTelp() {
        return this.noTelp;
    }
    
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


