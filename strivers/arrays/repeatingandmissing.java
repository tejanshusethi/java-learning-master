import java.util.*;
import javax.swing.event.AncestorEvent;

public class repeatingandmissing {
    public static ArrayList<Integer> repeatingmissing(int[]arr){
        int n=arr.length;
        int count[]=new int[n+1];
        ArrayList<Integer>ans= new ArrayList<>();
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int repeating=-1,missing=-1;
        for(int i=1;i<=n;i++){
            if(count[i]==2)repeating=i;
            if(count[i]==0)missing=i;
        }
        ans.add(repeating);
        ans.add(missing);
        return ans;


    }
    public static ArrayList<Integer>repeatingmissing2(int[]arr){
        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();
        long sumN=(long)n*(n+1)/2;
        long sumNSq=(long) n*(n+1)*(2*n+1)/6;
        long sum=0,sumSq=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            sumSq+=(long)arr[i]*arr[i];
        }
        long diff=sumN-sum;
        long squarediff=sumNSq-sumSq;
        long sumXY=squarediff-diff;
        long x=(diff+sumXY)/2;
        long y=(sumXY-x);
        ans.add((int)y);//repeating
        ans.add((int)x);//missing
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
/*
 * i = 0 → arr[0] = 1 → count[1]++
count = {0, 1, 0, 0}

i = 1 → arr[1] = 3 → count[3]++
count = {0, 1, 0, 1}

i = 2 → arr[2] = 3 → count[3]++
count = {0, 1, 0, 2}


i = 1 → count[1] = 1 → not repeating or missing
i = 2 → count[2] = 0 → missing = 2
i = 3 → count[3] = 2 → repeating = 3

 */

 /*
  * Step 1: Expected values
sumN = 3 * (3 + 1) / 2 = 6
sumNSq = 3 * 4 * 7 / 6 = 84 / 6 = 14
Step 2: Actual from array
sum = 1 + 3 + 3 = 7
sumSq = 1² + 3² + 3² = 1 + 9 + 9 = 19
Step 3: Compute differences
diff = sumN - sum = 6 - 7 = -1 = x - y
squareDiff = sumNSq - sumSq = 14 - 19 = -5 = x² - y²
Step 4: Equation solution
sumXY = squareDiff / diff = -5 / -1 = 5 = x + y
Now solve:
x = (diff + sumXY) / 2 = (-1 + 5) / 2 = 2
y = sumXY - x = 5 - 2 = 3
✅ Output:
[3, 2] → 3 is repeating, 2 is missing

  */


  