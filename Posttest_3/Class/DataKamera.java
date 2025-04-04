package Posttest_3.Class;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DataKamera {
    protected ArrayList<Kamera> kameraList = new ArrayList<>();

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    public void insertKamera(Kamera kamera){
        kameraList.add(kamera);
    }

    public void lihatKamera(){
        if(kameraList.isEmpty()){
            System.out.println("Belum ada data kamera");
        }else{
            int i = 1;
            for (Kamera kamera : kameraList) {
                System.out.println(i + ".------------------------------");
                System.out.println(kamera);
                i++;
            }
            System.out.println("--------------------------------");
        }
    }

    public Costumer buatCostumer() throws IOException {
        String namaCostumer;
        System.out.print("Nama pemilik >> ");
        namaCostumer = br.readLine();
        return new Costumer(namaCostumer);
    }

    public void newKamera() throws IOException{
        String namaKamera;
        String kerusakan;

        System.out.print("Nama kamera >> ");
        namaKamera = br.readLine();
        System.out.print("Kerusakan kamera >> ");
        kerusakan = br.readLine();

        Kamera kameraTemp = new Kamera(namaKamera, kerusakan, buatCostumer());

        this.insertKamera(kameraTemp);
    }

    public boolean cekIndex(String idx){
        try {
            Integer.parseInt(idx);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int pilihIndexKamera() throws  IOException{
        int idx;
        String idxTemp;
        if(kameraList.isEmpty()){
            System.out.println("Belum ada data kamera");
            return -1;
        }
        lihatKamera();

        System.out.print("Pilih index kamera >> ");
        idxTemp = br.readLine();

        if(!cekIndex(idxTemp)){
            System.out.println("Index harus berupa angka");
            return -1;
        }

        idx = Integer.parseInt(idxTemp);

        if(idx <=0 || idx > kameraList.size()){
            System.out.println("Index kamera tidak ada");
            return -1;
        }
        return idx;
    }

    public void perbaikiKamera() throws IOException {
        int idx = pilihIndexKamera();
        if(idx<0)return;

        kameraList.get(idx-1).setStatus();
        System.out.println("Kamera berhasil diperbaiki");
    }

    public void editKamera() throws IOException{
        int idx = pilihIndexKamera();
        if(idx < 0)return;
        String namaKamera;
        String kerusakan;

        System.out.print("Nama kamera >> ");
        namaKamera = br.readLine();
        System.out.print("Kerusakan kamera >> ");
        kerusakan = br.readLine();

        Kamera kameraTemp = new Kamera(namaKamera, kerusakan, buatCostumer());

        kameraList.set(idx-1, kameraTemp);
        System.out.println("Kamera berhasil diedit");
    }

    public void hapusKamera() throws IOException {
        int idx = pilihIndexKamera();
        if(idx < 0)return;
        kameraList.remove(idx-1);
        System.out.println("Kamera berhasil dihapus");
    }
}
