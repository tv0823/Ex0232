public class Regular extends Vehicles{
    private int passengerNum;

    public Regular(int carId, int carAge, int wheelsNum, boolean steeringWay, double pEmPerMinute, int passengerNum) {
        super(carId, carAge, wheelsNum, steeringWay, pEmPerMinute);
        this.passengerNum = passengerNum;
    }

    public int getPassengerNum() {
        return passengerNum;
    }

    public void setPassengerNum(int passengerNum) {
        this.passengerNum = passengerNum;
    }

    @Override
    public String toString() {
        return "Regular{" +
                "passengerNum=" + passengerNum +
                '}';
    }

    @Override
    public double exhaust()
    {
        return super.exhaust() + 1;
    }

    public void noise()
    {
        System.out.println("Noise");
    }

    public int hitchhikers()
    {
        return 2;
    }
}
