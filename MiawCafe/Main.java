package MiawCafe;

public class Main {
    public static void main(String[] args) {
        CLI cli = new CLI(new MainPage(), new OrderManager());
        cli.start();
    }
}
