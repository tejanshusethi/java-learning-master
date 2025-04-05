// package strivers.arrays;

import java.util.*;
public class maxconsecutiveone {
    public static int consecutiveones(int[]nums){
        int n=nums.length;
        int maxcount=0;
        int currentcount=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                currentcount++;
                maxcount=Math.max(currentcount,maxcount);
            }else{
                currentcount=0;
            }
        }
        return maxcount;
    }
    public static void main(String[] args) {
        
    }
}
/*
 * Example 1

Input:  nums = [1,1,0,1,1,1]
num = 1 → currentCount = 1, maxCount = 1
num = 1 → currentCount = 2, maxCount = 2
num = 0 → Reset currentCount = 0
num = 1 → currentCount = 1, maxCount = 2
num = 1 → currentCount = 2, maxCount = 2
num = 1 → currentCount = 3, maxCount = 3 Output: 3
 */