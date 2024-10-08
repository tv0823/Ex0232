public class Bicycle extends Light{
    private boolean haveBasket; //true - have | false - don't have

    public Bicycle(int carId, int carAge, int wheelsNum, boolean steeringWay, double pEmPerMinute, boolean haveEngin, boolean haveBasket) {
        super(carId, carAge, wheelsNum, steeringWay, pEmPerMinute, haveEngin);
        this.haveBasket = haveBasket;
    }

    public boolean isHaveBasket() {
        return haveBasket;
    }

    public void setHaveBasket(boolean haveBasket) {
        this.haveBasket = haveBasket;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "haveBasket=" + haveBasket +
                '}';
    }
}
