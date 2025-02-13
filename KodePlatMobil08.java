import java.util.Scanner;

public class KodePlatMobil08 {
    public static void main(String[] args) {
        Scanner scanner08 = new Scanner(System.in);

        char[] kodePlat08 = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };

        String[][] kota08 = {
                { "A", "Banten" },
                { "B", "Jakarta" },
                { "D", "Bandung" },
                { "E", "Cirebon" },
                { "F", "Bogor" },
                { "G", "Pekalongan" },
                { "H", "Semarang" },
                { "L", "Surabaya" },
                { "N", "Malang" },
                { "T", "Tegal" }
        };

        System.out.println("Daftar Kode Plat Mobil:");
        for (int i = 0; i < kodePlat08.length; i++) {
            System.out.println(kodePlat08[i] + " - " + kota08[i][1]);
        }

        System.out.print("\nMasukkan kode plat mobil: ");
        char inputKode08 = scanner08.next().charAt(0);
        inputKode08 = Character.toUpperCase(inputKode08);

        boolean ditemukan08 = false;
        for (int i = 0; i < kodePlat08.length; i++) {
            if (kodePlat08[i] == inputKode08) {
                System.out.println("Kode plat " + inputKode08 + " adalah untuk kota " + kota08[i][1]);
                ditemukan08 = true;
                break;
            }
        }

        if (!ditemukan08) {
            System.out.println("Kode plat " + inputKode08 + " tidak ditemukan.");
        }

        scanner08.close();
    }
}