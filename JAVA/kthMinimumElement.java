public class kthMinimumElement {

    static void show(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
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

    
    static int kthsmallest(int[] arr, int fIndex, int lIndex, int k)
    {
        //int res=arr[0];
        //int n = arr.length;

        quickSort(arr, 0, arr.length-1);

        show(arr);
        System.out.println("AFTER:");
        show(arr);
        return arr[k-1];
    }

    public static void main(String[] args)
    {
        int n = (int)((Math.random()*10)+5);
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = (int)(Math.random()*100);
        }
        show(arr);
        int k=3;
        int ans = kthsmallest(arr, 0, n-1, k);
        System.out.println("Result: "+ans);
    }
}
