package Posttest_3.Class;

import java.io.IOException;

public class DataLensa extends DataBarang<Lensa>{

    @Override
    public void lihatBarang() {
        super.lihatBarang();
    }

    @Override
    public void insertBarang(Lensa barang) {
        super.insertBarang(barang);
    }

    @Override
    public Costumer buatCostumer() throws IOException {
        return super.buatCostumer();
    }

    @Override
    public void newBarang() throws IOException{
        String namaLensa;
        String kerusakan;

        System.out.print("Nama lensa >> ");
        namaLensa = br.readLine();
        System.out.print("Kerusakan lensa >> ");
        kerusakan = br.readLine();

        Lensa lensaTemp = new Lensa(namaLensa, kerusakan, buatCostumer());

        this.insertBarang(lensaTemp);
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
        System.out.println("Lensa berhasil diperbaiki");
    }

    @Override
    public void editBarang() throws IOException {
        int idx = pilihIndexBarang();
        if(idx < 0)return;
        String namaLensa;
        String kerusakan;

        System.out.print("Nama lensa >> ");
        namaLensa = br.readLine();
        System.out.print("Kerusakan lensa >> ");
        kerusakan = br.readLine();

        Lensa lensaTemp = new Lensa(namaLensa, kerusakan, buatCostumer());

        barangList.set(idx-1, lensaTemp);
        System.out.println("Lensa berhasil diedit");
    }

    @Override
    public void hapusBarang() throws IOException {
        int idx = pilihIndexBarang();
        if(idx < 0)return;
        barangList.remove(idx-1);
        System.out.println("Lensa berhasil dihapus");
    }
}
