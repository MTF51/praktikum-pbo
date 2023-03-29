/*
 * File		: MBujurSangkar.java/26/Maret/2023
 * Penulis	: Mustafa Iswardana/24060121149117
 * Deskripsi	: Kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 */


import java.util.Scanner;

class MBujurSangkar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    BujurSangkar bs = new BujurSangkar();
    System.out.print("Masukkan sisi dari bujur sangkarnya : ");
    double sisi = scan.nextDouble();
    System.out.println("Luas bujur sangkar dengan sisinya "+sisi+
              " satuannya adalah " +bs.hitungLuas(sisi));
  }
}