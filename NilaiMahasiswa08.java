import java.util.Scanner;

public class NilaiMahasiswa08 {
    public static void main(String[] args) {
        Scanner scanner08 = new Scanner(System.in);

        System.out.print("Masukkan nilai Tugas (0-100): ");
        double nilaiTugas08 = scanner08.nextDouble();
        System.out.print("Masukkan nilai Kuis (0-100): ");
        double nilaiKuis08 = scanner08.nextDouble();
        System.out.print("Masukkan nilai UTS (0-100): ");
        double nilaiUTS08 = scanner08.nextDouble();
        System.out.print("Masukkan nilai UAS (0-100): ");
        double nilaiUAS08 = scanner08.nextDouble();

        if (nilaiTugas08 < 0 || nilaiTugas08 > 100 || nilaiKuis08 < 0 || nilaiKuis08 > 100 ||
                nilaiUTS08 < 0 || nilaiUTS08 > 100 || nilaiUAS08 < 0 || nilaiUAS08 > 100) {
            System.out.println("Nilai tidak valid!");
        } else {
            double nilaiAkhir08 = (0.2 * nilaiTugas08) + (0.2 * nilaiKuis08) +
                    (0.3 * nilaiUTS08) + (0.4 * nilaiUAS08);

            String nilaiHuruf08;
            if (nilaiAkhir08 > 80 && nilaiAkhir08 <= 100) {
                nilaiHuruf08 = "A";
            } else if (nilaiAkhir08 > 73 && nilaiAkhir08 <= 80) {
                nilaiHuruf08 = "B+";
            } else if (nilaiAkhir08 > 65 && nilaiAkhir08 <= 73) {
                nilaiHuruf08 = "B";
            } else if (nilaiAkhir08 > 60 && nilaiAkhir08 <= 65) {
                nilaiHuruf08 = "C+";
            } else if (nilaiAkhir08 > 50 && nilaiAkhir08 <= 60) {
                nilaiHuruf08 = "C";
            } else if (nilaiAkhir08 > 39 && nilaiAkhir08 <= 50) {
                nilaiHuruf08 = "D";
            } else {
                nilaiHuruf08 = "E";
            }

            String nilaiSetara08;
            if (nilaiAkhir08 > 80 && nilaiAkhir08 <= 100) {
                nilaiSetara08 = "4";
            } else if (nilaiAkhir08 > 73 && nilaiAkhir08 <= 80) {
                nilaiSetara08 = "3.5";
            } else if (nilaiAkhir08 > 65 && nilaiAkhir08 <= 73) {
                nilaiSetara08 = "3";
            } else if (nilaiAkhir08 > 60 && nilaiAkhir08 <= 65) {
                nilaiSetara08 = "2.5";
            } else if (nilaiAkhir08 > 50 && nilaiAkhir08 <= 60) {
                nilaiSetara08 = "2";
            } else if (nilaiAkhir08 > 39 && nilaiAkhir08 <= 50) {
                nilaiSetara08 = "1";
            } else {
                nilaiSetara08 = "0";
            }

            String statusLulus08 = (nilaiHuruf08.equals("A") || nilaiHuruf08.equals("B+") ||
                    nilaiHuruf08.equals("B") || nilaiHuruf08.equals("C+") ||
                    nilaiHuruf08.equals("C")) ? "LULUS" : "TIDAK LULUS";

            System.out.println("\n===== HASIL PENILAIAN =====");
            System.out.println("Nilai Akhir : " + nilaiAkhir08);
            System.out.println("Nilai Huruf : " + nilaiHuruf08);
            System.out.println("Nilai Setara : " + nilaiSetara08);
            System.out.println("Keterangan  : " + statusLulus08);
        }

        scanner08.close();
    }
}
