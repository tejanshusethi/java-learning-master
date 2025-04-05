import java.util.*;
class Solution{
    public  static int[]twosum(int[]nums,int target){
     int n=nums.length;
     HashMap<Integer,Integer>mp=new HashMap<>();
     int ans[]={-1};
     for(int i=0;i<n;i++){
        int partner=target-nums[i];
        if(mp.containsKey(partner)){
            ans=new int[]{i,mp.get(partner)};
            return ans;
        }
        mp.put(i,nums[i]);
     }
     return ans;
    } 
}

/*
 * int partner = target - nums[i];
Har element nums[i] ke liye, check karna hai ki uska partner (target - nums[i]) already HashMap mein hai ya nahi.
Example:
i = 0, nums[0] = 2
partner = 9 - 2 = 7
Matlab hume ek 7 chahiye jo pehle aaya ho.
 */