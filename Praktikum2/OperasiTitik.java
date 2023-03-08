
// Nama		 : Mustafa Iswardana 
// NIM		 : 24060121149117
// Tanggal	 : 06 Maret 2023
// Nama File	 : OperasiTitik.java
// Lab Praktikum : Prak PBO B1
// Deskripsi	 : Program kelas operasi titik


class OperasiTitik {

    	private void refleksiSumbuX(Titik titik) {
        	double ordinat = titik.getOrdinat();
        	titik.setOrdinat(ordinat * -1);
    	}

    	private void refleksiSumbuY(Titik titik) {
        	double absis = titik.getAbsis();
        	titik.setAbsis(absis * -1);
    	}

    	public Titik refleksiX(Titik t1) {
        	refleksiSumbuX(t1);
        	return t1;
    	}

    	public Titik refleksiY(Titik t1) {
        	refleksiSumbuY(t1);
        	return t1;
    	}
    
}
