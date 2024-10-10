public class Kibbutz {
    private Vehicles[] vehicles_lst;
    private int vehiclesCounter;

    public Kibbutz() {
        this.vehicles_lst = new Vehicles[500];
        this.vehiclesCounter = 0;
    }

    public void addCar(Vehicles vehicle) {
        boolean foundEmpty = false;
        int i = 0;
        while (!foundEmpty && (i < 500)) {
            if (vehicles_lst[i] == null) {
                vehicles_lst[i] = vehicle;
                foundEmpty = true;
                this.vehiclesCounter += 1;
            } else {
                i++;
            }
        }
        if (i == 500) {
            System.out.println("There is not enough space in the kibbutz");
        }
    }

    public Vehicles[] Age15AndSteeringWheel() {
        int count = 0;
        for (Vehicles ve : this.vehicles_lst) {
            if (ve.getCarAge() > 15 && ve.isSteeringWay()) {
                count++;
            }
        }

        Vehicles[] ve_lst = new Vehicles[count];
        count = 0;
        for (Vehicles ve : this.vehicles_lst) {
            if (ve.getCarAge() > 15 && ve.isSteeringWay()) {
                ve_lst[count] = ve;
                count++;
            }
        }
        return ve_lst;
    }

    public int LightCountAndSteeringWheel()
    {
        int count = 0;
        for(Vehicles ve: this.vehicles_lst)
        {
            if(ve instanceof Light)
            {
                if(ve.isSteeringWay())
                {
                    count ++;
                }
            }
        }
        return count;
    }
}
