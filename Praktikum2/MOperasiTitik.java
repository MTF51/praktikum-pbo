

// Nama		 : Mustafa Iswardana 
// NIM		 : 24060121149117
// Tanggal	 : 06 Maret 2023
// Nama File	 : MOperasiTitik.java
// Lab Praktikum : Prak PBO B1
// Deskripsi	 : Program kelas utama operasi titik


class MOperasiTitik {
	public static void main(String[] args) {
        	Titik t = new Titik(4,4);
		OperasiTitik op = new OprasiTitik();
	
		System.out.println("titik("+t.getAbsis()+","+t.getOrdinat()+")");

		op.refleksiX(t);
		System.out.println("\nTitik refleksi terhadap sumbu X");
		System.out.println("Titik("+t.getAbsis()+","+t.getOrdinat()+")");
		
		op.refleksiY(t);
		System.out.println("\nTitik refleksi terhadap sumbu Y");
		System.out.println("Titik("+t.getAbsis()+","+t.getOrdinat()+")");
	
	}
}
