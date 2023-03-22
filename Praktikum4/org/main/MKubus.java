/**
 * File		: MKubus.java/15/Maret/2023
 * Penulis	: Mustafa Iswardana/24060121149117
 * Deskripsi	: class main untuk Kubus
 */

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar =new BujurSangkar(4);
	Kubus kubus =new Kubus(bujurSangkar);


        System.out.println("Volume dari Kubus : "+ kubus.hitungVolume());
        System.out.println("Luas permukaan alas Kubus : "+ kubus.hitungLuasAlas());
    }
}