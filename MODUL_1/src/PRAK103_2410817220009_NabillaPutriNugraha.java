import java.util.Scanner;

public class PRAK103_2410817220009_NabillaPutriNugraha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" ");
        int N = input.nextInt();

        System.out.print(" ");
        int number = input.nextInt();

        int sequence = 0;
        do {
            if (number % 2 != 0) {
                System.out.print(number);
                sequence++;
                if (sequence < N) {
                    System.out.print(", ");
                }
            }
            number++;
        } while (sequence < N);
    }
}
