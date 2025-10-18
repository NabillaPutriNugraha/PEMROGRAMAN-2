package soal1;

import java.util.*;

public class DiceMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Dice> dice = new LinkedList<>();

        System.out.println(" ");
        int number = input.nextInt();

        int total = 0;
        for (int i = 0; i < number; i++) {
            Dice d = new Dice();
            dice.add(d);
            System.out.println("Dadu ke - " + (i + 1) + " bernilai " + d.getValue());
            total += d.getValue();
        }

        System.out.println("Total nilai dadu keseluruhan : " + total);
        input.close();
    }
}
