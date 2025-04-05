import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            Character ch=magazine.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }else{
                mp.put(ch,mp.get(ch)+1);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            Character ch=ransomNote.charAt(i);
            if(!mp.containsKey(ch)|| mp.get(ch) == 0){
               return false;
            }else{
                int currfreq=mp.get(ch);
                mp.put(ch,currfreq-1);
            }
        }
        return true;

    }
}
/*
 * nother Example Dry Run
Example Input:

ransomNote = "aa"
magazine = "ab"
Step 1: Build Frequency Map for magazine

Iteration	Character	mp State
1st (i=0)	'a'	{ 'a': 1 }
2nd (i=1)	'b'	{ 'a': 1, 'b': 1 }
Final mp:

{ 'a': 1, 'b': 1 }
Step 2: Checking ransomNote ("aa")

Iteration	Character	Condition Check	mp before update	mp after update
1st (i=0)	'a'	✅ mp.get('a') = 1 > 0 → Proceed	{ 'a': 1, 'b': 1 }	{ 'a': 0, 'b': 1 }
2nd (i=1)	'a'	❌ mp.get('a') = 0 → Return false	{ 'a': 0, 'b': 1 }	Exit Early
Final Output:
false
 */