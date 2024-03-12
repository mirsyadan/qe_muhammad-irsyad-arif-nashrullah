package soal2prio1;
import java.util.Scanner;
public class Soal2Prio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan masing-masing nilai panjang dan lebar dari persegi panjang.
        System.out.print("panjang: ");
        int panjang = input.nextInt();
        System.out.print("lebar: ");
        int lebar = input.nextInt();

        // Menghitung nilai luas dari persegi panjang dengan menggunakan rumus (L = p x l ).
        int luas = panjang * lebar;

        // Menampilkan hasil perhitungan nilai luas persegi panjang dengan berdasarkan penggolongan tipe seperti ganjil atau genap.
        if (luas % 2 == 0) {
            System.out.println("even rectangle");
        } else {
            System.out.println("odd rectangle");
        }
    }
}