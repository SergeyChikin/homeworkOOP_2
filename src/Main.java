public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan Almera", 4);
        Car car2 = new Car("Mitsubishi Pajero", 4);


        Truck truck = new Truck("KAMAZ", 10);
        Truck truck2 = new Truck("FREIGHTLINER", 18);


        Bicycle bicycle = new Bicycle("Yamaha", 2);
        Bicycle bicycle2 = new Bicycle("Kawasaki", 2);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check( bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}