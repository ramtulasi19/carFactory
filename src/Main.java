public class Main {
    public static void main(String[] args) {
        Tyre tyre1 = new TyreImpl("black", "MRF", 30 );
        Car varshaCar = new Car("hachBack", "Mazda", tyre1, 20, 50, 30, 1224);

        System.out.println(varshaCar.getBrand());
        System.out.println(varshaCar.getModel());
        System.out.println(varshaCar.getTyre().getWheelInformation());
        System.out.println(varshaCar.getHeight());
        System.out.println(varshaCar.getCarString());
    }
}
