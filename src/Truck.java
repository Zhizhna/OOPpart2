public class Truck extends Vehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Changing truck tyre");
    }

    @Override
    public void checkEngine() {
        System.out.println("Checking truck engine");
    }

    public void checkTrailer() {
        System.out.println("Checking truck trailer");
    }
}