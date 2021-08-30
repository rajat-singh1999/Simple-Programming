import java.util.*;

public class unionAndIntersectionOfSortedArray {
    static void show(int arr[],int l){
        for(int i=0;i<l;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void showUnion(int[] A, int[] B){
        int i = 0, j = 0, m=A.length, n=B.length;
        int[] U = new int[m+n];
     
        while (i < m && j < n) {
            if (A[i] < B[j])
                System.out.print(A[i++] + " ");
            else if (B[j] < A[i])
                System.out.print(B[j++] + " ");
            else {
                System.out.print(B[j++] + " ");
                i++;
            }
        }

        while (i < m)
            System.out.print(A[i++] + " ");
        while (j < n)
            System.out.print(B[j++] + " ");
        System.out.println();
    }

    static void showIntersection(int[] A, int[] B){
        int[] I = new int[(A.length<B.length)?A.length:B.length];
        int i,p=0;

        for(i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                if(A[i]==B[j]){
                    I[p++]=A[i];
                }
            }
        }
        show(I,p);
    }

    public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }    
        int j = 0;//for next element  
        for (int i=0; i < n-1; i++){  
            if (arr[i] != arr[i+1]){  
                arr[j++] = arr[i];  
            }  
        }  
        arr[j++] = arr[n-1];  
        return j;    
    }  
    
    public static int doUnion(int A[], int n, int B[], int m) 
    {
        //Your code here
        int fal = A.length;        
        int sal = B.length; 
        int[] result = new int[fal + sal];
        System.arraycopy(A, 0, result, 0, fal);  
        System.arraycopy(B, 0, result, fal, sal);
        Arrays.sort(result);
        int temp = removeDuplicateElements(result, result.length);  
        show(result, temp);   //prints the resultant array         
        return temp;

    }

    public static void main(String[] args){
        int[] A = {4, 4, 2};
        int[] B = {1, 4, 2, 3, 5, 4};
        Arrays.sort(A);
        Arrays.sort(B);
        /*showUnion(A, B);
        showIntersection(A, B);*/
        System.out.print(doUnion(A, A.length, B, B.length));
    }
}
