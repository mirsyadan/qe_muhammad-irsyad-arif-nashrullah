package soal1prio2;
import java.util.Scanner;
public class Soal1Prio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Memasukkan total jumlah angka yang ingin ditampilkan.
        System.out.print("Jumlah angka: ");
        int TotalJumlahAngka = input.nextInt();
        
        // Input nilai n
        System.out.print("Nilai n: ");
        int nilaiN = input.nextInt();

        // Menampilkan angka yang habis dibagi dengan n sebanyak 20 angka
        System.out.print("Jumlah total angka yang habis dibagi dengan " + nilaiN + ": ");
        int counter = 0;
        for (int i = 1; counter < TotalJumlahAngka; i++) {
            if (i % nilaiN == 0) {
                System.out.print(i + " ");
                counter++;
            }
        }
    }
}