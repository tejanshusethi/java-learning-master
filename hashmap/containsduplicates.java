import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
               int idx=mp.get(nums[i]);
               if(i-idx<=k){
                return true;
               }else{
                mp.put(nums[i],i);
               }
            }
            else{
                mp.put(nums[i],i);
            }
        }
        return false;
    }
}

/*
 * nums=[1,0,1,1],k=1 true
 * map mein store honge ik toh nums[i] ik uska index 
 * 1-0 isko katke agle usme dubara 1 agya toh ab pichle index kya tha 0 and new hain hmre pass 2 usko subtract 
 * karke k ke barbar aa rha hain toh return true otherwise index update kardo 
 * 0-1
 */
