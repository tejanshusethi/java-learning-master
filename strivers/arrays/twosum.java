import java.util.*;
public class twosum {
  public static int[]twosum2(int[]nums,int target){
        int n=nums.length;
        int ans[]={-1};
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int partner=target-nums[i];
            if(mp.containsKey(partner)){
                ans=new int[]{i,mp.get(partner)};
                return ans;
            }
            mp.put(nums[i],i);
        }
        return ans;
  }
    public static void main(String[] args) {
        
    }
}
/*
 * 📦 Initialization:
n = 4
ans = {-1} → default if no pair is found
mp = {} → empty HashMap to store value → index
🔁 Loop Starts:
🔸 i = 0:

nums[i] = 2
partner = 9 - 2 = 7
Is 7 in map? ❌ No
Add 2 to map → mp = {2: 0}
🔸 i = 1:

nums[i] = 7
partner = 9 - 7 = 2
Is 2 in map? ✅ Yes, at index 0
✔️ Found answer: ans = {1, mp.get(2)} = {1, 0}
✔️ Return immediately.

✅ Final result = [1, 0]

You can also return [0, 1], both are valid.
 */