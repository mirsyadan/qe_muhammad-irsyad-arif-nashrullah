package soal2prio2;
import java.util.Scanner;
public class Soal2Prio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan kata yang ingin diganti huruf vokalnya.
        System.out.print("Kata: ");
        String kata = input.nextLine();

        // Mengganti salah satu huruf vokal menjadi sebuah angka.
        kata = kata.replace('a', '4');
        kata = kata.replace('e', '3');
        kata = kata.replace('i', '1');
        kata = kata.replace('o', '0');

        // Hasil pergantian huruf vokal dari kata yang telah dimasukkan.
        System.out.println("Hasil: " + kata);
    }
}