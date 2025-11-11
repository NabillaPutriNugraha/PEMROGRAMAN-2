package MiawCafe;

import java.util.*;

public class ViewOrderPage extends Page implements Displayable {
    public ViewOrderPage() {
        super("Lihat Pesanan");
    }

    @Override
    public void displayHeader() {
        System.out.println("=== Daftar Pesanan ===");
    }

    @Override
    public void displayFooter() {
        System.out.println("=======================");
    }

    @Override
    public void display() {
        showHeader();
        System.out.println("Tekan ENTER untuk menampilkan daftar pesanan");
        showFooter();
    }

    @Override
    public Page handleInput(Scanner sc, OrderManager orders) {
        List<String> list = orders.getOrders();
        System.out.println("\n=== Daftar Pesanan ===");
        if (list.isEmpty()) {
            System.out.println("Pesanan tidak ditemukan");
        } else {
            for (String item : list) {
                System.out.println("- " + item);
            }
        }
        sc.nextLine();
        return new MainPage();
    }
}
