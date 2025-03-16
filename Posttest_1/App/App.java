package Posttest_1.App;


import Posttest_1.Class.DataKamera;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    static DataKamera dataKamera = new DataKamera();

    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);

    public static void menu(){
        System.out.println("1. Tambah data kamera");
        System.out.println("2. Lihat data kamera");
        System.out.println("3. Edit data kamera");
        System.out.println("4. Hapus data kamera");
        System.out.println("5. Exit");
    }

    public static void main(String[] args) throws IOException {

        while (true){
            String menuUser;
            menu();
            System.out.print("Pilih >> ");
            menuUser = br.readLine();

            switch (menuUser){
                case "1":
                    dataKamera.newKamera();
                    break;
                case "2":
                    dataKamera.lihatKamera();
                    break;
                case "3":
                    dataKamera.pilihIndexKamera(1);
                    break;
                case "4":
                    dataKamera.pilihIndexKamera(2);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Menu tidak ada!!!");
                    break;
            }
        }
    }
}
