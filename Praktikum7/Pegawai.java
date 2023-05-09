/*
 * File		: Pegawai.java/06/Mei/2023
 * Penulis	: Mustafa Iswardana/24060121149117
 * Deskripsi	: "kelas pegawai"
*/


public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}