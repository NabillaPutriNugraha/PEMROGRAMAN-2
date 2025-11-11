package MiawCafe;

import java.util.Scanner;

public class CLI {
    private Scanner sc = new Scanner(System.in);
    private Page page;
    private OrderManager orders;

    public CLI(Page page, OrderManager orders) {
        this.page = page;
        this.orders = orders;
    }

    public void start() {
        while(page != null) {
            page.display();
            page = page.handleInput(sc, orders);
        }
        System.out.println("Terima kasih sudah mampir ke Miaw Café! =^.^=");
    }
}
