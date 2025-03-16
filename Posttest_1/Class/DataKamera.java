package Posttest_1.Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DataKamera {
    public ArrayList<Kamera> kameraList = new ArrayList<>();


    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    public void insertKamera(Kamera kamera){
        kameraList.add(kamera);
    }

    public void lihatKamera(){
        if(kameraList.isEmpty()){
            System.out.println("Belum ada data kamera");
        }else{
            for (Kamera kamera : kameraList) {
                System.out.println(kamera);
            }
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
}
