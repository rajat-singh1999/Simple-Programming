public class cyclicRoatationOfArray {
    static void show(int arr[],int l){
        for(int i=0;i<l;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void cyclicRotate(int[] arr, int nor){
        int l=arr.length;

        for(int i=0;i<nor;i++){
            for(int j=0;j<l-1;j++){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {0,2,6};

        show(arr, arr.length);
        cyclicRotate(arr, 3);
        show(arr, arr.length);
    }

}
