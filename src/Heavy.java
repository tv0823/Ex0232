public class Heavy extends Vehicles{
    private int canCarry;

    public Heavy(int carId, int carAge, int wheelsNum, boolean steeringWay, double pEmPerMinute, int canCarry) {
        super(carId, carAge, wheelsNum, steeringWay, pEmPerMinute);
        this.canCarry = canCarry;
    }

    public int getCanCarry() {
        return canCarry;
    }

    public void setCanCarry(int canCarry) {
        this.canCarry = canCarry;
    }

    @Override
    public String toString() {
        return "Heavy{" +
                "canCarry=" + canCarry +
                '}';
    }

    @Override
    public double exhaust()
    {
        return super.exhaust() + (500 * canCarry);
    }
}
