// package dp;
import java.util.* ;
public class countnofways {


    // top-down approch
    public static long countDistinctWayToClimbStair(int nStairs) {
         long dp[]=new long[nStairs+1];
         Arrays.fill(dp,-1);
         return countWays(nStairs,dp);

    }
    private static long countWays(int n, long[] dp) {
      if(n==0||n==1)return 1;
      if(dp[n]!=-1)return dp[n];
      return dp[n]=countWays(n-1, dp)+countWays(n-2, dp);

    }



    // dry run for memorization
//     countWays(5) = countWays(4) + countWays(3)
// countWays(4) = countWays(3) + countWays(2)
// countWays(3) = countWays(2) + countWays(1)
// countWays(2) = countWays(1) + countWays(0)
// countWays(1) = 1 (Base Case)
// countWays(0) = 1 (Base Case)


// tabular form -(bottom up)

public static long countDistinctWayToClimbStair2(int nStairs) {
    if(nStairs==0||nStairs==1)return 1;
    long[]dp=new long[nStairs+1];
    dp[0]=1;
    dp[1]=1;
    for(int i=2;i<=nStairs;i++){
        dp[i]=dp[i-1]+dp[i-2];

    }
    return dp[nStairs];
}
// Step 1: dp[0] = 1
// Step 2: dp[1] = 1
// Step 3: dp[2] = dp[1] + dp[0] = 1 + 1 = 2
// Step 4: dp[3] = dp[2] + dp[1] = 2 + 1 = 3
// Step 5: dp[4] = dp[3] + dp[2] = 3 + 2 = 5
// Step 6: dp[5] = dp[4] + dp[3] = 5 + 3 = 8



	// public static long countDistinctWayToClimbStair(int nStairs) {
	// 	// Write your code here.
	// 	  // Modulo value to prevent overflow
    //     final int MOD = 1000000007;
	// 	if(nStairs==0||nStairs==1){
	// 		return 1;
	// 	}
	// 	long prev2=1;
	// 	long prev1=1;
	// 	for(int i=2;i<=nStairs;i++){
	// 		long  curri=(prev2+prev1)%MOD;
	// 		prev2=prev1;
	// 		prev1=curri;
	// 	}
	// 	return prev1;
	// }

    //  dry run of this code
//     Step 1: prev2 = 1, prev = 1
// Step 2: i = 2 → curr = prev + prev2 = 1 + 1 = 2
//        → prev2 = prev (1), prev = curr (2)
// Step 3: i = 3 → curr = prev + prev2 = 2 + 1 = 3
//        → prev2 = prev (2), prev = curr (3)
// Step 4: i = 4 → curr = prev + prev2 = 3 + 2 = 5
//        → prev2 = prev (3), prev = curr (5)
// Step 5: i = 5 → curr = prev + prev2 = 5 + 3 = 8
//        → prev2 = prev (5), prev = curr (8)






    


}
