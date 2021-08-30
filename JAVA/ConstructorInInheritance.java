class grandFather{
    grandFather(){
        System.out.println("Default Constructor of Grand Father.");
    }

    grandFather(int x){
        System.out.println("Parameterized Constructor of Grand Father with value of x: " + x);
    }
}

class Father extends grandFather{
    Father(){
        System.out.println("Default Constructor of Father.");
    }

    Father(int x, int y){
        super(x);
        System.out.println("Parameterized Constructor of Father with value of y: " + y);
    }
}

class Son extends Father{
    Son(){
        System.out.println("Default Constructor of Son.");
    }

    Son(int x, int y, int z){
        super(x, y);
        System.out.println("Parameterized Constructor of Son with value of z: " + z);
    }
}

public class ConstructorInInheritance {
    public static void main(String[] args){
        // grandFather A1 = new grandFather(5);
        // Father A2 = new Father(5, 6);
        Son A3 = new Son(5, 6, 7);
        System.out.println(A3);
    }
}
