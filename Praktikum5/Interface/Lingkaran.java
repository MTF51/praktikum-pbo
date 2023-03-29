/*
 * File		: Lingkaran.java/26/Maret/2023
 * Penulis	: Mustafa Iswardana/24060121149117
 * Deskripsi	: kelas implementasi IArea berupa cara menghitung luas lingkaran
*/


import static java.lang.Math.PI;

class Lingkaran implements IArea{
	private double jejari;
	
	public Lingkaran(double r) {
		jejari = r;
	}
	
	public double hitungLuas() {
		return PI * jejari * jejari;
	}
}