/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Praktikum;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String  nama, nim;
        int usia, uts, uas, pilih;
        boolean menu = true;
        System.out.print ("Nama Mahasiswa : ");
        nama = input.nextLine();
        System.out.print ("NIM Mahasiswa : ");
        nim = input.nextLine();
        System.out.print ("Usia Mahasiswa : ");
        usia = input.nextInt();
        System.out.print ("Nilai UTS Mahasiswa : ");
        uts = input.nextInt();
        System.out.print ("Nilai UAS Mahasiswa : ");
        uas = input.nextInt();
        
        Mahasiswa mhs = new Mahasiswa(nama, nim, usia, uts, uas);
        do{
        System.out.println("===============MENU===============");
        System.out.println("1. Tampilkan Data Mahasiswa");
        System.out.println("2. Edit Data Mahasiswa");
        System.out.println("3. Keluar");
        System.out.print ("Pilih : ");
        pilih = input.nextInt();
        
        switch(pilih){
            case 1 : 
                mhs.tampil();
                break;
            case 2 :
                input = new Scanner(System.in);
                System.out.println("============Edit Data============");
                System.out.print ("Nama Mahasiswa : ");
                nama = input.nextLine();
                System.out.print ("NIM Mahasiswa : ");
                nim = input.nextLine();
                System.out.print ("Usia Mahasiswa : ");
                usia = input.nextInt();
                System.out.print ("Nilai UTS Mahasiswa : ");
                uts = input.nextInt();
                System.out.print ("Nilai UAS Mahasiswa : ");
                uas = input.nextInt();
                mhs = new Mahasiswa(nama, nim, usia, uts, uas);
                break;
            case 3 :
                System.out.println("Program Selesai");
                menu = false;
                break;
                   
        }
        }while(menu);
    }
    
}
