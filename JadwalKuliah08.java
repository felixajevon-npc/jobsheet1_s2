import java.util.Scanner;

public class JadwalKuliah08 {
    public static void main(String[] args) {
        Scanner scanner08 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n08 = scanner08.nextInt();
        scanner08.nextLine();

        String[] namaMataKuliah08 = new String[n08];
        int[] sks08 = new int[n08];
        int[] semester08 = new int[n08];
        String[] hariKuliah08 = new String[n08];

        for (int i = 0; i < n08; i++) {
            System.out.println("\nMata kuliah ke-" + (i + 1));
            System.out.print("Masukkan nama mata kuliah: ");
            namaMataKuliah08[i] = scanner08.nextLine();

            System.out.print("Masukkan SKS: ");
            sks08[i] = scanner08.nextInt();

            System.out.print("Masukkan semester: ");
            semester08[i] = scanner08.nextInt();
            scanner08.nextLine(); 

            System.out.print("Masukkan hari kuliah: ");
            hariKuliah08[i] = scanner08.nextLine();
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Menampilkan seluruh jadwal kuliah");
            System.out.println("2. Menampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Menampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Mencari mata kuliah");
            System.out.println("Ketik 'selesai' untuk keluar.");
            System.out.print("Pilih menu (1/2/3/4): ");

            String pilihan08 = scanner08.nextLine().trim().toLowerCase();

            if (pilihan08.equals("selesai")) {
                System.out.println("Program dihentikan. Terima kasih!");
                break;
            }

            switch (pilihan08) {
                case "1":
                    tampilkanJadwalKuliah08(n08, namaMataKuliah08, sks08, semester08, hariKuliah08);
                    break;
                case "2":
                    System.out.print("Masukkan hari yang ingin ditampilkan (Senin, Selasa, dst.): ");
                    String hari08 = scanner08.nextLine();
                    tampilkanJadwalBerdasarkanHari08(n08, namaMataKuliah08, sks08, semester08, hariKuliah08, hari08);
                    break;
                case "3":
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int semester08Input = scanner08.nextInt();
                    scanner08.nextLine();
                    tampilkanJadwalBerdasarkanSemester08(n08, namaMataKuliah08, sks08, semester08, hariKuliah08,
                            semester08Input);
                    break;
                case "4":
                    System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                    String mataKuliahDicari08 = scanner08.nextLine();
                    cariMataKuliah08(n08, namaMataKuliah08, sks08, semester08, hariKuliah08, mataKuliahDicari08);
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Harap pilih menu yang tersedia.");
            }
        }

        scanner08.close();
    }

    public static void tampilkanJadwalKuliah08(int n08, String[] namaMataKuliah08, int[] sks08, int[] semester08,
            String[] hariKuliah08) {
        System.out.println("\nJadwal Kuliah:");
        for (int i = 0; i < n08; i++) {
            System.out.println((i + 1) + ". " + namaMataKuliah08[i] + " | SKS: " + sks08[i] + " | Semester: "
                    + semester08[i] + " | Hari: " + hariKuliah08[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari08(int n08, String[] namaMataKuliah08, int[] sks08,
            int[] semester08, String[] hariKuliah08, String hari08) {
        boolean ditemukan08 = false;
        System.out.println("\nJadwal Kuliah pada hari " + hari08 + ":");
        for (int i = 0; i < n08; i++) {
            if (hariKuliah08[i].equalsIgnoreCase(hari08)) {
                System.out.println(
                        (i + 1) + ". " + namaMataKuliah08[i] + " | SKS: " + sks08[i] + " | Semester: " + semester08[i]);
                ditemukan08 = true;
            }
        }
        if (!ditemukan08) {
            System.out.println("Tidak ada mata kuliah pada hari " + hari08 + ".");
        }
    }

    public static void tampilkanJadwalBerdasarkanSemester08(int n08, String[] namaMataKuliah08, int[] sks08,
            int[] semester08, String[] hariKuliah08, int semester08Input) {
        boolean ditemukan08 = false;
        System.out.println("\nJadwal Kuliah pada Semester " + semester08Input + ":");
        for (int i = 0; i < n08; i++) {
            if (semester08[i] == semester08Input) {
                System.out.println(
                        (i + 1) + ". " + namaMataKuliah08[i] + " | SKS: " + sks08[i] + " | Hari: " + hariKuliah08[i]);
                ditemukan08 = true;
            }
        }
        if (!ditemukan08) {
            System.out.println("Tidak ada mata kuliah pada semester " + semester08Input + ".");
        }
    }

    public static void cariMataKuliah08(int n08, String[] namaMataKuliah08, int[] sks08, int[] semester08,
            String[] hariKuliah08, String mataKuliahDicari08) {
        boolean ditemukan08 = false;
        System.out.println("\nMencari mata kuliah: " + mataKuliahDicari08);
        for (int i = 0; i < n08; i++) {
            if (namaMataKuliah08[i].equalsIgnoreCase(mataKuliahDicari08)) {
                System.out.println("Mata Kuliah: " + namaMataKuliah08[i] + " | SKS: " + sks08[i] + " | Semester: "
                        + semester08[i] + " | Hari: " + hariKuliah08[i]);
                ditemukan08 = true;
            }
        }
        if (!ditemukan08) {
            System.out.println("Mata kuliah " + mataKuliahDicari08 + " tidak ditemukan.");
        }
    } 
}
