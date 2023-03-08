public class ServiceStation {
    public void check(TransportVehicle transportVehicle) {
        if (transportVehicle != null) {
            System.out.println("Обслуживаем " + transportVehicle.getModelName() + ":");
            transportVehicle.updateType();
            transportVehicle.check();
        }
    }
}
