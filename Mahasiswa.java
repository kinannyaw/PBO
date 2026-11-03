/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Mahasiswa {
    protected String Nama, NIM, Universitas;
    protected String Jurusan, Prodi, Angkatan;

    public void setData(String Value1, String Value2,
            String Value3, String Value4,
            String Value5, String Value6) {

        Nama = Value1;
        NIM = Value2;
        Universitas = Value3;
        Jurusan = Value4;
        Prodi = Value5;
        Angkatan = Value6;
    }

    public void printData() {
        System.out.println("Nama: " + Nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Universitas: " + Universitas);
        System.out.println("Jurusan: " + Jurusan);
        System.out.println("Prodi: " + Prodi);
        System.out.println("Angkatan: " + Angkatan);
    }
}