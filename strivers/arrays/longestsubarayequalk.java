import java.util.*;
public class longestsubarayequalk {
    public static int longestsubarray(int[]arr,int k){
        // map to store prefix sum
        Map<Integer,Integer>mp=new HashMap<>();
        int sum=0;
        int maxlen=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];// Build the prefix sum
            // Case 1: Subarray from index 0 to i has sum = k
            if(sum==k){
                maxlen=i+1;
            }
            // Case 2: Check if (sum - k) exists in map
            // This means there is a subarray from some index +1 to i with sum = k
            if(mp.containsKey(sum-k)){
                int len=i-mp.get(sum-k); // Calculate subarray length
                maxlen=Math.max(maxlen,len);
            }
            // Store sum and index if not already in map (we want the first occurrence)
            if(!mp.containsKey(sum)){
                mp.put(sum,i);
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        
    }
}
/*
 * 💡 Explanation (Line-by-line):
Map<Integer, Integer> map = new HashMap<>();
Stores prefixSum as key and the first index it was found.
Why first index? Because we want the longest subarray, so we subtract from the earliest occurrence.
int sum = 0;
This keeps track of prefix sum as we go through the array.
int maxLen = 0;
Stores the length of the longest subarray whose sum is k.
for (int i = 0; i < arr.length; i++) {
Loop through the entire array.
sum += arr[i];
Continuously build the running prefix sum.
if (sum == k) maxLen = i + 1;
If total from index 0 to i equals k, update maxLen.
if (map.containsKey(sum - k)) {...}
We check if sum - k has appeared before.
Why? Because then the sum between that previous index + 1 and i is exactly k.
int len = i - map.get(sum - k);
Length of the subarray with sum k.
maxLen = Math.max(maxLen, len);
Update longest length if we found a longer one.
if (!map.containsKey(sum)) map.put(sum, i);
We store the first time a prefix sum was seen.
🧠 Dry Run Example
Let's dry run:
Input: arr = [10, 5, 2, 7, 1, -10], k = 15

i	arr[i]	sum	sum-k	map	Found sum-k?	maxLen
0	10	10	-5	{}	❌	0
1	5	15	0	{10:0}	❌	2
2	2	17	2	{10:0, 15:1}	❌	2
3	7	24	9	{10:0,15:1,17:2}	❌	2
4	1	25	10	...	✅ at index 0	4 (4-0)
5	-10	15	0	...	❌	6 (5+1)
✔ Final maxLen = 6


 */
