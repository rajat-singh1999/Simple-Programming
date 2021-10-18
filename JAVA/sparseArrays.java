import java.util.Scanner;

public class sparseArrays{
    static int checkIfPresent(String []arr, String var){
        int freq = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(var)){
                freq++;
            }
        }
        return freq;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String arr[] = new String[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.next();
        }

        int qn = sc.nextInt();

        String queries[] = new String[qn];
        for(int i=0; i<qn;i++){
            queries[i] = sc.next();
        }

        for(int i = 0; i<qn;i++){
            String temp = queries[i];
            int res = checkIfPresent(arr, temp);
            System.out.println(res);
        }
        sc.close();
    }
}