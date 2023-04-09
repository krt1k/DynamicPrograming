// Problem Link: https://bit.ly/3JPcoOx

import java.util.Scanner;

public class JumpingFrogs {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int a = pk.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = pk.nextInt();
        }

        System.out.println(dpFunc(arr));
    }

    private static int dpFunc(int[] heights) {
        int[] dp = new int[heights.length];


        for (int i = 1; i < dp.length; i++) {
            if(i<=1)
                dp[i] = Math.abs(heights[i]-heights[i-1]);
            else{
                int first = dp[i-1] + Math.abs(heights[i-1]-heights[i]);
                int second = dp[i-2] + Math.abs(heights[i-2]-heights[i]);
                dp[i] = Math.min(first,second);
            }
        }
        return dp[heights.length-1];
    }
}