public abstract class TransportVehicle implements Service{
    private String modelName;
    private int wheelsCount;

    public TransportVehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;

    }

    public void updateType() {
        System.out.println("Меняем покрышку - " + this.wheelsCount + " шт.");
    }

    public void check() {
        System.out.println("Проверка оборудования.");
        System.out.println();
    }

}
