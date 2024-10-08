public class Light extends Vehicles{
    private boolean haveEngin; //true - have | false - don't have

    public Light(int carId, int carAge, int wheelsNum, boolean steeringWay, double pEmPerMinute, boolean haveEngin) {
        super(carId, carAge, wheelsNum, steeringWay, pEmPerMinute);
        this.haveEngin = haveEngin;
    }

    public boolean isHaveEngin() {
        return haveEngin;
    }

    public void setHaveEngin(boolean haveEngin) {
        this.haveEngin = haveEngin;
    }

    @Override
    public String toString() {
        return "Light{" +
                "haveEngin=" + haveEngin +
                '}';
    }
}
