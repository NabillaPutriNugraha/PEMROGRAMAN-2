import java.util.Scanner;

public class PRAK105_2410817220009_NabillaPutriNugraha {
    public static final double phi = 3.14;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jari - Jari : ");
        double r = input.nextDouble();

        System.out.print("Masukkan Tinggi : ");
        double t = input.nextDouble();

        double volume = phi * r * r * t;
        String hasil = String.format("%.3f", volume);

        System.out.print("Volume tabung dengan jari - jari " + r + " cm dan tinggi " + t + " cm adalah " + hasil + " m3");
    }
}


