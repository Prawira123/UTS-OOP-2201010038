/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instockk;

/**
 *
 * @author erick
 */
public class peminjaman {
    
  public static void page() {
    dtpeminjaman DA = new dtpeminjaman(10);
       String ul ="ulang";
       do{
            System.out.println("Aplikasi InStock (Peminjaman Produk)");
            System.out.println("~~~~~~~~~~~~~~~~~~~~");
            System.out.println("A. History Peminjaman");
            System.out.println("B. Tambah Peminjaman");
            System.out.println("C. Ubah Data Peminjaman");
            System.out.println("D. Pembatalan Peminjaman");
            System.out.println("E. Selesai");
            System.out.println("Pilih A/B/C/D/E: ");
            String mPIL = DA.dtIN.nextLine();
            
            switch(mPIL){
                case "A":
                    DA.viewData();
                    break; 
                
                case "B":
                    DA.InputData();
                    break; 
                
                case "C":
                    DA.UpdateData();
                    break; 
                
                case "D":
                    DA.DestroyData();
                    break; 
                
                case "E":
                    ul ="selesai";
                    break; 
                    
                default:
                        System.out.println("Plihan Tidak tersedia");
                    break;
            }
       }while( ul.equals("ulang"));
}
}

