import java.util.Scanner;

public class Kubus08 {
    public static void main(String[] args) {
        Scanner scanner08 = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("Ketik 'selesai' untuk keluar.");
            System.out.print("Pilih menu (1/2/3): ");

            String input08 = scanner08.nextLine().trim().toLowerCase();

            if (input08.equalsIgnoreCase("selesai")) {
                System.out.println("Program dihentikan. Terima kasih!");
                break;
            }

            int pilihan08 = -1;
            if (input08.equals("1")) {
                pilihan08 = 1;
            } else if (input08.equals("2")) {
                pilihan08 = 2;
            } else if (input08.equals("3")) {
                pilihan08 = 3;
            }

            if (pilihan08 == -1) {
                System.out
                        .println("Input tidak valid! Harap masukkan angka 1, 2, 3 atau ketik 'selesai' untuk keluar.");
                continue;
            }

            System.out.print("Masukkan panjang rusuk kubus: ");
            double rusuk08 = scanner08.nextDouble();
            scanner08.nextLine();
 
            switch (pilihan08) {
                case 1:
                    double volume08 = hitungVolumeKubus08(rusuk08);
                    System.out.println("Volume Kubus: " + volume08);
                    break;
                case 2:
                    double luasPermukaan08 = hitungLuasPermukaanKubus08(rusuk08);
                    System.out.println("Luas Permukaan Kubus: " + luasPermukaan08);
                    break;
                case 3:
                    double keliling08 = hitungKelilingKubus08(rusuk08);
                    System.out.println("Keliling Kubus: " + keliling08);
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Harap pilih menu 1, 2, atau 3.");
                    break;
            }
        }

        scanner08.close();
    }

    public static double hitungVolumeKubus08(double rusuk08) {
        return Math.pow(rusuk08, 3);
    }

    public static double hitungLuasPermukaanKubus08(double rusuk08) {
        return 6 * Math.pow(rusuk08, 2);
    }

    public static double hitungKelilingKubus08(double rusuk08) {
        return 12 * rusuk08;
    }
}
