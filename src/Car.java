public class Car extends Regular{
    private boolean haveKeys; //true - have keys | false - don't have

    public Car(int carId, int carAge, int wheelsNum, boolean steeringWay, double pEmPerMinute, int passengerNum, boolean haveKeys) {
        super(carId, carAge, wheelsNum, steeringWay, pEmPerMinute, passengerNum);
        this.haveKeys = haveKeys;
    }

    public boolean isHaveKeys() {
        return haveKeys;
    }

    public void setHaveKeys(boolean haveKeys) {
        this.haveKeys = haveKeys;
    }

    @Override
    public String toString() {
        return "Car{" +
                "haveKeys=" + haveKeys +
                '}';
    }
}
