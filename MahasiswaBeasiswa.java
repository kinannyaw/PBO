/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class MahasiswaBeasiswa extends Mahasiswa {
    protected String JenisBeasiswa;
    protected double NominalBeasiswa;

    public void setDataBeasiswa(String Value1, double Value2) {
        JenisBeasiswa = Value1;
        NominalBeasiswa = Value2;
    }

    public void printDataBeasiswa() {
        printData();

        System.out.println("Jenis Beasiswa: " + JenisBeasiswa);
        System.out.printf("Nominal Beasiswa: Rp%,.0f%n", NominalBeasiswa);
    }
}