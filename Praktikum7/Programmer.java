/*
 * File		: Programmer.java/06/Mei/2023
 * Penulis	: Mustafa Iswardana/24060121149117
 * Deskripsi	: "kelas programmer"
*/



public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}