import java.util.*;
public class removeelement {
    public static int removeelement(int[]nums,int val){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }else{
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        
    }
}
/*
 * Input:

nums = [3, 2, 2, 3], val = 3
i (index)	nums[i]	nums[i] == val?	Action	nums array after change	k
0	3	Yes	skip	[3, 2, 2, 3]	0
1	2	No	nums[0] = nums[1] → 2	[2, 2, 2, 3]	1
2	2	No	nums[1] = nums[2] → 2	[2, 2, 2, 3]	2
3	3	Yes	skip	[2, 2, 2, 3]	2
Final result:

Returned k = 2
First k elements in nums are [2, 2]
 */
