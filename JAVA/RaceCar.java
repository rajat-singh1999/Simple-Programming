class Racecar
{
    int cap, speed=0, currentFuel;
    public Racecar(int capacity)
    {
        cap=capacity;
        currentFuel=cap;
    }

    public int getCurrentSpeed()
    {
        speed=speed+10;
        return speed;
    }
    
    public boolean accelerate()
    {
        if(isOutOfFuel())
        {
            speed=speed+10;
            return false;
        }
        
        else
        {
            currentFuel--;
            return true;
        }
    }

    public boolean isOutOfFuel()
    {
        if(currentFuel>0)
            return false;
        else
            return true;
    }

    public double refuel(double costPerGallon)
    {
        int temp=currentFuel;
        currentFuel=cap;
        return (cap-temp)*costPerGallon;
    }
}

class RaceCar
{
    public static void main(String args[])
    {
        Racecar r = new Racecar(2);
        System.out.println(r.isOutOfFuel());
        System.out.println(r.accelerate());
        System.out.println(r.refuel(3.10));
        System.out.println(r.getCurrentSpeed());
        System.out.println(r.accelerate());
        System.out.println(r.getCurrentSpeed());
        System.out.println(r.accelerate());
        System.out.println(r.getCurrentSpeed());
        System.out.println(r.accelerate());
        System.out.println(r.getCurrentSpeed());
        System.out.println(r.isOutOfFuel());
        System.out.println(r.refuel(3.20));
    }
}