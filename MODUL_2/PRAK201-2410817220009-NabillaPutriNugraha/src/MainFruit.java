public class MainFruit {
    public static void main(String[] args) {

        Fruit Apple = new Fruit();
        Apple.setName("Apel");
        Apple.setWeight(0.4);
        Apple.setPrice(7000);
        Apple.setQuantity(40);

        Fruit Mango = new Fruit();
        Mango.setName("Mangga");
        Mango.setWeight(0.2);
        Mango.setPrice(3500);
        Mango.setQuantity(15);

        Fruit Avocado = new Fruit();
        Avocado.setName("Alpukat");
        Avocado.setWeight(0.25);
        Avocado.setPrice(10000);
        Avocado.setQuantity(12);

        Apple.print();
        Mango.print();
        Avocado.print();
    }
}