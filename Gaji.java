import java.util.Scanner;

public class Gaji {
    public static int masaKerja;

    public static int hitungGaji() {
        if (masaKerja < 5) {
            return 5000000;
        } else if (masaKerja >= 5 && masaKerja <= 10) {
            return 7500000;
        } else {
            return 10000000;
        }
    }

    public static int hitungUangLembur(int jumlahJamLembur) {
        int honorPerJam;
        if (masaKerja < 5) {
            honorPerJam = 40000;
        } else if (masaKerja >= 5 && masaKerja <= 10) {
            honorPerJam = 50000;
        } else {
            honorPerJam = 75000;
        }
        return honorPerJam * jumlahJamLembur;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan masa kerja (dalam tahun): ");
        masaKerja = scanner.nextInt();

        System.out.print("Masukkan jumlah jam lembur: ");
        int jumlahJamLembur = scanner.nextInt();

        int gaji = hitungGaji();
        int uangLembur = hitungUangLembur(jumlahJamLembur);
        int totalGaji = gaji + uangLembur;

        System.out.println("Gaji pokok: " + gaji);
        System.out.println("Uang lembur: " + uangLembur);
        System.out.println("Total gaji: " + totalGaji);
        
    }
}
