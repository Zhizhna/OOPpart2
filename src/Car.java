public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Changing car tyre");
    }

    @Override
    public void checkEngine() {
        System.out.println("Checking car engine");
    }
}