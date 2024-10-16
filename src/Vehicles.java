public class Vehicles{
    private int carId;
    private int carAge;
    private int wheelsNum;
    private boolean steeringWay; //true - wheel | false - kidon
    private double pEmPerMinute;

    public Vehicles(int carId, int carAge, int wheelsNum, boolean steeringWay, double pEmPerMinute) {
        this.carId = carId;
        this.carAge = carAge;
        this.wheelsNum = wheelsNum;
        this.steeringWay = steeringWay;
        this.pEmPerMinute = pEmPerMinute;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getWheelsNum() {
        return wheelsNum;
    }

    public void setWheelsNum(int wheelsNum) {
        this.wheelsNum = wheelsNum;
    }

    public boolean isSteeringWay() {
        return steeringWay;
    }

    public void setSteeringWay(boolean steeringWay) {
        this.steeringWay = steeringWay;
    }

    public double getpEmPerMinute() {
        return pEmPerMinute;
    }

    public void setpEmPerMinute(double pEmPerMinute) {
        this.pEmPerMinute = pEmPerMinute;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "carId=" + carId +
                ", carAge=" + carAge +
                ", wheelsNum=" + wheelsNum +
                ", steeringWay=" + steeringWay +
                ", pEmPerMinute=" + pEmPerMinute +
                '}';
    }

    public double exhaust()
    {
        return pEmPerMinute * 60 * 24;
    }
}