import java.util.Scanner;

public class DeretBilangan08 {
    public static void main(String[] args) {
        Scanner scanner08 = new Scanner(System.in);

        System.out.print("Masukkan NIM Anda: ");
        String nim08 = scanner08.nextLine();

        int panjangNIM08 = nim08.length();
        int n08 = Integer.parseInt(nim08.substring(panjangNIM08 - 2));

        if (n08 < 10) {
            n08 += 10;
        } 

        System.out.print("OUTPUT : ");
        for (int i08 = 1; i08 <= n08; i08++) {
            if (i08 == 6 || i08 == 10) {
                continue;
            }

            if (i08 % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i08 + " ");
            }
        }

        scanner08.close();
    }
}
