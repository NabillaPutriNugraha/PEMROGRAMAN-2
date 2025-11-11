package MiawCafe;

import java.util.Scanner;

public class MenuPage extends Page implements Displayable {
    public MenuPage() {
        super("Menu Minuman");
    }

    @Override
    public void displayHeader() {
        System.out.println("=== Menu Minuman ===");
    }

    @Override
    public void displayFooter() {
        System.out.println("====================");
    }

    @Override
    public void display() {
        showHeader();
        System.out.println("1. Catpurrccino - Rp25.000");
        System.out.println("2. Matcha Meow - Rp27.000");
        System.out.println("3. Vanilla Pawpresso - Rp23.000");
        showFooter();
    }

    @Override
    public Page handleInput(Scanner sc, OrderManager orders) {
        sc.nextLine();
        return new MainPage();
    }
}

