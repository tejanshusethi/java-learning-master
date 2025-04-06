import java.util.*;
public class threesum {
    // brute force approch
    public List<List<Integer>> triplet(int n,int[]nums){
        Set<List<Integer>>set= new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer>temp=Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(temp);//make sure triplet is sorted before inserting 
                        set.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(set);

    }
    // optimised approch
    public List<List<Integer>>threesum2(int[]arr){
        List<List<Integer>>ans=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i!=0&&arr[i]==arr[i-1])continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum<0)j++;
                else if(sum>0)k--;
                else{
                    List<Integer>temp=Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k&&arr[j]==arr[j-1])j++;
                    while(j<k&&arr[k]==arr[k+1])k--;

                }
                
            }
            
        }
        return ans;


    }
    public static void main(String[] args) {
        
    }
}
/*
 * i = 0 → arr[i] = -4
    j = 1, k = 5
    sum = -4 + (-1) + 2 = -3 → j++
    sum = -4 + (-1) + 2 = -3 → j++
    sum = -4 + 0 + 2 = -2 → j++
    sum = -4 + 1 + 2 = -1 → j++
    j == k → move to next i

i = 1 → arr[i] = -1
    j = 2, k = 5
    sum = -1 + (-1) + 2 = 0 ✅ → add [-1, -1, 2]
    j++, k--
    sum = -1 + 0 + 1 = 0 ✅ → add [-1, 0, 1]
    j++, k--
    j >= k → move to next i

i = 2 → arr[i] = -1 → duplicate → skip

i = 3 → arr[i] = 0
    j = 4, k = 5
    sum = 0 + 1 + 2 = 3 → too big → k--
    j == k → done

i = 4, 5 → loop ends

✅ Final result: [[-1, -1, 2], [-1, 0, 1]]

 */
