import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Variabel
        int angka = 10;

        // Tipe data
        double pi = 3.14;

        // For loop
        for (int i = 0; i < angka; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap.");
            }
        }

        // While loop
        int j = 0;
        while (j < angka) {
            System.out.println("Ini adalah perulangan while ke-" + j);
            j++;
        }

        // Do-While loop
        int k = 0;
        do {
            System.out.println("Ini adalah perulangan do-while ke-" + k);
            k++;
        } while (k < angka);

        // Array satu dimensi
        int[] arrSatuDimensi = {1, 2, 3, 4, 5};

        // Array multidimensi
        int[][] arrMultiDimensi = {{1, 2, 3}, {4, 5, 6}};

        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int input = scanner.nextInt();

        // Output
        System.out.println("Angka yang Anda masukkan adalah: " + input);

        // Comment
        // Ini adalah contoh komentar dalam Java
    }
}
