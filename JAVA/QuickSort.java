public class QuickSort {

    static void printArray(int arr[]) {

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
     
        int i = (low - 1);
     
        for(int j = low; j <= high - 1; j++)
        {
             
            if (arr[j] < pivot)
            {
                 
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr,int low, int high) {
        int partitionIndex;
        
        if(low<high)
        {
            partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }
    }
    
    public static void main(String[] args) {

        int arr[] = {9, 4, 4, 8, 7, 5, 6};

        System.out.print("Array before Sorting: ");
        printArray(arr);

        quickSort(arr, 0, arr.length-1);

        printArray(arr);
    }
}
