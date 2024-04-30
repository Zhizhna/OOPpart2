public class Car extends Vehicle {
public Car(String modelName, int wheelsCount) {
    super(modelName, wheelsCount);
}

@Override
public void service() {
    updateTyre();
    checkEngine();
}

private void updateTyre() {
    System.out.println("Changing car tyre");
}

private void checkEngine() {
    System.out.println("Checking car engine");
}
}