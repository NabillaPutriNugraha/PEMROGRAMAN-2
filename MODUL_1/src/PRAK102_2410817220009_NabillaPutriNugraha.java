import java.util.Scanner;

public class PRAK102_2410817220009_NabillaPutriNugraha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" ");
        int number = input.nextInt();
        int count = 0;

        while (count < 11) {
            int tampil = number;

            if (number % 5 == 0) {
                tampil = (number / 5) - 1;
            }

            System.out.print(tampil);
            if (count < 10) {
                System.out.print(", ");
            }

            number++;
            count++;
        }

        input.close();
    }
}
