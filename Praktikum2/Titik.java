

// Nama		 : Mustafa Iswardana 
// NIM		 : 24060121149117
// Tanggal	 : 06 Maret 2023
// Nama File	 : Titik.java
// Lab Praktikum : Prak PBO B1
// Deskripsi	 : Program kelas Titik



class Titik {
	private double absis;
	private double ordinat;
	private static int counterTitik;

	Titik() {
		absis = 0;
		ordinat = 0;
		counterTitik = counterTitik+1;
	}

	Titik(double a, double o) {
		absis = a;
        	ordinat = o;
        	counterTitik = counterTitik+1;
    	}

    	public void setAbsis(double a) {
        	absis = a;
    	}

    	public void setOrdinat(double o) {
        	ordinat = o;
    	}

    	public double getAbsis() {
        	return absis;
    	}

    	public double getOrdinat() {
        	return ordinat;
    	}

    	public int getCounterTitik() {
        	return counterTitik;
    	}

}