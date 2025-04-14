package Posttest_5.Class;


public class Kamera extends Barang {

    public Kamera (String nama, String kerusakan, Costumer pemilik){
        super(nama, kerusakan, pemilik);
    }

    public String getStatus(){
        return super.getStatus();
    }

    public void setStatus(){
        super.setStatus();
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
