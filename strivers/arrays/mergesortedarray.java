import java.util.*;
public class mergesortedarray {
    public static void mergesortedarray(int []nums,int m,int n,int[]nums2){
        int left=m-1;
        int right=n-1;
        int index=m+n-1;
        while(left>=0&&right>=0){
            if(nums[left]>nums2[right]){
                nums[index]=nums[left];
                index--;
                left--;
            }else{
                nums[index]=nums2[right];
                index--;
                right--;
            }
        }
        while(right>=0){
            nums[index]=nums2[right];
            index--;
            right--;
        }
    }
    public static void main(String[] args) {
        
    }
}
/*
 * Step-by-Step Execution:
Compare nums1[left] = 5 and nums2[right] = 6.
6 is greater than 5, so place 6 at nums1[index] (i.e., nums1[5] = 6).
Decrement right to 1 and index to 4.
Updated nums1: [1, 3, 5, 0, 0, 6]
Compare nums1[left] = 5 and nums2[right] = 4.
5 is greater than 4, so place 5 at nums1[index] (i.e., nums1[4] = 5).
Decrement left to 1 and index to 3.
Updated nums1: [1, 3, 5, 0, 5, 6]
Compare nums1[left] = 3 and nums2[right] = 4.
4 is greater than 3, so place 4 at nums1[index] (i.e., nums1[3] = 4).
Decrement right to 0 and index to 2.
Updated nums1: [1, 3, 5, 4, 5, 6]
Compare nums1[left] = 3 and nums2[right] = 2.
3 is greater than 2, so place 3 at nums1[index] (i.e., nums1[2] = 3).
Decrement left to 0 and index to 1.
Updated nums1: [1, 3, 3, 4, 5, 6]
Compare nums1[left] = 1 and nums2[right] = 2.
2 is greater than 1, so place 2 at nums1[index] (i.e., nums1[1] = 2).
Decrement right to -1 and index to 0.
Updated nums1: [1, 2, 3, 4, 5, 6]
Step 2: Copy Remaining Elements from nums2
Since right is now -1, the second while loop is skipped as all elements from nums2 have already been merged.

Final Output:
nums1 = [1, 2, 3, 4, 5, 6]
Now, nums1 contains all elements from nums1 and nums2, merged in sorted order.
*/
