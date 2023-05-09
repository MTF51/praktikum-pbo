/*
 * File		: Manajer.java/06/Mei/2023
 * Penulis	: Mustafa Iswardana/24060121149117
 * Deskripsi	: "Adalah Extends dari pegawai dan kelas manajer"
*/



public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}