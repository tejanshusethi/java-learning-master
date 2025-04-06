import java.util.*;
public class subarraysumequalk {
    public static int subarray(int[]nums,int k){
         int n=nums.length;
         int prefixsum[]=new int[n];
         prefixsum[0]=nums[0];
         for(int i=1;i<n;i++){
            prefixsum[i]=prefixsum[i-1]+nums[i];
         }
         Map<Integer,Integer>mp=new HashMap<>();
         int count=0;
         for(int j=0;j<n;j++){
            if(prefixsum[j]==k){
                count++;
            }
            int value=prefixsum[j]-k;
            if(mp.containsKey(value)){
                count+=mp.get(value);// add how many times this prefixSum has occurred
            }
            // if prefixsum does not in map ,set frequency to 0
            if(!mp.containsKey(prefixsum[j])){
                mp.put(prefixsum[j],0);
            }
            // increment frequence
            mp.put(prefixsum[j],mp.get(prefixsum[j])+1);


         }
         return count;
    }
    public static void main(String[] args) {
        
    }
}
/*
 * 
 * The same prefix sum might have occurred multiple times before.
Each one of them gives us a different subarray with sum = k.
🔄 Dry Run Example:
nums = [1, 2, 1, 1], k = 3
prefixSum = [1, 3, 4, 5]
Iteration j = 1:

prefixsum[1] = 3 → equals k ⇒ count = 1
map before: {1=1}
update: mp.put(3, 1) ✅
Iteration j = 2:

prefixsum[2] = 4, val = 4 - 3 = 1
1 is in map → count += 1 ⇒ count = 2
update map: mp.put(4, 1)
Iteration j = 3:

prefixsum[3] = 5, val = 2
2 is not in map
update map: mp.put(5, 1)
✅ Summary:
Step	Why Needed?
mp.get(prefixsum[j]) + 1	To track how many times this prefix sum has occurred
Always done?	✅ Yes, in every iteration, because we might use this prefix sum later
Used for?	Checking if prefixsum[j] - k has occurred before to find valid subarrays

 */
