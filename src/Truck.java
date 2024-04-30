public class Truck extends Vehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }

    private void updateTyre() {
        System.out.println("Changing truck tyre");
    }

    private void checkEngine() {
        System.out.println("Checking truck engine");
    }

    private void checkTrailer() {
        System.out.println("Checking truck trailer");
    }
}