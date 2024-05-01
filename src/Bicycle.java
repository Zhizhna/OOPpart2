public class Bicycle extends Vehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        updateTyre();
    }

    private void updateTyre() {
        System.out.println("Changing bicycle tyre");
    }
}
