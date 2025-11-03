package soal1;

public abstract class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    protected abstract double area();

    public String toString() {
        return shapeName;
    }
}