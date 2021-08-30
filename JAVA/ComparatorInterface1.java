import java.util.*;

class Student{
    int roll;
    String name, address;
    Student(String name, String address, int roll){
        this.name = name;
        this.address = address;
        this.roll = roll;
    }

    String getName(){
        return name;
    }

    String getAddress(){
        return address;
    }

    int getRoll(){
        return roll;
    }
}

class sortByRoll implements Comparator<Student>{
    @Override
    public int compare(Student a, Student b){
        return a.getRoll() - b.getRoll();
    }
}

class sortByName implements Comparator<Student>{
    @Override
    public int compare(Student a, Student b){
        return a.getName().compareTo(b.getName());
    }
}

class sortByAddress implements Comparator<Student>{
    @Override
    public int compare(Student a, Student b){
        return a.getAddress().compareTo(b.getAddress());
    }
}

class ComparatorInterface1{
    public static void main(String args[]){
        ArrayList<Student> arr = new ArrayList<Student>();

        arr.add(new Student("Rajat", "Howrah", 1));
        arr.add(new Student("Raja", "Samastipur", 4));
        arr.add(new Student("Bikas", "Patna", 5));
        arr.add(new Student("Aditya", "Gorakhpur", 3));
        arr.add(new Student("Narendar", "Varanasi", 2));

        System.out.println("Unsorted");
        for(Student i:arr)
            System.out.println(i.getRoll() + " " + i.getName() + " " + i.getAddress());
        
        Collections.sort(arr, new sortByRoll());
        System.out.println("\nSorted by roll:");
        for(Student i:arr)
            System.out.println(i.getRoll() + " " + i.getName() + " " + i.getAddress());
        
        Collections.sort(arr, new sortByName());
        System.out.println("\nSorted by Name:");
        for(Student i:arr)
            System.out.println(i.getRoll() + " " + i.getName() + " " + i.getAddress());

        Collections.sort(arr, new sortByAddress());
        System.out.println("\nSorted by Address:");
        for(Student i:arr)
            System.out.println(i.getRoll() + " " + i.getName() + " " + i.getAddress());
    }
}