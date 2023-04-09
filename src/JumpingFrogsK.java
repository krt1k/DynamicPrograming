//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
import java.util.Scanner;

public class JumpingFrogsK {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int z = pk.nextInt();
        while (z != -1) {
            int a = pk.nextInt();
            int k = pk.nextInt();
            int[] arr = new int[a];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = pk.nextInt();
            }

            System.out.println(solver(k, arr));
//            ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//            for (Integer i:al)
//                System.out.println(i);
//        }
        }
    }

    private static int solver(int k, int[] arr) {
        int[] dp = new int[arr.length];

        for (int i = 1; i < dp.length; i++) {
            if (i == 1)
                dp[i] = Math.abs(arr[i] - arr[i - 1]);
            else {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= k; j++) {
                    if (i - j >= 0)
                        min = Math.min(min,
                                dp[i - j] + Math.abs(arr[i - j] - arr[i]));
                }
                dp[i] = min;
            }
        }
        return dp[arr.length - 1];
    }
}