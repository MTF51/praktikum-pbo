
/*
* Nama File    : BangunDatarGeneric.java
* Nama Pembuat : Mustafa Iswardana
* NIM          : 24060121149117
* Deskripsi    : Kelas Konstruksi Generic untuk BangunDatar
*/



public class BangunDatarGeneric <T extends BangunDatar>{
	private T bangunDatar;

	public void set (T tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}

	public T get(){
		return bangunDatar;
	}

	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}










