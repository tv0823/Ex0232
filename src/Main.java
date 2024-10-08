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
                sum += ((Regular) ve).getPassengerNum();
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
        int lowest = 0;
        for(Vehicles ve: vehicles_lst)
        {
            if(ve instanceof Cart)
            {
                ((Cart) ve).getChargeTime();
            }
        }

    }
}
