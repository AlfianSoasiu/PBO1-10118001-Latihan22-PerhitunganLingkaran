
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * Nama      : Alfian Soasiu
 * Kelas     : PBO1
 * NIM       : 10118001
 * Deskripsi : Program perhitungan lingkaran
 */
public class perhitunganlingkaran {
    
    public static void main(String[] args) {
        System.out.println("__________Perhitungan Lingkaran__________");
        System.out.print("Masukan Nilai diameter lingkaran : ");
        Scanner scanner = new Scanner(System.in);
        double diameter;
        diameter = 0;
        while (scanner.hasNextDouble()){
            System.out.println("Nilai Diameter Tidak Sesuai");
            System.out.print("Masukan nilai diameter lingkaran : ");
            scanner.nextDouble();
        }
        
        diameter = scanner.nextDouble();
        System.out.println("__________Hasil Perhitungan Lingkaran__________");
        System.out.println("Jari-jari lingkaran = " + (diameter/2) + "cm");
        System.out.println("Luas lingkaran = " + (3.14*(diameter/2)*(diameter/2)) + "cm");
        System.out.println("Keliling lingkaran = " + (3.14*diameter) + "cm");
    }
}
