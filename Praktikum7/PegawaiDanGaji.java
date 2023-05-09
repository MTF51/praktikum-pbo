/*
 * File		: PegawaiDanGaji.java/06/Mei/2023
 * Penulis	: Mustafa Iswardana/24060121149117
 * Deskripsi	: "main program"
*/



public class PegawaiDanGaji{
	public static void main(String args[]) {
		Pegawai pegawai = new Programmer("Mira");
		Pegawai pegawai2 = new Manajer("Joko");
		Pegawai pegawai3 = new Manajer("Argo");

		Payroll payroll = new Payroll();
		payroll.cetakGaji(pegawai);
		payroll.cetakGaji(pegawai2);
		payroll.cetakGaji(pegawai3);
	}
}