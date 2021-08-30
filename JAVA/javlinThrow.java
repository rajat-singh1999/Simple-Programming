import java.util.Arrays;

// Read problem statements in Russian, Mandarin Chinese, Bengali, and Vietnamese as well.
// There are N players with IDs from 1 to N, who are participating in the Javelin throw competition which has two rounds. The first is the qualification round, followed by the final round. The qualification round has gotten over, and you are given the longest distance that each of the N players has thrown as A1,A2,…,AN. Now, the selection process for the final round happens in the following two steps:

// 1) If the longest throw of a player in the qualification round is greater than or equal to the qualification mark of M cm, they qualify for the final round.

// 2) If after step 1, less than X players have qualified for the finals, the remaining spots are filled by players who have thrown the maximum distance among the players who have not qualified yet.

// You are given the best throws of the N players in the qualification round A1,A2,…,AN and the integers M and X. Print the list of the players who will qualify for the finals in increasing order of their IDs.

// Input Format
// The first line of input contains a single integer T denoting the number of test cases. The description of T test cases follows.
// The first line of each test case contains three space-separated integers N,M,X.
// The second line of each test case contains N space-separated integers A1,A2,…,AN.
// Output Format
// For each test case, print a single line containing K+1 space-separated integers, where K is the number of players qualified.
// First, print the integer K, then followed by a space, print K space-separated integers ID1,ID2,…,IDK where IDi denotes the players' ID who qualified for the finals.
// You have to print the IDs of the qualified players in increasing order.
// Constraints
// 1≤T≤1000
// 2≤X≤N≤30
// 5000≤Ai≤8000
// 7000≤M≤8000
// All Ai-s are distinct
// Sample Input 1 
// 3
// 3 8000 2
// 5000 5001 5002
// 3 5000 2
// 7999 7998 8000
// 4 6000 3
// 5999 5998 6000 6010
// Sample Output 1 
// 2 2 3
// 3 1 2 3
// 3 1 3 4
// Explanation
// Test Case 1: Since no player crosses the qualification mark, they are chosen based on the distance thrown. So player 3 who has thrown the maximum distance gets selected followed by the player 2. Now since we have got the required number of players, player 1 isn't selected.

// Test Case 2: Since all the players cross the qualification mark, they all are selected.



public class javlinThrow {
    static void customSort(int throwDistance[], int qualID[]){
        int n = throwDistance.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (throwDistance[j] < throwDistance[j+1])
                {
                    int temp1 = throwDistance[j];
                    throwDistance[j] = throwDistance[j+1];
                    throwDistance[j+1] = temp1;

                    int temp2 = qualID[j];
                    qualID[j] = qualID[j+1];
                    qualID[j+1] = temp2;
                }
    }

    static void solve(int N, int M, int X, int arr[]){
        int[] qualID=new int[N];
        
        int j=0;
        for(int i=0;i<N;i++){
            qualID[j]=i+1;
            j++;
        }

        // for(int i=0;i<N;i++){
        //     System.out.println(arr[i]+": "+qualID[i]);
        // }

        customSort(arr,qualID);

        for(int i=0;i<N;i++){
            if(i+1>X){
                qualID[i]=Integer.MAX_VALUE;
            }
        }
        Arrays.sort(qualID);

        for(int i=0;i<X;i++){
            System.out.print(qualID[i]+" ");
        }

    }
    public static void main(String[] args){
        int N = 4;
        int M = 6000;
        int X = 3;
        int[] arr={5999, 5998, 6000, 6010};
        solve(N, M, X, arr);
    }
}