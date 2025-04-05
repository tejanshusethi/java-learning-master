// package strivers.arrays;
import java.util.*;
public class secondlargest{
    public static int secondlargest(int[]arr){
        int n=arr.length;
        int maxi1=Integer.MIN_VALUE;
        int maxi2=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>maxi1){
                maxi1=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>maxi2&&arr[i]!=maxi1){
                maxi2=arr[i];
            }
        }
        return maxi2;

    }
    public static void main(String[] args) {
        
    }
}
