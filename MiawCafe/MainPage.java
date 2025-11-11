package MiawCafe;

import java.util.*;

public class MainPage extends Page implements Displayable {
    private Map<String, Page> menuMap = new LinkedHashMap<>();

    public MainPage() {
        super("Menu Utama");
        menuMap.put("1", new MenuPage());
        menuMap.put("2", new OrderPage());
        menuMap.put("3", new ViewOrderPage());
    }

    @Override
    public void displayHeader() {
        System.out.println("=== Miaw Cafe ===");
    }

    @Override
    public void displayFooter() {
        System.out.println("==================");
    }

    @Override
    public void display() {
        showHeader();
        System.out.println("1. Lihat Menu");
        System.out.println("2. Pesan Minuman");
        System.out.println("3. Lihat Pesanan");
        System.out.println("4. Keluar");
        System.out.print("Pilih : ");
    }

    @Override
    public Page handleInput(Scanner sc, OrderManager orders) {
        String input = sc.nextLine();
        if (input.equals("4")) return null;
        return menuMap.getOrDefault(input, this);
    }
}