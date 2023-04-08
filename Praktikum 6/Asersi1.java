
/*
 * File		: AngkaSial.java/24/Maret/2023
 * Penulis	: Mustafa Iswardana/24060121149117
 * Deskripsi	: Program untuk menunjukkan asersi
*/


public class Asersi1 {
    	public static void main(String[] args) {
        	int x = 0;
        	if (x > 0){
            		System.out.println("X bilangan positif");
        	}
        	else{
            		assert(x < 0):"ada kesalahan kode";
            		System.out.println("x bilangan negatif");
        	}
    	}
}