public class magicSquare {

    static void show(int arr[][], int n, int m){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    static void checkIfMagicSquare(int arr[][], int n, int m){
        int sum=0, sumTemp=0;

        int i,j;
        sumTemp=0;
        for(j=0;j<m;j++){
            sumTemp=arr[0][j]+sumTemp;
        }
        sum=sumTemp;

        for(i=1;i<n;i++){
            sumTemp=0;
            for(j=0;j<m;j++){
                sumTemp+=arr[i][j];
            }
            if(sum!=sumTemp){
                System.out.println("0. Not a magic square!");
                return;
            }
        }
    
        for(i=0;i<m;i++){
            sumTemp=0;
            for(j=0;j<n;j++){
                sumTemp+=arr[j][i];
            }
            if(sum!=sumTemp){
                System.out.println("1. Not a magic square!");
                return;
            }
        }

        int principal = 0, secondary = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
     
                if (i == j)
                    principal += arr[i][j];
     
                if ((i + j) == (n - 1))
                    secondary += arr[i][j];
            }
        }

        if(principal!=sum || secondary!=sum){
            System.out.println("2. Not a magic square!");
            return;
        }
        else
            System.out.println("Yes!");
    }
    public static void main(String args[]){
        int arr[][]={{2,7,6}, {9,5,1}, {4,3,8}};
        show(arr, 3, 3);
        checkIfMagicSquare(arr, 3, 3);
        System.out.println();
    }
}
