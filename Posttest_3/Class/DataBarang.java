package Posttest_3.Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DataBarang <T> {
    protected ArrayList<T> barangList = new ArrayList<>();

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    
    public void insertBarang(T barang){
        barangList.add(barang);
    }
    
    public void lihatBarang(){
        if(barangList.isEmpty()){
            System.out.println("Belum ada data kamera");
        }else{
            int i = 1;
            for (T barang : barangList) {
                System.out.println(i + ".------------------------------");
                System.out.println(barang);
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

    public void newBarang() throws IOException{
        System.out.println("newBarang");
    }

    public boolean cekIndex(String idx){
        try {
            Integer.parseInt(idx);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int pilihIndexBarang() throws  IOException{
        int idx;
        String idxTemp;
        if(barangList.isEmpty()){
            System.out.println("Belum ada data barang");
            return -1;
        }
        lihatBarang();

        System.out.print("Pilih index >> ");
        idxTemp = br.readLine();

        if(!cekIndex(idxTemp)){
            System.out.println("Index harus berupa angka");
            return -1;
        }

        idx = Integer.parseInt(idxTemp);

        if(idx <=0 || idx > barangList.size()){
            System.out.println("Index barang tidak ada");
            return -1;
        }
        return idx;
    }

    public void perbaikiBarang() throws IOException {
        System.out.println("memperbaiki barang");
    }

    public void editBarang() throws IOException{
        System.out.println("edit barang");
    }

    public void hapusBarang() throws IOException{
        System.out.println("hapus barang");
    }
    


}
