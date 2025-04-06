import java.util.*;
// import javax.swing.event.AncestorEvent;
public class foursome {
    public static  List<List<Integer>> foresome(int[]nums,int target){
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            for(int j=i+1;j<n;j++){
                if(j!=i+1&&nums[j]==nums[j-1])continue;
                int k=j+1;
                int l=n-1;
                while(k<l){
                    long sum=0L+nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        List<Integer>temp=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        // skip duplicates
                        while(k<l&&nums[k]==nums[k-1])k++;
                        while(k<l&&nums[l]==nums[l+1])l--;
                    }else if(sum<target){
                        k++;
                    }else{
                        l--;
                    }

                }
            }

        }
        return ans;

    }
    public static void main(String[] args) {
        
    }
}
/*
 * 🧠 Dry Run Example:
Input:

nums = [1, 0, -1, 0, -2, 2]
target = 0
Sorted: [-2, -1, 0, 0, 1, 2]

✅ Step-by-step:
i = 0 → nums[i] = -2
j = 1 → nums[j] = -1
k = 2, l = 5
sum = -2 + -1 + 0 + 2 = -1 → k++
sum = -2 + -1 + 0 + 2 = -1 → k++
sum = -2 + -1 + 1 + 2 = 0 ✅ → add [-2, -1, 1, 2]
move k++, l--, skip duplicates
j = 2 → nums[j] = 0
k = 3, l = 5
sum = -2 + 0 + 0 + 2 = 0 ✅ → add [-2, 0, 0, 2]
skip duplicates
j = 3 → duplicate → skip
i = 1 → nums[i] = -1
j = 2 → nums[j] = 0
k = 3, l = 5
sum = -1 + 0 + 0 + 2 = 1 → l--
sum = -1 + 0 + 0 + 1 = 0 ✅ → add [-1, 0, 0, 1]
skip duplicates
j = 3 → duplicate → skip
Continue until i = n-4.

✅ Final Output:
[[-2, -1, 1, 2],
 [-2, 0, 0, 2],
 [-1, 0, 0, 1]]

 */