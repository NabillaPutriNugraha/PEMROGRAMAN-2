package Praktikum2.Soal2;

public class Coffee {
    public String coffeeName;
    public String size;
    public double price;
    private String buyer;

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public double getTax() {
        return price * 0.11;
    }

    public void info() {
        System.out.println("Nama Kopi : " + coffeeName);
        System.out.println("Ukuran : " + size);
        System.out.println("Harga : " + "Rp. " + price);
    }
}
