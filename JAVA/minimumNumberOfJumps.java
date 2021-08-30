public class minimumNumberOfJumps {
    static void show(int[] arr){
        int i=0;
        while(i<arr.length && arr[i]!=0)
            System.out.print(arr[i++] + " ");
        System.out.println();
    }

    static int minJumps(int[] arr){
        // your code here
        int i = 0;
        int jumps = 0;
        
        do{
            int j = arr[i];
            if(j==0)
                return -1;
            if(i+j > arr.length-1){
                i = arr.length;
                jumps++;
            }
            else{
                jumps++;
                i = i+j;
            }
        }while(i<=arr.length-1);
        
        return jumps;
    }
    
    public static void main(String[] args){
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}; 
        System.out.println(minJumps(arr));
    }
}
