/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class MahasiswaBeasiswa extends Mahasiswa {

    public MahasiswaBeasiswa(String nama, String nim) {
        super(nama, nim);
    }

    // OVERRIDING: Mahasiswa Beasiswa Bebas UKT (Rp 0)
    @Override
    public double hitungUKT(double uktNominal) {
        return 0;
    }
}

