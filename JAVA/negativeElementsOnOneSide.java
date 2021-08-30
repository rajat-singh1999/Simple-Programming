public class negativeElementsOnOneSide {
    static void show(int arr[],int l)
    {
        for(int i=0;i<l;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void bruteForce(int[] arr){
        int[] temp = new int[arr.length];
        int i=0, p=0, q=arr.length-1;
        while(i<arr.length){
            if(arr[i] < 0){
                temp[p]=arr[i];
                p++;
                i++;
            }
            else{
                temp[q]=arr[i];
                q--;
                i++;
            }
        }
        show(temp,temp.length);
    }

    static void rearrage(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {8,9,-74,-2,0,27,-9,-14,15};
        //bruteForce(arr);
        rearrage(arr);
        show(arr,arr.length);
    }
}
