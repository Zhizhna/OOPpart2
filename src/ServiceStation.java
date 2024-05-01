public class ServiceStation public class ServiceStation {
    public void check(Vehicle vehicle) {
        if (vehicle != null) {
            System.out.println("Servicing " + vehicle.getModelName());
            vehicle.service();
        }
    }
}