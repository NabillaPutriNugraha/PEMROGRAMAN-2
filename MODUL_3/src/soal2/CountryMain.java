package soal2;

import java.util.*;

public class CountryMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<Integer, String> monthName = new HashMap<>();
        monthName.put(1, "Januari");
        monthName.put(2, "Februari");
        monthName.put(3, "Maret");
        monthName.put(4, "April");
        monthName.put(5, "Mei");
        monthName.put(6, "Juni");
        monthName.put(7, "Juli");
        monthName.put(8, "Agustus");
        monthName.put(9, "September");
        monthName.put(10, "Oktober");
        monthName.put(11, "November");
        monthName.put(12, "Desember");

        LinkedList<Country> countries = new LinkedList<>();

        System.out.print(" ");
        int number = input.nextInt();
        input.nextLine();

        for (int i = 0; i < number; i++) {
            System.out.print(" ");
            String name = input.nextLine();

            System.out.print(" ");
            String leadership = input.nextLine();

            System.out.print(" ");
            String leader =  input.nextLine();

            if (leadership.equalsIgnoreCase("Monarki")) {
                Country c = new Country(name, leadership, leader);
                countries.add(c);
            } else {
                System.out.print(" ");
                int independenceDay = input.nextInt();

                System.out.print(" ");
                int independenceMonth = input.nextInt();

                System.out.print(" ");
                int independenceYear = input.nextInt();
                input.nextLine();

                Country c = new Country(name, leadership, leader, independenceDay, independenceMonth, independenceYear);
                countries.add(c);
            }
        }

        for (Country c : countries) {
            if (c.getLeadership().equalsIgnoreCase("Monarki")) {
                c.info("");
            } else {
                String month = monthName.get(c.getIndependenceMonth());
                c.info(month);
            }
        }

        input.close();
    }
}
