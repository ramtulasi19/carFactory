public abstract class Vehicle {

    private int height;
    private int breadth;
    private int length;

    public Vehicle(int height, int breadth, int length) {
        this.height = height;
        this.breadth = breadth;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }

    public  abstract String getCarString();
}