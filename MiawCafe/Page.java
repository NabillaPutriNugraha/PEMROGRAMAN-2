package MiawCafe;

import java.util.Scanner;

public abstract class Page {
    protected String title;

    public Page(String title) {
        this.title = title;
    }

    public void showHeader() {
        System.out.println("======================================");
        System.out.println("         Welcome to Miaw Cafe!        ");
        System.out.println("======================================");
        System.out.println("Page : " + title);
        System.out.println("--------------------------------------");
    }

    public void showFooter() {
        System.out.println("--------------------------------------");
        System.out.println("Press ENTER to return to the main menu");
        System.out.println("======================================");
    }
    public abstract void display();
    public abstract Page handleInput(Scanner sc, OrderManager orders);
}
