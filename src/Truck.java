public class Truck extends Heavy{
    private double maxWeight;

    public Truck(int carId, int carAge, int wheelsNum, boolean steeringWay, double pEmPerMinute, int canCarry, double maxWeight) {
        super(carId, carAge, wheelsNum, steeringWay, pEmPerMinute, canCarry);
        this.maxWeight = maxWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxWeight=" + maxWeight +
                '}';
    }

    @Override
    public double exhaust()
    {
        return super.exhaust() * 1.5;
    }
}
