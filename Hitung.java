import java.util.ArrayList;
import java.util.Scanner;

public class Hitung {
    
    static ArrayList<Integer> nilaiList = new ArrayList<>();

    static double hitungRataRata() {
        int total = 0;
        for (int nilai : nilaiList) {
            total += nilai;
        }
        return (double) total / nilaiList.size();
    }

    static int hitungNilaiMinimal() {
        int nilaiMin = nilaiList.get(0); 
        for (int nilai : nilaiList) {
            if (nilai < nilaiMin) { 
                nilaiMin = nilai;
            }
        }
        return nilaiMin;
    }

    static int hitungNilaiMaksimal() {
        int nilaiMax = nilaiList.get(0); 
        for (int nilai : nilaiList) { 
            if (nilai > nilaiMax) {
                nilaiMax = nilai; 
            }
        }
        return nilaiMax; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int nilai;

        while (true) {
            System.out.print("Masukkan nilai (atau pilih 'T' untuk selesai): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("T")) {
                break;
            } else {
                if (isNumeric(input)) {
                    nilai = Integer.parseInt(input);
                    nilaiList.add(nilai); 
                } else {
                    System.out.println("Input tidak valid, coba lagi.");
                }
            }
        }

        if (nilaiList.size() > 0) {
            System.out.println("Nilai minimal: " + hitungNilaiMinimal());
            System.out.println("Nilai maksimal: " + hitungNilaiMaksimal());
            System.out.println("Nilai rata-rata: " + hitungRataRata());
        } else {
            System.out.println("Tidak ada nilai yang dimasukkan.");
        }

        scanner.close();
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true; 
        } catch (NumberFormatException e) {
            return false; 
        }
    }
}
