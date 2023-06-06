
/*
* Nama File    : BangunDatarGenericTest.java
* Nama Pembuat : Mustafa Iswardana
* NIM          : 24060121149117
* Deskripsi    : Main class untuk Generic bangun datar
*/

 

public class BangunDatarGenericTest {
	public static void main (String[] args) {
		Lingkaran 1 = new Lingkaran(2);
		BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
		bdg.set(1);
		System.out.println("Keliling Lingkaran : " +bdg.hitungKeliling());
		System.out.println("tipe generic : "+bdg.get().getClass().getName());
	}
}













