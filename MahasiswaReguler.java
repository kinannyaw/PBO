/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class MahasiswaReguler extends Mahasiswa {
    
    public MahasiswaReguler(String nama, String nim) {
        super(nama, nim);
    }

    // OVERRIDING: Mahasiswa Reguler bayar 100%
    @Override
    public double hitungUKT(double uktNominal) {
        return uktNominal;
    }
}

