/**
 * File		: Kubus.java/15/Maret/2023
 * Penulis	: Mustafa Iswardana/24060121149117
 * Deskripsi	: class untuk Kubus
 */


package org.bangunruang;
import org.bangundatar.BujurSangkar;


public class Kubus {
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan) {
        this.permukaan =permukaan;
    }

    public double hitungVolume() {
        return permukaan.hitungLuas() *permukaan.getPanjangSisi();
    }

    public double hitungLuasAlas() {
        return permukaan.hitungLuas();
    }
}