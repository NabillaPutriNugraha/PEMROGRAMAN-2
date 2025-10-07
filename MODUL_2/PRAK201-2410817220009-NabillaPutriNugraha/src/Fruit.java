public class Fruit {
    private String name;
    private double weight;
    private double price;
    private double quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double priceBeforeDiscount() {
        return (quantity / weight) * price;
    }

    public double TotalDiscount() {
        return (int) (quantity / 4) * (price * 4) * 0.02;
    }

    public double priceAfterDiscount() {
        return priceBeforeDiscount() - TotalDiscount();
    }

    public void print() {
        System.out.println("Nama Buah : " + getName());
        System.out.println("Berat : " + getWeight());
        System.out.println("Harga : " + getPrice());
        System.out.println("Jumlah Beli : " + getQuantity() + " kg");
        System.out.println("Harga Sebelum Diskon : " + "Rp" + priceBeforeDiscount());
        System.out.println("Total Diskon : " + "Rp" + TotalDiscount());
        System.out.println("Harga Setelah Diskon : " + "Rp" + priceAfterDiscount());
        System.out.println("");
    }
}