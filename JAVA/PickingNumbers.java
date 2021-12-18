/*Given an array of integers, find the longest subarray where the absolute difference between any two elements is less than or equal to 1.*/
import java.util.*;
import java.math.BigInteger;
public class PickingNumbers {
    
    static int check(List<Integer> a, int start, int end){
        int diff=0;
        for(int i=start;i<=end;i++){
            for(int j=i+1;j<end;j++){
                diff=Math.abs(a.get(j)-a.get(i));
                if(diff>1)
                    return 0;
            }
        }
        return 1;
    }
    static int pickingNumbers(List<Integer> arr){
        Collections.sort(arr);
        int l=0, n=arr.size();
        int opsize = (int)Math.pow(2, n);
        for (int counter = 1; counter < opsize; counter++)
        {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++)
            {
                /* Check if jth bit in the counter is set
                    If set then print jth element from arr[] */
       
                if (BigInteger.valueOf(counter).testBit(j))
                    temp.add(arr.get(j));
            }
            if(temp.size()>1){
                if(check(temp, 0, temp.size()-1)==1){
                    if(temp.size()>l)
                        l=temp.size();
                }
            }
        }
        
        
        
        return l;
        
        // int start=0, end=1;
        // do{
        //     if((check(a, start, end))==1){
        //         int lTemp=(end-start)+1;
        //         end++;
        //         if(lTemp>l)
        //             l=lTemp;
        //         continue;
        //     }
        //     else{
        //         start=end;
        //         end=start+1;
        //         continue;
        //     }
        // }while(end<a.size());
    }
    public static void main(String args[]){
        List<Integer> a =new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(1);
        a.add(2);
        // a.add(5);
        // a.add(5);
        // a.add(5);
        System.out.println(pickingNumbers(a));
    }
}
