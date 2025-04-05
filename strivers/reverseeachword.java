// package strivers;

public class reverseeachword {
    public static String reversewords(String s){
        s=s.trim();
        String[]words=s.split("\\s+");
        StringBuilder result=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            result.append(words[i]);
            if(i!=0){
                result.append(" ");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        
    }
}
/*
 * "\\s+" ensures that multiple spaces don’t cause empty strings.
"\\s" would split at each space, which is incorrect in this case.

 */
