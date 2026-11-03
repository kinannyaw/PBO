/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            MahasiswaBeasiswa mhs = new MahasiswaBeasiswa();
            
            System.out.print("Masukkan Nama: ");
            String Nama = input.nextLine();
            
            System.out.print("Masukkan NIM: ");
            String NIM = input.nextLine();
            
            System.out.print("Masukkan Universitas: ");
            String Universitas = input.nextLine();
            
            System.out.print("Masukkan Jurusan: ");
            String Jurusan = input.nextLine();
            
            System.out.print("Masukkan Prodi: ");
            String Prodi = input.nextLine();
            
            System.out.print("Masukkan Angkatan: ");
            String Angkatan = input.nextLine();
            
            System.out.print("Masukkan Jenis Beasiswa: ");
            String JenisBeasiswa = input.nextLine();
            
            System.out.print("Masukkan Nominal Beasiswa: ");
            double NominalBeasiswa = Double.parseDouble(input.nextLine().replace(".", ""));
            
            mhs.setData(Nama, NIM, Universitas, Jurusan, Prodi, Angkatan);
            mhs.setDataBeasiswa(JenisBeasiswa, NominalBeasiswa);
            
            System.out.println("\n=== DATA MAHASISWA BEASISWA ===");
            mhs.printDataBeasiswa();
        }
    }
}