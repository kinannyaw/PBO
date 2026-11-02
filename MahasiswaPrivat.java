public class MahasiswaPrivat {
    private final String nim;
    private double ipk; 

    public MahasiswaPrivat(String nim, double ipkAwal) {
        this.nim = nim;
        setIpk(ipkAwal); 
    }

    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            this.ipk = ipkBaru;
        } else {
            System.out.println("Error: Nilai IPK tidak valid!");
        }
    }
}