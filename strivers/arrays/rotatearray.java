import java.util.*;
public class rotatearray {
    public static void reverse(int start,int end,int nums[]){
        while(start<end){
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }
    }
    public static void rotate(int []nums,int k){
        int n=nums.length;
        k=k%n;
        if(k==0||n<1){
            return;
        }
        reverse(0,n-1,nums);
        reverse(0,k-1,nums);
        reverse(k,n-1,nums);

    }
    public static void main(String[] args) {
        
    }
}
/*rotate array to right by k places  */
