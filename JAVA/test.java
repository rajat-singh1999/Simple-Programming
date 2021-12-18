import java.util.*;

public class test{
    public static void main(String[] args){
        System.out.println("Hello");
    
        List<List<Integer>> l = new ArrayList<>();
        
        for(int i=0;i<5;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<5;j++){
                temp.add(j+1);
            }
            l.add(temp);
        }

        for(int i=0;i<5;i++){
            List<Integer> temp = l.get(i);
            for(int j=0;j<5;j++){
                System.out.print(temp.get(j) + " ");
            }
            System.out.println();
        }
    
        System.out.println();
    }
}