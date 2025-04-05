// package strivers.arrays;
import java.util.*;

public class movezeros {
    public static int[]movezeros(int []arr){
        int n=arr.length;
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;

            }
        }
        return arr;
    }
    public static void main(String[] args) {
        
    }
}
/*
 * Dry Run with Example
Input

nums = [0, 1, 0, 3, 12]
Step-by-Step Execution

i = 0, j = 0, nums[j] is 0 → Skip
i = 0, j = 1, nums[j] is 1 → Swap nums[0] and nums[1]
Array becomes [1, 0, 0, 3, 12]
Increment i → 1
i = 1, j = 2, nums[j] is 0 → Skip
i = 1, j = 3, nums[j] is 3 → Swap nums[1] and nums[3]
Array becomes [1, 3, 0, 0, 12]
Increment i → 2
i = 2, j = 4, nums[j] is 12 → Swap nums[2] and nums[4]
Array becomes [1, 3, 12, 0, 0]
Increment i → 3

 */