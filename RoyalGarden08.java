public class RoyalGarden08 {
    static int[][] stockBunga08 = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };

    static int[] hargaBunga08 = { 75000, 50000, 60000, 10000 };

    static int[] penguranganStock08 = { 1, 2, 0, 5 };

    public static void hitungPendapatan08() {
        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");

        for (int i = 0; i < stockBunga08.length; i++) {
            int totalPendapatan08 = 0;
            for (int j = 0; j < stockBunga08[i].length; j++) {
                totalPendapatan08 += stockBunga08[i][j] * hargaBunga08[j];
            }
            System.out.printf("RoyalGarden %d: Rp %,d%n", (i + 1), totalPendapatan08);
        }
    }

    public static void hitungStockCabang408() {
        System.out.println("\nJumlah Stock setiap jenis bunga di RoyalGarden 4 setelah pengurangan:");

        String[] namaBunga08 = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
        for (int i = 0; i < stockBunga08[3].length; i++) {
            int stockAkhir08 = stockBunga08[3][i] - penguranganStock08[i];
            System.out.printf("%s: %d%n", namaBunga08[i], stockAkhir08);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Program RoyalGarden ===\n");

        hitungPendapatan08();

        hitungStockCabang408();
    }
}