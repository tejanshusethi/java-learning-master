import java.util.*;
public class removeduplicates {
    public static int removeduplicates(int[]nums){
         int n=nums.length;
         int k=1;
         for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
         }
         return k;
    }
    // we have to do inplace remove duplicates and return k number jo hum duplicate hatake array mein return karenge 
    public static void main(String[] args) {
        
    }
}
/*
 * Loop Iteration Breakdown:
Iteration 1 (i = 1)

nums[i] = 1, nums[i-1] = 1
Since nums[i] == nums[i-1], do nothing.
k remains 1.
Iteration 2 (i = 2)

nums[i] = 2, nums[i-1] = 1
Since nums[i] != nums[i-1], update nums[k] = nums[i]
nums[1] = 2
Increment k = 2
Updated array: [1, 2, 2, 2, 3]

Iteration 3 (i = 3)

nums[i] = 2, nums[i-1] = 2
Since nums[i] == nums[i-1], do nothing.
k remains 2.
Iteration 4 (i = 4)

nums[i] = 3, nums[i-1] = 2
Since nums[i] != nums[i-1], update nums[k] = nums[i]
nums[2] = 3
Increment k = 3
Updated array: [1, 2, 3, 2, 3]

Final Output:
k = 3, meaning the first 3 elements of nums are the unique values: [1, 2, 3].
The method returns 3, which represents the number of unique elements.

 */