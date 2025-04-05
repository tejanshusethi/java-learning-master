// package strivers.arrays;
import java.util.*;

public class missingnumber {
    public static int missingnumber(int []num){
        int n=num.length;
        int sumofn=0;
        int sumofarray=0;
        int ans=0;
        for(int i=0;i<=n;i++){
            sumofn+=i;
        }
        for(int i=0;i<=n;i++){
            sumofarray+=num[i];
        }
        ans=sumofn-sumofarray;
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
/*
 * nums = [3, 0, 1]
Step-by-Step Execution

n = nums.length = 3
Initialize: sumofn = 0, sumofarray = 0
Step 1: Calculate sum of first n natural numbers (sumofn)

i = 0, sumofn = 0 + 0 = 0
i = 1, sumofn = 0 + 1 = 1
i = 2, sumofn = 1 + 2 = 3
i = 3, sumofn = 3 + 3 = 6
(Final sumofn = 6)
 */