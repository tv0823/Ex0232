public class Cart extends Light{
    private double chargeTime;

    public Cart(int carId, int carAge, int wheelsNum, boolean steeringWay, double pEmPerMinute, boolean haveEngin, double chargeTime) {
        super(carId, carAge, wheelsNum, steeringWay, pEmPerMinute, haveEngin);
        this.chargeTime = chargeTime;
    }

    public double getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(double chargeTime) {
        this.chargeTime = chargeTime;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "chargeTime=" + chargeTime +
                '}';
    }

    @Override
    public double exhaust()
    {
        return super.exhaust() + 2;
    }

    public int hitchhikers()
    {
        return 4;
    }
}
