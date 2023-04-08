
/*
 * File		: AngkaSial.java/24/Maret/2023
 * Penulis	: Mustafa Iswardana/24060121149117
 * Deskripsi	: Program penggunaan exception buatan sendiri, pengenalan klausa 'throw' dan 'throws'
*/


public class AngkaSial {
    	public void cobaAngka(int angka) throws AngkaSialException{
        	if (angka == 13){
            	throw new AngkaSialException();
        	}
        	System.out.println(angka + " bukan angka sial");
    	}

    	public static void main(String[] args) {
        	AngkaSial as = new AngkaSial();
        	try{
            		as.cobaAngka(10);
            		as.cobaAngka(13);
            		as.cobaAngka(12);
        	}
        	catch (AngkaSialException ase){
            		//method getMessage telah ada pada kelas "Exception"
            		System.out.println(ase.getMessage());
            		System.out.println("hati-hati memasukkan angka!!!");
        	}
    	}
}



/* Menjawab pertanyaan
 * 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 * jawab:
 * Baris tersebut tidak dieksekusi ketika eksepsi terjadi, karena akan mengembalikan pesan eksepsi dan berhenti berjalan. .

 * 2. Apakah baris 21 di atas dieksekusi?
 * jawab:
 * Baris tersebut akan dieksekusi ketika terdapat kondisi yang memenuhi AngkaSialException, yaitu pada saat kita
 * memanggil method cobaAngka() lalu mengisikan nilai 13 sebagai parameter pada method tersebut.
 */