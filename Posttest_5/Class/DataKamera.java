package Posttest_5.Class;


import java.io.IOException;

public class DataKamera extends DataBarang<Kamera> {

    @Override
    public void lihatBarang() {
        super.lihatBarang();
    }

    @Override
    public void insertBarang(Kamera barang) {
        super.insertBarang(barang);
    }


    @Override
    public void newBarang() throws IOException{
        String namaKamera;
        String kerusakan;

        System.out.print("Nama kamera >> ");
        namaKamera = br.readLine();
        System.out.print("Kerusakan kamera >> ");
        kerusakan = br.readLine();

        Kamera kameraTemp = new Kamera(namaKamera, kerusakan, buatCostumer());

        this.insertBarang(kameraTemp);
    }

    @Override
    public boolean cekIndex(String idx) {
        return super.cekIndex(idx);
    }

    @Override
    public int pilihIndexBarang() throws IOException {
        return super.pilihIndexBarang();
    }

    @Override
    public void perbaikiBarang() throws IOException {
        int idx = pilihIndexBarang();
        if(idx<0)return;

        barangList.get(idx-1).setStatus();
        System.out.println("Kamera berhasil diperbaiki");
    }

    @Override
    public void editBarang() throws IOException {
        int idx = pilihIndexBarang();
        if(idx < 0)return;
        String namaKamera;
        String kerusakan;

        System.out.print("Nama kamera >> ");
        namaKamera = br.readLine();
        System.out.print("Kerusakan kamera >> ");
        kerusakan = br.readLine();

        Kamera kameraTemp = new Kamera(namaKamera, kerusakan, buatCostumer());

        barangList.set(idx-1, kameraTemp);
        System.out.println("Kamera berhasil diedit");
    }

    @Override
    public void hapusBarang() throws IOException {
        int idx = pilihIndexBarang();
        if(idx < 0)return;
        barangList.remove(idx-1);
        System.out.println("Kamera berhasil dihapus");
    }
}
