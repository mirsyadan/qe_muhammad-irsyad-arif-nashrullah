package prioritas2;
public class Prioritas2 {
    
    // Menghitung luas persegi
    public static double getSquareArea(double sisi) {
        return sisi * sisi;
    }

    // Menghitung luas persegi panjang
    public static double getRectangleArea(double panjang, double lebar) {
        return panjang * lebar;
    }
    
    // Menghitung luas lingkaran
    public static double getCircleArea(double radius) {
        double phi = 3.14;
        return phi * radius * radius;
    }
    
    // Menghitung luas trapesium
    public static double getTrapezoidArea(double sisiA, double sisiB, double tinggi) {
        return (sisiA + sisiB) * tinggi / 2;
    }

    public static void main(String[] args) {
        // Input 
        System.out.println("luas persegi: " + getSquareArea(12));
        System.out.println("luas persegi panjang: " + getRectangleArea(7, 8));
        System.out.println("luas lingkaran: " + getCircleArea(21));
        System.out.println("luas trapesium: " + getTrapezoidArea(5, 6, 2));
    }
}