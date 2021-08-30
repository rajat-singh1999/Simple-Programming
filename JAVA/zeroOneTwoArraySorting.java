public class zeroOneTwoArraySorting {
    static void show(int arr[],int l)
    {
        for(int i=0;i<l;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void sort(int[] arr){
        int a=0,b=0,c=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 0)
                a++;
            else if(arr[i] == 1)
                b++;
            else
                c++;
        }

        int i=0;
        a--;
        b--;
        c--;
        while(true)
        {
            if(a>=0){
                arr[i] = 0;
                a--;
                i++;
            }
            else if(b>=0){
                arr[i] = 1;
                b--;
                i++;
            }
            else if(c>=0){
                arr[i] = 2;
                c--;
                i++;
            }
            else
                break;
        }
    }

    public static void main(String[] args)
    {
        int[] arr={2,1,1,0,1,0,0,2,2,1,1,1,2,0,0};
        show(arr,arr.length);
        sort(arr);
        show(arr, arr.length);
    }
}
