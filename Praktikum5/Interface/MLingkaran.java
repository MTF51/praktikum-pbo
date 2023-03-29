/*
 * File		: MLingkaran.java/26/Maret/2023
 * Penulis	: Mustafa Iswardana/24060121149117
 * Deskripsi	: implementasi cara menghitung luas lingkaran
 */


import java.util.Scanner;

public class MLingkaran {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan jejari lingkaran: ");
    double jejari = scan.nextDouble();
    Lingkaran ling = new Lingkaran(jejari);
    System.out.println("Luas dari Lingkaran dengan Jejarinya " + jejari + " dengan satuannya adalah " + ling.hitungLuas());
  }
}