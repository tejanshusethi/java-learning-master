// package strivers.Strings;
public class rotatestring {
    public static boolean rotate2String(String s,String goal){
        if(s.length()!=goal.length())return false;
        return (s+s).contains(goal);
    }
    public static void main(String[] args) {
        
    }
}
/*
 * Concatenation:  "abcde" + "abcde" = "abcdeabcde"
Check if "cdeab" is inside "abcdeabcde" → ✅ TRUE

 */