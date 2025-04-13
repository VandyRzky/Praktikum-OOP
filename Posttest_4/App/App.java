package Posttest_4.App;


import Posttest_4.Class.DataKamera;
import Posttest_4.Class.DataLensa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    static DataKamera dataKamera = new DataKamera();
    static DataLensa dataLensa = new DataLensa();

    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);

    public static void menu(String pilihan){
        System.out.println("1. Tambah data " + pilihan);
        System.out.println("2. Lihat data " + pilihan);
        System.out.println("3. Edit data " + pilihan);
        System.out.println("4. Perbaiki " + pilihan);
        System.out.println("5. Hapus data " + pilihan);
        System.out.println("6. Exit");
    }

    public static void menuLensa() throws IOException{
        while (true) {
            String menuUser;
            menu("lensa");
            System.out.print("Pilih >> ");
            menuUser = br.readLine();

            switch (menuUser) {
                case "1":
                    dataLensa.newBarang();
                    break;
                case "2":
                    dataLensa.lihatBarang();
                    break;
                case "3":
                    dataLensa.editBarang();
                    break;
                case "4":
                    dataLensa.perbaikiBarang();
                    break;
                case "5":
                    dataLensa.hapusBarang();
                    break;
                case "6":
                    return;
                default:
                    System.out.println("Menu tidak ada!!!");
                    break;
            }
        }
    }

    public static void menuKamera() throws IOException{
        while (true) {
            String menuUser;
            menu("kamera");
            System.out.print("Pilih >> ");
            menuUser = br.readLine();

            switch (menuUser) {
                case "1":
                    dataKamera.newBarang();
                    break;
                case "2":
                    dataKamera.lihatBarang();
                    break;
                case "3":
                    dataKamera.editBarang();
                    break;
                case "4":
                    dataKamera.perbaikiBarang();
                    break;
                case "5":
                    dataKamera.hapusBarang();
                    break;
                case "6":
                    return;
                default:
                    System.out.println("Menu tidak ada!!!");
                    break;
            }
        }
    }

    public static void menuHome(){
        System.out.println("1. Data kamera");
        System.out.println("2. Data lensa");
        System.out.println("3. Exit");
    }

    public static void main(String[] args) throws IOException {

        while (true){
            String menuUser;
            menuHome();
            System.out.print("Pilih >> ");
            menuUser = br.readLine();

            switch (menuUser){
                case "1":
                    menuKamera();
                    break;
                case "2":
                    menuLensa();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Menu tidak ada!!!");
                    break;
            }
        }
    }
}
