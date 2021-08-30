import java.util.*;
public class maximizeSumOfArrayAfterKNegetions {
    static int sumArray( int[] arr, int n)
    {
        int sum = 0;
        
        // Iterate from 0 to n - 1
        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
        }
        return sum;
    }
      
    // Function to maximize sum
    static int maximizeSum(int arr[], int n, int k)
    {
        Arrays.sort(arr);
        int i = 0;
        
        // Iterate from 0 to n - 1
        for(i = 0; i < n; i++)
        {
            if (k != 0 && arr[i] < 0)
            {
                arr[i] *= -1;
                k--;
                continue;
            }
            break;
        }
        if (i == n)
            i--;
      
        if (k == 0 || k % 2 == 0)
        {
            return sumArray(arr, n);
        }
      
        if (i != 0 && Math.abs(arr[i]) >=
            Math.abs(arr[i - 1]))
        {
            i--;
        }
      
        arr[i] *= -1;
        return sumArray(arr, n);
    }
     
    // Driver Code
    public static void main(String args[])
    {
        int n = 5;
        int k = 4;
        int arr[] = {-2, 0, 5, -1, 2};
        
        // Function Call
        System.out.print(maximizeSum(arr, n, k));
    }
}