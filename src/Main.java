public class Main {
    public double CalculateExhaust(Vehicles[] vehicles_lst)
    {
        double sum = 0;
        for(Vehicles ve: vehicles_lst)
        {
            sum += ve.exhaust();
        }
        return sum;
    }

    public void noiseAmount(Vehicles[] vehicles_lst)
    {
        for(Vehicles ve: vehicles_lst)
        {
            if(ve instanceof Regular)
            {
                ((Regular) ve).noise();
            }
        }
    }

    public int sumPassengersNoDriver(Vehicles[] vehicles_lst)
    {
        int sum = 0;
        for(Vehicles ve: vehicles_lst)
        {
            if(ve instanceof Regular)
            {
                sum += ((Regular) ve).getPassengerNum() - 1;
            }
            else if (ve instanceof Bicycle)
            {
                if(((Bicycle) ve).isHaveBasket())
                {
                    sum += 1;
                }
            }
        }
        return sum;
    }

    public int LowestChargingTime(Vehicles[] vehicles_lst)
    {
        double lowest = 0.0;
        int carId = 0;
        double temp;
        for(Vehicles ve: vehicles_lst)
        {
            if(ve instanceof Cart)
            {
                temp = ((Cart) ve).getChargeTime();
                if(temp > lowest)
                {
                    lowest = temp;
                    carId = ve.getCarId();
                }
            }
        }
        return carId;
    }
}
