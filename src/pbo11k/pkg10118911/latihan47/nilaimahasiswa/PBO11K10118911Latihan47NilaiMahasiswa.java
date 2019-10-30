/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118911.latihan47.nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author Dandi M Iqbal
 * Nama : Dandi Muhammad Iqbal 
 * Kelas : IF-11K
 * Nim : 10118911
 * Deskripsi Program : Program ini berisi program untuk menghitung nilai uas,
 * indeks dan keterangan dari nilai quiz, uts, dan uas
 */
public class PBO11K10118911Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        Nilai n = new Nilai();
        
        System.out.print("Masukkan nilai Quiz : ");
        double quiz = scn.nextDouble();
        System.out.print("Masukkan nilai UTS : ");
        double uts = scn.nextDouble();
        System.out.print("Masukkan nilai UAS : ");
        double uas = scn.nextDouble();
        System.out.println();
        
        double na = n.hitungNilaiAkhir(quiz, uts, uas);
        char indeks = n.hitungNilaiIndex(na);
        String ket = n.keterangan(indeks);
        
        System.out.println("Nilai Akhir = " + na);
        System.out.println();
        
        System.out.println("Index = " + indeks);
        System.out.println("Keterangan = " + ket);
    }
    
}
