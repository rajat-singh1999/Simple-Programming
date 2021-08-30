// A programming competition will be held in Chef's city which only accepts teams of size 2. At least one person in a team should know a programming language and at least one person should know about the English language. It is possible that one person in a team knows both programming and the English language. Then the qualification of the other teammate is not important i.e. he may or may not know programming and English. Now Chef has N students and wants to send maximum number of teams to the competition.

// You are given an integer N and two binary strings S and T of length N. Si= '1' denotes that the ith student knows a programming language, and Si= '0' denotes otherwise; similarly, Ti= '1' denotes that the ith student knows English language, and Ti= '0' denotes otherwise. Determine the maximum number of teams Chef can form.

// Input Format
// The first line of input contains a single integer Q denoting the number of test cases. The description of Q test cases follows.
// Each test case contains 3 lines of input.
// The first line of each test case contains an integer N.
// The second line of each test case contains a string S.
// The last line of each test case contains a string T.
// Output Format
// For each test case, print a single line containing one integer - the maximum number of teams that Chef can form.

// Constraints
// 1≤Q≤1000
// 1≤N≤100
// S and T contains only characters '0' and '1'
// Sample Input 1 
// 4
// 3
// 101
// 001
// 4
// 1010
// 0110
// 3
// 000
// 110
// 2
// 10
// 11
// Sample Output 1 
// 1
// 2
// 0
// 1

public class TeamFormation {
    static void solve(String S, String T){
        int teams = 0;
        int oneOf = 0;
        int both = 0;
        int nothing = 0;
        int knowsEng = 0;
        int knowsPro = 0;

        for(int i=0;i<S.length();i++){
            char charS = S.charAt(i);
            char charT = T.charAt(i);
            if(charS=='0' && charT=='0')
                nothing++;
            else if((charS=='0' && charT=='1') || (charS=='1' && charT=='0')){
                oneOf++;
                if(charS=='0' && charT=='1')
                    knowsEng++;
                else
                    knowsPro++;
            }
            else
                both++;
        }

        if(knowsEng==knowsPro)
            oneOf = knowsEng;
        else if(knowsPro>knowsEng)
            oneOf = knowsEng;
        else
            oneOf = knowsPro;

        System.out.println(oneOf+" "+both+" "+nothing);
        if(oneOf%2==0){
            teams = teams + (oneOf/2);
            if(nothing==both)
                teams = teams + both;
            else if(both>nothing)
                teams = teams + (both-nothing);
            else
                teams = teams + (nothing-both);
        }
        else{
            int remaining = oneOf%2;
            teams = teams + ((oneOf-1)/2);
            remaining++;
            if(remaining==both)
                teams = teams + both;
            else if(both>remaining)
                teams = teams + remaining;
            else
                teams = teams + (remaining-both);
        }
        System.out.println(teams);
    }

    public static void main(String args[]){
        String S = "11111";
        String T = "10001";
        solve(S, T);
    }
}
