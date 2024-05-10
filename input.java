/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instockk;

/**
 *
 * @author erick
 */
public class input {
  public static void page() {

    dtinput DA = new dtinput(10);
       String ul ="ulang";
       do{
            System.out.println("Aplikasi InStock (Input Data)");
            System.out.println("~~~~~~~~~~~~~~~~~~~~");
            System.out.println("A. Lihat Data Produk");
            System.out.println("B. Tambah DataProduk");
            System.out.println("C. Ubah Data Produk");
            System.out.println("D. Hapus Data Produk");
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
