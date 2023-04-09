import java.util.Scanner;

public class JumpingStairs {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int a = pk.nextInt();
        int[] dp = new int[a+1];

        for (int i = 0; i < dp.length; i++) {
            if(i<=2)
                dp[i] = i;
            else{
                dp[i] = dp[i-1]+dp[i-2];
            }
        }

        System.out.println(dp[a]);
    }
}
