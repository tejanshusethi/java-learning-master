// package strivers.Strings;
public class largestoddnumber {
    public static String largestoddnumber2(String s){
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if((ch-'0')%2==1){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        
    }
}

/*
 * The rightmost odd digit guarantees the largest odd number prefix.
We don’t care if even numbers exist in the middle—as long as the 
last digit is odd, the full substring is valid.
Substring 0, i + 1 works because it ensures we include all numbers 
eading up to the last odd digit.

Input: "4203576"

num = "4203576"
Loop Execution

i	num[i]	ch - '0'	(ch - '0') % 2 == 1?	Action Taken
6	'6'	6	❌ No (Even)	Continue
5	'7'	7	✅ Yes (Odd)	Return "420357"
🔹 Final Output: "420357"

💡 Even though the number contains even digits (4, 2, 0, 6), 
we don't care because we only need the last odd-ending prefix.
 */