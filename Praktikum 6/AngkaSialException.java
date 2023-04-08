/*
 * File		: AngkaSial.java/24/Maret/2023
 * Penulis	: Mustafa Iswardana/24060121149117
 * Deskripsi 	: Eksepsi buatan sendiri, menolak masukan angka 13!
 * 
 */


public class AngkaSialException extends Exception {
    	public AngkaSialException(){
        	super("jangan memasukkan angka 13 karena angka sial !!!");
    	}
}