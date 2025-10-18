package soal1;

public class Dice {
    private int value;

    public Dice() {
        randomValue();
    }

    public int getValue() {
        return value;
    }

    public void randomValue() {
        this.value = (int)(Math.random()* 6) + 1;
    }
}
