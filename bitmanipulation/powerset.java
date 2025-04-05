import java.util.*;
public class powerset {
    public static List<List<Integer>> subsets(int[]nums){
        int n=nums.length;
        List<List<Integer>>result=new ArrayList<>();
        // iterate from o to 2(n-1 )to iterate over all the subsets
        for(int i=0;i<(1<<n);i++){
            List<Integer>subset=new ArrayList<>();
            // check each bit of i include which element has to include
            for(int j=0;j<n;j++){ //Check each bit position
                if((i&(1<<j))!=0){ //If j-th bit of i is set
                    subset.add(nums[j]);
                }//it checks which element should be included 
            }
            result.add(subset);
        }
        return result;

    }
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(subsets(nums));
    }
}
//  Power Set Bitwise Dry Run

// For n = 3, we need 2^3 = 8 subsets.

// | i (Decimal) | i (Binary) | j = 0 (1<<0 = 001) | i & (1 << 0) | Include nums[0]? | j = 1 (1<<1 = 010) | i & (1 << 1) | Include nums[1]? | j = 2 (1<<2 = 100) | i & (1 << 2) | Include nums[2]? | Subset |
// |------------|------------|------------------|--------------|----------------|------------------|--------------|----------------|------------------|--------------|----------------|--------|
// | 0          | 000        | 001              | 000 & 001 = 000 | ❌ No           | 010              | 000 & 010 = 000 | ❌ No           | 100              | 000 & 100 = 000 | ❌ No           | {}     |
// | 1          | 001        | 001              | 001 & 001 = 001 | ✅ Yes          | 010              | 001 & 010 = 000 | ❌ No           | 100              | 001 & 100 = 000 | ❌ No           | {1}    |
// | 2          | 010        | 001              | 010 & 001 = 000 | ❌ No           | 010              | 010 & 010 = 010 | ✅ Yes          | 100              | 010 & 100 = 000 | ❌ No           | {2}    |
// | 3          | 011        | 001              | 011 & 001 = 001 | ✅ Yes          | 010              | 011 & 010 = 010 | ✅ Yes          | 100              | 011 & 100 = 000 | ❌ No           | {1,2}  |
// | 4          | 100        | 001              | 100 & 001 = 000 | ❌ No           | 010              | 100 & 010 = 000 | ❌ No           | 100              | 100 & 100 = 100 | ✅ Yes          | {3}    |
// | 5          | 101        | 001              | 101 & 001 = 001 | ✅ Yes          | 010              | 101 & 010 = 000 | ❌ No           | 100              | 101 & 100 = 100 | ✅ Yes          | {1,3}  |
// | 6          | 110        | 001              | 110 & 001 = 000 | ❌ No           | 010              | 110 & 010 = 010 | ✅ Yes          | 100              | 110 & 100 = 100 | ✅ Yes          | {2,3}  |
// | 7          | 111        | 001              | 111 & 001 = 001 | ✅ Yes          | 010              | 111 & 010 = 010 | ✅ Yes          | 100              | 111 & 100 = 100 | ✅ Yes          | {1,2,3} |

