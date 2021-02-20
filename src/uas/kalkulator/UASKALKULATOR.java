/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.kalkulator;

import java.util.Scanner;

/**
 * NAMA     : AGUS DERI DERMAWAN
 * NIM      : 10119040
 * KELAS    : IF1
 * TANGGAL  : 20 - 02 - 2021
 * NO SOAL  : 6
 * 
 */
public class UASKALKULATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kalkulator.value1 = scanner.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kalkulator.value2 = scanner.nextDouble();
        double tambah = kalkulator.tambahBilangan();
        double kurang = kalkulator.kurangBilangan();
        double kali = kalkulator.kaliBilangan();
        double bagi = kalkulator.bagiBilangan();
        double sisaBagi = kalkulator.sisaBagiBilangan();
        System.out.println("Hasil Pertambahan : " + tambah);
        System.out.println("Hasil Pengurangan : " + kurang);
        System.out.println("Hasil Perkalian : " + kali);
        System.out.println("Hasil Pembagian : " + bagi);
        System.out.println("Hasil Sisa : " + sisaBagi);
    }
    
}
