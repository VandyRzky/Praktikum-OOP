package Posttest_4.Class;

public class Lensa extends Barang {

    public Lensa (String nama, String kerusakan, Costumer pemilik){
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
