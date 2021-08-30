interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    static void infoVehicle(){
        System.out.println("This is a vehicle method.");
    }
    default void applyBrake(int a){}
}

abstract class Bicycle implements Vehicle{
    int speed=0;
    int gear=0;

    @Override
    public void changeGear(int a){
        gear = a;
    }

    @Override
    public void speedUp(int a){
        speed = speed + a;
    }

    public void currentState(){
        System.out.println("Bicycle:");
        System.out.println("Speed: " + speed);
        System.out.println("Gear: " + gear);
        System.out.println();
    }
}

class middle extends Bicycle{
    /*@Override
    public void applyBrake(int a){
        speed = speed-a;
    }*/
}

class Bike implements Vehicle{
    int speed, gear;
    Bike(){
        speed = 0;
        gear = 0;
    }
    
    @Override
    public void changeGear(int a){
        gear = a;
    }

    @Override
    public void speedUp(int a){
        speed = speed + a;
    }
}

public class vehicleInterface2{
    public static void main(String[] args){
        middle B = new middle();
        Bike bike = new Bike();

        bike.changeGear(5);
        
        B.currentState();
        B.changeGear(2);
        B.speedUp(19);

        B.currentState();
        B.applyBrake(5);
        B.currentState();
    }
}