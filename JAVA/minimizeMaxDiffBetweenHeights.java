import java.util.*;

public class minimizeMaxDiffBetweenHeights {
    
    static void show(int[] arr){
        int i=0;
        while(i<arr.length && arr[i]!=0)
            System.out.print(arr[i++] + " ");
        System.out.println();
    }

    static int getMinDiff(int[] arr, int k){
        if (arr.length == 1)
        return 0;
 
        Arrays.sort(arr);
 
        int ans = arr[arr.length-1] - arr[0];
 
        int small = arr[0] + k;
        int big = arr[arr.length-1] - k;
        int temp = 0;
         
        if (small > big)
        {
            temp = small;
            small = big;
            big = temp;
        }
 
        for (int i = 1; i < arr.length-1; i ++){
            int subtract = arr[i] - k;
            int add = arr[i] + k;
 
            if (small<=subtract || big>=add)
                continue;
 
            if (big - subtract <= add - small)
                small = subtract;
            else
                big = add;
            System.out.println("Small: " + small + " and Big: " + big);
        }
 
        return Math.min(ans, big - small);
    }

    public static void main(String[] args){
        int[] arr = {1, 10, 14, 14, 14, 15};
        int k = 6;

        show(arr);
        int res = getMinDiff(arr,k);
        System.out.println("Minimised maximum difference: " + res);
    }
}
