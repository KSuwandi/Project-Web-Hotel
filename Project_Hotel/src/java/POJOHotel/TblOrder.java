package POJOHotel;
// Generated Oct 19, 2020 9:20:20 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.faces.bean.ManagedBean;

@ManagedBean

public class TblOrder  implements java.io.Serializable {


     private Integer idOrder;
     private String namaUser;
     private int idPelanggan;
     private String namaRoom;
     private int idRoom;
     private String type;
     private Long price;
     private Date checkIn;
     private Date checkOut;

    public TblOrder() {
    }

	
    public TblOrder(int idPelanggan, int idRoom) {
        this.idPelanggan = idPelanggan;
        this.idRoom = idRoom;
    }
    public TblOrder(String namaUser, int idPelanggan, String namaRoom, int idRoom, String type, Long price, Date checkIn, Date checkOut) {
       this.namaUser = namaUser;
       this.idPelanggan = idPelanggan;
       this.namaRoom = namaRoom;
       this.idRoom = idRoom;
       this.type = type;
       this.price = price;
       this.checkIn = checkIn;
       this.checkOut = checkOut;
    }
   
    public Integer getIdOrder() {
        return this.idOrder;
    }
    
    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }
    public String getNamaUser() {
        return this.namaUser;
    }
    
    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }
    public int getIdPelanggan() {
        return this.idPelanggan;
    }
    
    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }
    public String getNamaRoom() {
        return this.namaRoom;
    }
    
    public void setNamaRoom(String namaRoom) {
        this.namaRoom = namaRoom;
    }
    public int getIdRoom() {
        return this.idRoom;
    }
    
    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
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
    public Date getCheckIn() {
        return this.checkIn;
    }
    
    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }
    public Date getCheckOut() {
        return this.checkOut;
    }
    
    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }




}


