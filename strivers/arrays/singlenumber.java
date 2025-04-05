import java.util.*;
public class singlenumber {
    public static int  singlenumber(int[]nums){
        int n=nums.length;
        int ans=-1;
        for(int i=0;i<n;i++){
            ans=ans^nums[i];
        }
        return ans;

    }
    public static int method2(int[]nums){
        int n=nums.length;
        for(int i=0;i<n;i++){
            int ans=nums[i];
            int cnt=0;
            for(int j=0;j<n;j++){
                if(nums[j]==ans){
                    cnt++;
                }
            }
            if(cnt==1)return ans;
        }
        return -1;
    }
    // ki ik aisa number nikalo jo ik baari aye bas array mein 
    public static void main(String[] args) {
        
    }
}
