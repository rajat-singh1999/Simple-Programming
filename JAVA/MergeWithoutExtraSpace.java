import java.util.*;
public class MergeWithoutExtraSpace {
    static void show(int arr[],int l){
        for(int i=0;i<l;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        for(int i=m-1; i>=0; i--){
            if(arr1[n-1] > arr2[i]){
                int temp = arr1[n-1];
                arr1[n-1] = arr2[i];
                arr2[i] = temp;

                Arrays.sort(arr1);
                Arrays.sort(arr2);
            }
        }
    }
    
    public static void main(String[] args){
        int arr1[] = {10, 12};
        int arr2[] = {5, 18, 20};

        merge(arr1,arr2,arr1.length,arr2.length);
        show(arr1, arr1.length);
        show(arr2, arr2.length);
    }
}
