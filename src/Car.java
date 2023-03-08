public class Car extends TransportVehicle{

    public Car(String modeName, int wheelsCount) {
        super(modeName, wheelsCount);
    }
    @Override
    public void check() {
        System.out.println("Проверяем двигатель");
        System.out.println();
    }
}
