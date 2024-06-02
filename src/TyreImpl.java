public class TyreImpl implements Tyre{



    private final String color;
    private final String model;
    private final int diameter;

    public TyreImpl(String color, String model, int diameter) {
        this.color = color;
        this.model = model;
        this.diameter = diameter;
    }

    @Override
    public String getWheelInformation(){
        return color + model + diameter;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getDiameter() {
        return diameter;
    }
}
