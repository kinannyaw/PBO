/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Mahasiswa {
    protected String nama;
    protected String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // OVERLOADING 1: Hitung UKT Standar (1 Parameter)
    public double hitungUKT(double uktNominal) {
        return uktNominal;
    }

    // OVERLOADING 2: Hitung UKT dengan Denda (2 Parameter)
    public double hitungUKT(double uktNominal, double denda) {
        return uktNominal + denda;
    }
}


