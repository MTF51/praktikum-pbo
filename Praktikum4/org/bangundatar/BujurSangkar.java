/**
 * File		: BujurSangkar.java/15/Maret/2023
 * Penulis	: Mustafa Iswardana/24060121149117
 * Deskripsi	: class untuk BujurSangkar
 */


package org.bangundatar;
import org.poligon.Poligon;


public class BujurSangkar extends Poligon{
    private double panjangSisi;

    public BujurSangkar(double panjangSisi) {
        this.panjangSisi =panjangSisi;
    }

    public double hitungLuas() {
        return this.panjangSisi *this.panjangSisi;
    }

    public double getPanjangSisi() {
        return this.panjangSisi;
    }
}