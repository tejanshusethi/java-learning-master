import java.util.*;
public class fib {
//     public static int f(int n,int []dp){
//           if(n<=1){
//             return n;
//           }
//           if(dp[n]!=-1){
//             return dp[n];
//           }
//          return  dp[n]=f(n-1,dp)+f(n-2,dp);
//     }
//   public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();
//       int []dp=new int[n+1];
//       Arrays.fill(dp,-1);
//       System.out.println(f(n,dp));
//       sc.close();
    
//     }
// }//tc-o(n)and sc-recursion stack+dp array this is memorization way top down approch
// Dry Run of Memoization (Top-Down)
// For n = 5, we calculate using recursion with memoization.

// f(5) calls f(4) and f(3).
// f(4) calls f(3) and f(2).
// f(3) calls f(2) and f(1).
// f(2) calls f(1) and f(0).
// Base cases: f(1) = 1, f(0) = 0.
// Now f(2) = 1 + 0 = 1.
// f(3) = 1 + 1 = 2.
// f(4) = 2 + 1 = 3.
// f(5) = 3 + 2 = 5.
// Memoization DP Table
// n	f(n) (Stored in dp[])
// 0	0
// 1	1
// 2	1
// 3	2
// 4	3
// 5	5



// bottom up approch tablulation 
// public static int f(int n){
//    if(n<=1){
//     return n;
//    }
//    int []dp=new int[n+1];
//    dp[0]=0;
//    dp[1]=1;
//    for(int i=2;i<=n;i++){
//     dp[i]=dp[i-1]+dp[i-2];

//    }
//    return dp[n];
// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     System.out.println(f(n));
// }

// ry Run of Tabulation (Bottom-Up)
// For n = 5, we build dp[] iteratively.

// Initialize dp[0] = 0 and dp[1] = 1.
// Compute dp[2] = dp[1] + dp[0] = 1 + 0 = 1.
// Compute dp[3] = dp[2] + dp[1] = 1 + 1 = 2.
// Compute dp[4] = dp[3] + dp[2] = 2 + 1 = 3.
// Compute dp[5] = dp[4] + dp[3] = 3 + 2 = 5.
// Tabulation DP Table
// i	dp[i]
// 0	0
// 1	1
// 2	1
// 3	2
// 4	3
// 5	5


// this is the space optimisation

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n==0){
        System.out.println(0);
        return;
    }
    if(n==1){
        System.out.println(1);
        return;
    }
    int prev2=0;
    int prev=1;
    for(int i=2;i<=n;i++){
        int curi=prev2+prev;
        prev2=prev;
        prev=curi;
    }
    System.out.println(prev);
}

// Loop Iterations
// Iteration (i)	prev2 (F(i-2))	prev (F(i-1))	curi = prev + prev2 (F(i))
// 2	0	1	1 (0+1)
// 3	1	1	2 (1+1)
// 4	1	2	3 (1+2)
// 5	2	3	5 (2+3)
// Final Output (Fibonacci of 5)
// prev = 5, so output = 5.



}




