public class Car extends Vehicle {
    private final String model;

    private final String brand;
    private final Tyre tyre;
    private final int numberPlate;
    public Car(String model, String brand, Tyre tyre, int height, int length, int breadth, int numberPlate) {
        super(height, length, breadth);
        this.model = model;
        this.brand = brand;
        this.tyre = tyre;
        this.numberPlate = numberPlate;
    }
    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public Tyre getTyre() {
        return tyre;
    }

    @Override
    public String getCarString() {
        return model+brand;
    }
}