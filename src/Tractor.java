public class Tractor extends Heavy{
    private String carryType;

    public Tractor(int carId, int carAge, int wheelsNum, boolean steeringWay, double pEmPerMinute, int canCarry, String carryType) {
        super(carId, carAge, wheelsNum, steeringWay, pEmPerMinute, canCarry);
        this.carryType = carryType;
    }

    public String getCarryType() {
        return carryType;
    }

    public void setCarryType(String carryType) {
        this.carryType = carryType;
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "carryType='" + carryType + '\'' +
                '}';
    }
}
