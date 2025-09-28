import java.util.Scanner;

public class PRAK104_2410817220009_NabillaPutriNugraha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu : ");
        String[] handA = input.nextLine().split(" ");

        System.out.print("Tangan Bagas : ");
        String[] handB = input.nextLine().split(" ");

        int poinAbu = 0, poinBagas = 0;
        for (int i = 0; i < 3; i++) {
            String a = handA[i];
            String b = handB[i];

            if (a.equals(b)) {
            } else if ((a.equals("B") && b.equals("G")) || (a.equals("G") && b.equals("K")) || (a.equals("K") && b.equals("B"))) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }

        if (poinAbu > poinBagas) {
            System.out.print("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.print("Bagas");
        } else {
            System.out.print("Seri");
        }
    }
}
