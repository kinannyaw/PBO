import java.util.Scanner;

public class MainMahasiswaPrivat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM                : ");
        String nimInput = input.nextLine();

        System.out.print("Masukkan IPK Pertama (Valid): ");
        double ipkPertama = input.nextDouble();

        MahasiswaPrivat mhs = new MahasiswaPrivat(nimInput, ipkPertama);

        System.out.println("IPK Valid  : " + mhs.getIpk());
        System.out.println("------------------------------------------");

        System.out.print("Masukkan IPK Kedua (Uji Error): ");
        double ipkKedua = input.nextDouble();

        mhs.setIpk(ipkKedua);

        input.close();
    }
}