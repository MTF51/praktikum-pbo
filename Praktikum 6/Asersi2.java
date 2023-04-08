
/*
 * File		: AngkaSial.java/24/Maret/2023
 * Penulis	: Mustafa Iswardana/24060121149117
 * Deskripsi	: Program untuk demo asersi, yang akan menolak input
 *             jari-jari lingkaran yang bernilai nol
*/



class Lingkaran{
    	private double jariJari;
    	public Lingkaran(double jariJari){
        	this.jariJari = jariJari;
    	}

    	public double hitungKeliling(){
        	double keliling = 2*Math.PI*jariJari;
        	return keliling;
    	}
}


public class Asersi2 {
    	public static void main(String[] args) {
        	double jariJari = 0;
        	assert(jariJari > 0):"jari jari tidak boleh nol!!!";
        	Lingkaran l = new Lingkaran(jariJari);
        	double kelilingLingkaran = l.hitungKeliling();
        	System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    	}
}


/* Menjawab pertanyaan
 * Secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
 * jawab:
 * Secara konsep sedikit kurang tepat yakni terdapat kesalahan untuk kondisi asersi jari-jari
 * bernilai false yakni untuk kurang dari nol/ bernilai negatif dan bernilai 0, 
 * sehingga kondisi yang diterapkan seharunya adalah "jari jari harus bernilai positif ".
 */