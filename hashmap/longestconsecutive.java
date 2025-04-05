import java.util.*;

class Solution{
    public int longestconsequence(int []nums){
        HashSet<Integer>mp=new HashSet<>();
        int maxstreak=0;
        for(int num:nums)mp.add(num);
        for(int num:mp){
            int currnum=num;
            int currentstreak=1;
            while(mp.contains(currnum+1)){
                currentstreak++;
                currnum++;
            }
            maxstreak=Math.max(maxstreak,currentstreak);
        }
        return maxstreak;

    }
}








/*
 * Dry Run (Step-by-Step Execution)

Input Example:
nums = [100, 4, 200, 1, 3, 2]
Step 1: HashSet Store
st = {100, 4, 200, 1, 3, 2}
Step 2: Loop Over HashSet
First Iteration (num = 1)

1 - 1 = 0 ❌ HashSet me nahi hai, toh ek naya sequence start hoga.
currentnum = 1, currentstreak = 1
2 mil gaya, currentstreak++ → 2
3 mil gaya, currentstreak++ → 3
4 mil gaya, currentstreak++ → 4
5 ❌ nahi mila, loop break
maxstreak = max(0, 4) = 4
Second Iteration (num = 2, 3, 4)

1 already check ho chuka hai, toh kuch nahi karenge.
Third Iteration (num = 100)

100 - 1 = 99 ❌ HashSet me nahi hai, toh ek naya sequence start hoga.
currentnum = 100, currentstreak = 1
101 ❌ nahi mila, loop break
maxstreak = max(4, 1) = 4
Fourth Iteration (num = 200)

200 - 1 = 199 ❌ HashSet me nahi hai, toh ek naya sequence start hoga.
currentnum = 200, currentstreak = 1
201 ❌ nahi mila, loop break
maxstreak = max(4, 1) = 4

 */