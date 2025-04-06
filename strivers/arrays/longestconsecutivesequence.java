import java.util.*;
public class longestconsecutivesequence {
    public static int longestconsecutivesequence(int []nums){
            HashSet<Integer>st=new HashSet<>();
            for(int num:nums)st.add(num);
            int maxstreak=0;
            for(int num:st){
                if(!st.contains(num-1)){
                   int  currentnum=num;
                   int currentstreak=1;
                   while(st.contains(currentnum+1)){
                    currentnum++;
                    currentstreak++;
                   }
                   maxstreak=Math.max(maxstreak,currentstreak);
                    
                }
            }
            return maxstreak;
    }
    public static void main(String[] args) {
        
    }
}
/*
 * ➤ Loop: for (int num : st)

We iterate over each number to check if it's the start of a sequence:

1️⃣ num = 1
✔️ Check: if (!st.contains(num - 1)) → !st.contains(0) → true

→ This means 1 is the start of a sequence.

Initialize:

currentnum = 1
currentstreak = 1
Now we go into a while loop:

while (st.contains(currentnum + 1)) {
    currentstreak++;
    currentnum++;
}
▶️ Loop:

2 → found → currentstreak = 2, currentnum = 2
3 → found → currentstreak = 3, currentnum = 3
4 → found → currentstreak = 4, currentnum = 4
5 → not found → exit loop
✔️ So longest streak from 1 = 4

Update: maxstreak = max(0, 4) = 4
 */