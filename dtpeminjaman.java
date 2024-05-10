/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instockk;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class dtpeminjaman {
     private int jRecord = 10;
     public int aRec = 0;
    
    //Array
    private String[][] dtpeminjaman = new String[jRecord][4];
    Scanner dtIN = new Scanner(System.in);
    
    //constactor
    public dtpeminjaman(int nval){
        this.jRecord = nval;
    }
 
    //StoreData
    public void InputData(){
        int idx = aRec;
        
        if(idx >= jRecord){
            System.out.println("Tempat Penyimpanan Data Sudah Penuh");
            System.out.println("");
            return;
        }
        System.out.println("Tambah Data Produk");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.print("Nama Produk : ");
        dtpeminjaman[idx][0] = dtIN.nextLine();
        
        System.out.print("Jumlah Produk : ");
        dtpeminjaman[idx][1] = dtIN.nextLine();
        
        System.out.print("Tanggal Peminjaman : ");
        dtpeminjaman[idx][2] = dtIN.nextLine();
        
        System.out.print("Tanggal Pengembalian : ");
        dtpeminjaman[idx][3] = dtIN.nextLine();
        
        aRec++;
    }
    
    //UpdateData = Mengubah data
    public void UpdateData(){
        System.out.println("Ubah Data Produk");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Nomor Record: ");
        
        String txidx = dtIN.nextLine();
        int idx = Integer.parseInt(txidx);
        System.out.println("Data Lama");
        System.out.println("~~~~~~~~~");
        System.out.println("Nama Produk: "+dtpeminjaman[idx][0]);
        System.out.print("Diubah menjadi: ");
        dtpeminjaman[idx][0] = dtIN.nextLine();
        
        System.out.println("Jumlah Produk: "+dtpeminjaman[idx][1]);
        System.out.print("Diubah menjadi: ");
        dtpeminjaman[idx][1] = dtIN.nextLine();
        
        System.out.println("Tanggal Peminjaman: "+dtpeminjaman[idx][2]);
        System.out.print("Diubah menjadi: ");
        dtpeminjaman[idx][2] = dtIN.nextLine();
        
        System.out.println("Tanggal Pengembalian: "+dtpeminjaman[idx][3]);
        System.out.print("Diubah menjadi: ");
        dtpeminjaman[idx][3] = dtIN.nextLine();
        
        System.out.println("Data Record ke "+idx+" telah diubah");
        
        
      
                
    }
    
    //Destroy = Menghapus Data
    public void DestroyData(){
        String[][] tmp = new String[jRecord][3];
        
        System.out.println("Hapus Data Alamat");
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println("No Record: ");
        
        String txidx = dtIN.nextLine();
        int idx = Integer.parseInt(txidx);
        System.out.println("Data yang dihapus");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama Produk: "+dtpeminjaman[idx][0]);
        System.out.println("Jumlah Produk: "+dtpeminjaman[idx][1]);
        System.out.println("Tanggal Peminjaman: "+dtpeminjaman[idx][2]);
        System.out.println("Tanggal Pengembalian: "+dtpeminjaman[idx][3]);

        
        int cidx = 0;
        for(int i=0;i<aRec;i++){
            if(i == idx){
                continue;
            }
                
            tmp[cidx][0] = dtpeminjaman[i][0];   
            tmp[cidx][1] = dtpeminjaman[i][1];   
            tmp[cidx][2] = dtpeminjaman[i][2];   
            cidx++;
        }
        aRec--;
        for(int i=0; i<aRec; i++){
            tmp[cidx][0] = dtpeminjaman[i][0];   
            tmp[cidx][1] = dtpeminjaman[i][1];   
            tmp[cidx][2] = dtpeminjaman[i][2];   
        }

    }
    
    //ViewData = Melihat Data
    public void viewData(){
        System.out.println("History Peminjaman ("+aRec+"/"+jRecord+")");
        System.out.println("~~~~~~~~~~~~~~~~");
        
        for (int i=0; i<aRec; i++){
            System.out.println("Data Record ke"+i);
            System.out.println("Nama Produk :"+dtpeminjaman[i][0]);
            System.out.println("Jumlah Produk :"+dtpeminjaman[i][1]);
            System.out.println("Tanggal Peminjaman :"+dtpeminjaman[i][2]);
            System.out.println("Tanggal Pengembalian :"+dtpeminjaman[i][3]);
        }
        System.out.println("");
        
    }
}
