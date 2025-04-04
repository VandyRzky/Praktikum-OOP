package Posttest_3.Class;


public class Kamera {
    String nama;
    String kerusakan;
    boolean statusRusak;
    Costumer pemilik;

    public Kamera(String nama, String kerusakan, Costumer pemilik){
        this.nama = nama;
        this.kerusakan = kerusakan;
        this.statusRusak = true;
        this.pemilik = pemilik;
    }

    public String getStatus(){
        if (this.statusRusak){
            return "Rusak";
        }
        return "Diperbaiki";
    }

    public void setStatus(){
        this.statusRusak = false;
    }


    @Override
    public String toString() {
        return """
                Nama kamera: %s
                Kerusakan: %s
                Status: %s
                Pemilik: %s""".formatted(this.nama, this.kerusakan, this.getStatus(), this.pemilik.getNama());
    }
}
