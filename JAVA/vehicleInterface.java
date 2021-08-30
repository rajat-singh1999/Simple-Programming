interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    static void infoVehicle(){
        System.out.println("This is a vehicle method.");
    }
    void applyBrake(int a);
}

interface Carrier{
    final int capacity = 50;
    void load(int a);
    default void infoCarrier(){
        System.out.println("This is a Carrier interface.");
    }
    void unload();
}

class Truck implements Vehicle, Carrier{
    int currentLoad;
    int speed;
    int gear;

    Truck(){
        currentLoad=0;
        speed=0;
        gear=0;
    }

    @Override
    public void changeGear(int a){
        gear = a;
    }

    @Override
    public void speedUp(int a){
        speed = speed + a;
    }

    @Override
    public void applyBrake(int a){
        speed = speed - a;
    }

    @Override
    public void load(int a){
        if((currentLoad+a) > Carrier.capacity){
            System.out.println("The max Capacity is " + Carrier.capacity +", can't load any further.");
        }
        else{
            currentLoad += a;
        }
    }

    @Override
    public void unload(){
        if(currentLoad==0)
            System.out.println("No load to unload.");    
        
        System.out.println("Unloaded.");
        currentLoad = 0;
    }
}
class Bicycle implements Vehicle{
    int speed;
    int gear;

    Bicycle(int a, int b){
        speed = a;
        gear = b;
    }

    @Override
    public void changeGear(int a){
        gear = a;
    }

    @Override
    public void speedUp(int a){
        speed = speed + a;
    }

    @Override
    public void applyBrake(int a){
        speed = speed - a;
    }

    public void currentState(){
        System.out.println("Bicycle:");
        System.out.println("Speed: " + speed);
        System.out.println("Gear: " + gear);
        System.out.println();
    }
}

class Bike implements Vehicle{
    int speed;
    int gear;

    Bike(int a, int b){
        speed = a;
        gear = b;
    }

    @Override
    public void changeGear(int a){
        gear = a;
    }

    @Override
    public void speedUp(int a){
        speed = speed + a;
    }

    @Override
    public void applyBrake(int a){
        speed = speed - a;
    }

    public void currentState(){
        System.out.println("Bike:");
        System.out.println("Speed: " + speed);
        System.out.println("Gear: " + gear);
        System.out.println();
    }
}

public class vehicleInterface{
    public static void main(String[] args){
        Bicycle cycle = new Bicycle(0,1);
        Bike motorBike = new Bike(0,0);
        Truck T = new Truck();

        System.out.println("Current states: ");
        cycle.currentState();
        motorBike.currentState();

        cycle.speedUp(5);
        motorBike.speedUp(20);
        motorBike.changeGear(3);

        T.infoCarrier();
        Vehicle.infoVehicle();
    }
}