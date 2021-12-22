/*Hackerrank: https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem?isFullScreen=false */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class climbingLeaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        printScores(n, scores, alice);
    }
    
    public static void printScores(int n, int[] scores, int[] alice){
        ArrayList<Integer> places = new ArrayList<Integer>();
        int place = 1;
        places.add(scores[0]);
        for(int i = 1; i < scores.length; i++){
            int currPlace = place-1;
            int currScore = scores[i];
            if(currScore != places.get(currPlace)){
                place++;
                places.add(currScore);
            }
        }
        
        int currPlace = places.size() + 1;
        for(int i = 0; i < alice.length; i++){
            currPlace = getPlace(currPlace, alice[i], places);
            System.out.println(currPlace);
        }
        
    }
    
    public static int getPlace(int currPlace, int currScore, ArrayList<Integer> places){
        for(int i = currPlace - 1; i > 0; i--){
            int index = i - 1;
            if(currScore < places.get(index)){
                return i + 1;
            }
        }
        return 1;
    }   
}

/*
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
    List<Integer> ranks = new ArrayList<>();
            List<Integer> r = new ArrayList<>();
    
            int count=1;
            ranks.add(1);
            for(int i=1;i<ranked.size();i++){
                if(ranked.get(i)==ranked.get(i-1))
                    ranks.add(count);
                else
                    ranks.add(++count);
            } 
                    
            int j=ranked.size()-1;
            for(int i=0;i<player.size();i++){
                int temp=player.get(i);
                while(true){
                    if(ranked.get(j)==temp){
                        ranked.add(j+1,temp);
                        r.add(ranks.get(j));
                        break;
                    }
                    else if(ranked.get(j)<temp){
                        j--;
                        if(j==-1){
                            ranked.add(0,temp);
                            r.add(1);
                            break;
                        }
                    }
                    else{
                        ranked.add(j+1,temp);
                        r.add(ranks.get(j)+1);
                        break;
                    }
                }
            }
            return r;
        }
    
    }  
*/