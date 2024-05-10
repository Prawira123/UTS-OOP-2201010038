/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package instockk;
import java.util.Scanner;

/**
 *
 * @author erick
 */
public class InStockk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat Datang pada aplikasi InStock");
        System.out.println("____________________________");
        System.out.println("1. Input Produk");
        System.out.println("2. Peminjaman Produk");
        System.out.println("Masukkan pilihan (1 atau 2):");
        
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
               input.page();
                break;
            case 2:
                peminjaman.page();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
    

