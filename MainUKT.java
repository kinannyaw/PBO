/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class MainUKT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("   SISTEM SIMULASI PEMBAYARAN UKT MAHASISWA");
        System.out.println("==================================================");
        
//        koneksi.getKoneksi();

        // 1. Input Data Identitas Mahasiswa
        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM            : ");
        String nim = input.nextLine();

        // 2. Pilih Kategori Mahasiswa
        System.out.println("\nPilih Kategori Mahasiswa:");
        System.out.println("1. Mahasiswa Reguler");
        System.out.println("2. Mahasiswa Beasiswa (Bebas UKT)");
        System.out.print("Pilihan (1/2): ");
        int pilihan = input.nextInt();

        // Variabel bertipe Parent Class (Konsep Polimorfisme)
        Mahasiswa mhs;

        if (pilihan == 1) {
            // === JIKA MAHASISWA REGULER ===
            mhs = new MahasiswaReguler(nama, nim);

            System.out.print("\nMasukkan Nominal UKT    : Rp ");
            double uktNominal = input.nextDouble();

            System.out.println("\nApakah Pembayaran Terlambat?");
            System.out.println("1. Ya (Terkena Denda)");
            System.out.println("2. Tidak (Tepat Waktu)");
            System.out.print("Pilihan (1/2): ");
            int statusTelat = input.nextInt();

            System.out.println("\n--------------------------------------------------");
            System.out.println("                HASIL PERHITUNGAN");
            System.out.println("--------------------------------------------------");
            System.out.println("Nama Mahasiswa : " + mhs.nama);
            System.out.println("NIM            : " + mhs.nim);
            System.out.println("Kategori       : Mahasiswa Reguler");

            double totalAkhir = 0;

            if (statusTelat == 1) {
                System.out.print("Masukkan Nominal Denda  : Rp ");
                double denda = input.nextDouble();

                // OVERLOADING (2 Parameter: Nominal UKT + Denda)
                totalAkhir = mhs.hitungUKT(uktNominal, denda);
                System.out.println("Status Pembayaran       : TERLAMBAT");
                System.out.println("Total Bayar (+ Denda)   : Rp " + totalAkhir);
            } 
            else {
                // OVERRIDING (1 Parameter: Nominal UKT)
                totalAkhir = mhs.hitungUKT(uktNominal);
                System.out.println("Status Pembayaran       : TEPAT WAKTU");
                System.out.println("Total Bayar UKT         : Rp " + totalAkhir);
            }

            // SIMPAN DATA REGULER KE MYSQL
//            koneksi.simpanMahasiswa(mhs.nim, mhs.nama, "Mahasiswa Reguler", totalAkhir);

        } else {
            // === JIKA MAHASISWA BEASISWA ===
            mhs = new MahasiswaBeasiswa(nama, nim);
            
            // OVERRIDING: Langsung memanggil hitungUKT(0) yang menghasilkan nilai 0
            double totalUKT = mhs.hitungUKT(0);
            System.out.println("Status Pembayaran       : BEBAS BIAYA UKT");
            System.out.println("Total Bayar UKT         : Rp " + totalUKT);

            // SIMPAN DATA BEASISWA KE MYSQL
//            koneksi.simpanMahasiswa(mhs.nim, mhs.nama, "Mahasiswa Beasiswa", totalUKT);
        }

        System.out.println("--------------------------------------------------");

        input.close();
    }
}