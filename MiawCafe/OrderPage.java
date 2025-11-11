package MiawCafe;

import java.util.Scanner;

public class OrderPage extends Page implements Displayable {

    public OrderPage() {
        super("Pesan Minuman");
    }

    @Override
    public void displayHeader() {
        System.out.println("\n === Pesanan === ");
    }

    @Override
    public void displayFooter() {
        System.out.println("====================\n");
    }

    @Override
    public void display() {
        showHeader();
        System.out.println("Masukkan Nama Minuman");
    }

    @Override
    public Page handleInput(Scanner sc, OrderManager orders) {
        String input = sc.nextLine();
        orders.addOrder(input);
        System.out.println("Miaw ~~ Pesananmu " + input + " sedang dibuat ~~ Miaw");
        sc.nextLine();
        return new MainPage();
    }
}
