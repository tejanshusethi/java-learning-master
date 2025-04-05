// package strivers.Strings;


public class longestcommonprefix {
    public static String longestcommonprefix(String[]strs){
        if(strs==null||strs.length==0){
            return "";
        }
        // start with the first string as the prefix
        String prefix=strs[0];
        // iterate over the rest of the strings
        for(int i=1;i<strs.length;i++){
            // keeping the prefix until it matched the string
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        
    }
}
/*
 * String[] strs = {"flower", "flow", "flight"};
Step	i	strs[i]		prefix (Before)	Condition (strs[i].indexOf(prefix) != 0)	prefix (After)	Action
---------------------------------------------------------------------------------------------------------------
1️⃣	1	"flow"		"flower"	"flow".indexOf("flower") != 0		"flowe"		Reduce prefix
	1	"flow"		"flowe"		"flow".indexOf("flowe") != 0		"flow"		Reduce prefix
	1	"flow"		"flow"		"flow".indexOf("flow") == 0		"flow"		No change
---------------------------------------------------------------------------------------------------------------
2️⃣	2	"flight"	"flow"		"flight".indexOf("flow") != 0		"flo"		Reduce prefix
	2	"flight"	"flo"		"flight".indexOf("flo") != 0		"fl"		Reduce prefix
	2	"flight"	"fl"		"flight".indexOf("fl") == 0		"fl"		No change
---------------------------------------------------------------------------------------------------------------
Final Output: "fl"

 */
