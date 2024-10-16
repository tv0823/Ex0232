public class BigTruck extends Truck{
    private int truckSize;
    public BigTruck(int carId, int carAge, int wheelsNum, boolean steeringWay, double pEmPerMinute, int canCarry, double maxWeight, int truckSize) {
        super(carId, carAge, wheelsNum, steeringWay, pEmPerMinute, canCarry, maxWeight);
        this.truckSize = truckSize;
    }

    public int getTruckSize() {
        return truckSize;
    }

    public void setTruckSize(int truckSize) {
        this.truckSize = truckSize;
    }

    @Override
    public String toString() {
        return "BigTruck{" +
                "truckSize=" + truckSize +
                '}';
    }
}
