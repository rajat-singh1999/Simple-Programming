/*import java.io.*;
import java.util.*;*/

public class largestContiguousSumOfSubArray {
    static void show(int arr[],int l){
        for(int i=0;i<l;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void showSubarray(int[] arr){
        int size = arr.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        System.out.println(max_so_far + " is the required sum.");
    }

    public static void main(String[] args){
        int[] arr = {0,2,-6,7};
        showSubarray(arr);
    }

}
