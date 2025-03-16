package Posttest_1.Class;

public class Kamera {
    int id;
    String nama;
    String kerusakan;
    Costumer pemilik;

    public Kamera(int id,String nama, String kerusakan, Costumer pemilik){
        this.id = id;
        this.nama = nama;
        this.kerusakan = kerusakan;
        this.pemilik = pemilik;
    }

    @Override
    public String toString() {
        return """
                Id: %d
                Nama: %s
                Kerusakan: %s
                Pemilik: %s
                """.formatted(this.id, this.nama, this.kerusakan, this.pemilik.getNama());
    }
}
