public class MaximumMinimumElement {
    
    public static void main(String[] args)
    {
        int arr[] = new int[5];

        for(int i=0;i<5;i++)
            arr[i] = (int)(Math.random()*100);
        
        arrayClass obj = new arrayClass();
        obj.show(arr);
        int max = obj.max(arr);
        int min = obj.min(arr);
        System.out.println("Maximum valued element in the array: "+max);
        System.out.println("Minimum valued element in the array: "+min);
    }
}

class arrayClass
{
    void show(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    int max(int arr[])
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
                max=arr[i];
            else
                continue;
        }
        return max;
    }

    int min(int arr[])
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
                min=arr[i];
            else
                continue;
        }
        return min;
    }

}
