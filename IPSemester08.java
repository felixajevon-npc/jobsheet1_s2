import java.util.Scanner;

public class IPSemester08 {
    public static void main(String[] args) {
        Scanner scanner08 = new Scanner(System.in);

        String[] mataKuliah08 = {
                "Bahasa Indonesia",
                "Pengantar Akuntansi, Manajemen, dan Bisnis",
                "Agama",
                "Critical Thinking dan Problem Solving",
                "Praktikum Dasar Pemrograman",
                "Konsep Teknologi Informasi",
                "Dasar Pemrograman",
                "Bahasa Inggris Dasar",
                "Matematika Dasar"
        }; 

        int[] sksMataKuliah08 = { 2, 2, 2, 2, 3, 2, 2, 2, 2 };

        double[] nilaiAngka08 = new double[mataKuliah08.length];
        String[] nilaiHuruf08 = new String[mataKuliah08.length];
        double[] bobotNilai08 = new double[mataKuliah08.length];

        System.out.println("Program Menghitung IP Semester\n");

        for (int i = 0; i < mataKuliah08.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + mataKuliah08[i] + ": ");
            nilaiAngka08[i] = scanner08.nextDouble();

            if (nilaiAngka08[i] < 0 || nilaiAngka08[i] > 100) {
                System.out.println("Nilai tidak valid! Harus antara 0 - 100.");
                i--;
                continue;
            }

            if (nilaiAngka08[i] >= 80) {
                nilaiHuruf08[i] = "A";
                bobotNilai08[i] = 4.00;
            } else if (nilaiAngka08[i] >= 73) {
                nilaiHuruf08[i] = "B+";
                bobotNilai08[i] = 3.50;
            } else if (nilaiAngka08[i] >= 65) {
                nilaiHuruf08[i] = "B";
                bobotNilai08[i] = 3.00;
            } else if (nilaiAngka08[i] >= 60) {
                nilaiHuruf08[i] = "C+";
                bobotNilai08[i] = 2.50;
            } else if (nilaiAngka08[i] >= 50) {
                nilaiHuruf08[i] = "C";
                bobotNilai08[i] = 2.00;
            } else if (nilaiAngka08[i] >= 40) {
                nilaiHuruf08[i] = "D";
                bobotNilai08[i] = 1.00;
            } else {
                nilaiHuruf08[i] = "E";
                bobotNilai08[i] = 0.00;
            }
        }

        double totalBobotSKS08 = 0;
        int totalSKS08 = 0;

        for (int i = 0; i < mataKuliah08.length; i++) {
            totalBobotSKS08 += bobotNilai08[i] * sksMataKuliah08[i];
            totalSKS08 += sksMataKuliah08[i];
        }

        double ipSemester08 = totalBobotSKS08 / totalSKS08;

        // Menampilkan Hasil
        System.out.println("\nHasil Konversi Nilai");
        System.out.printf("%-40s %-8s %-8s %-8s %-8s%n", "Mata Kuliah", "SKS", "Nilai", "Huruf", "Bobot");
        System.out.println("---------------------------------------------------------------------------");

        for (int i = 0; i < mataKuliah08.length; i++) {
            System.out.printf("%-40s %-8d %-8.2f %-8s %-8.2f%n",
                    mataKuliah08[i], sksMataKuliah08[i], nilaiAngka08[i], nilaiHuruf08[i], bobotNilai08[i]);
        }

        System.out.printf("\nTotal SKS: %d\n", totalSKS08);
        System.out.printf("IP Semester: %.2f\n", ipSemester08);

        scanner08.close();
    }
}
