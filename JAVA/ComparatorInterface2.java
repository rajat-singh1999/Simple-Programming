import java.util.*;

class Student{
    String name, address;
    int roll;

    Student(String name, String address, int roll){
        this.name = name;
        this.address = address;
        this.roll = roll;
    }

    String getName(){return name;}
    String getAddress(){return address;}
    int getRoll(){return roll;}
}

class StudentSortingComparator implements Comparator<Student>{
    @Override
    public int compare(Student a, Student b){
        int rollCompare = a.getRoll() - b.getRoll();
        int nameCompare = a.getName().compareTo(b.getName());
        int addressCompare = a.getAddress().compareTo(b.getAddress());

        int res = (rollCompare==0)?((nameCompare==0)?addressCompare:nameCompare):rollCompare;
        return res;
    }
}

class ComparatorInterface2{
    public static void main(String[] args){
        ArrayList<Student> arr = new ArrayList<Student>();
        
        arr.add(new Student("Rajat", "Howrah", 1));
        arr.add(new Student("Rajat", "Samastipur", 1));
        arr.add(new Student("Bikas", "Patna", 5));
        arr.add(new Student("Aditya", "Gorakhpur", 3));
        arr.add(new Student("Narendar", "Varanasi", 2));

        System.out.println("Unsorted:");
        for(Student i:arr)
            System.out.println(i.getRoll() + " " + i.getName() + " " + i.getAddress());

        Collections.sort(arr, new StudentSortingComparator());

        System.out.println("\nSorted:");
        for(Student i:arr)
            System.out.println(i.getRoll() + " " + i.getName() + " " + i.getAddress());
    }
}