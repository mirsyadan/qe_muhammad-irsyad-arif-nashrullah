package soal1prio1;
import java.util.Scanner;
public class Soal1Prio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan total berat paket.
        System.out.print("Berat paket (kg): ");
        double beratPaket = input.nextDouble();

        // Memasukkan total jarak tempuh ke tujuan.
        System.out.print("Jarak tempuh (km): ");
        double jarakTempuhTujuan = input.nextDouble();

        // Menghitung jumlah total biaya keseluruhan pengiriman paket dengan berdasarkan jumlah total berat paket.
        double biayaBeratPaket;
        if (beratPaket < 2) {
            biayaBeratPaket = 10000;
        } else if (beratPaket >= 2 && beratPaket <= 7) {
            biayaBeratPaket = 15000;
        } else if (beratPaket > 7 && beratPaket <= 15) {
            biayaBeratPaket = 25000;
        } else {
            biayaBeratPaket = 40000;
        }

        // Menghitung jumlah total biaya keseluruhan pengiriman paket dengan berdasarkan jumlah total jarak tempuh ke tujuan.
        double biayaJarakTempuhTujuan;
        if (jarakTempuhTujuan < 1) {
            biayaJarakTempuhTujuan = 2000;
        } else if (jarakTempuhTujuan >= 1 && jarakTempuhTujuan <= 7) {
            biayaJarakTempuhTujuan = 5000;
        } else if (jarakTempuhTujuan > 7 && jarakTempuhTujuan <= 15) {
            biayaJarakTempuhTujuan = 10000;
        } else {
            biayaJarakTempuhTujuan = 20000;
        }

        // Menapilkan jumlah total biaya keseluruhan pengiriman paket dari hasil perhitungan.
        double totalBiayaKeseluruhan = biayaBeratPaket + biayaJarakTempuhTujuan;
        System.out.println("Biaya: Rp " + totalBiayaKeseluruhan);
    }
}