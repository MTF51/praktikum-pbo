
/*
* Nama File    : Lingkaran.java
* Nama Pembuat : Mustafa Iswardana
* NIM          : 24060121149117
* Deskripsi    : Implementasi Lingkaran sebagai BangunDatar
*/


public class Lingkaran extends BangunDatar{
	private double jejari;
	
	public Lingkaran (double jejari){
		this.jejari = new jejari;
	}

	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}
