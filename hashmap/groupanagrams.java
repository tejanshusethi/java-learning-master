import java.util.*;
class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
    //    if input is empty return empty list
      if(strs==null||strs.length==0) return new ArrayList<>();
    //   create an hashmap to store group of anagrams
        HashMap<String,List<String>>map=new HashMap<>();
        for(String word:strs){
             char[]chars=word.toCharArray();//convert word to character array
             Arrays.sort(chars);//sort the characters(anagram will match)
     String sortedword=new String(chars);//convert sorted array back to the strings
            //   if the sorted word is not in map ,create a new list
            map.putIfAbsent(sortedword,new ArrayList<>());
            // add the original word to the group
            map.get(sortedword).add(word);



        }
        // convert the hashmap values into a list and return 
        return new ArrayList<>(map.values());

    }
}
/*
 * map.get(sortedWord) gets the existing list of anagrams.
✔️ .add(word) places the original word into the correct group.
✔️ This ensures all anagrams are grouped correctly in the HashMap.



strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
Step-by-Step Execution
Word	Sorted Version	HashMap (Key = Sorted Word, Value = Grouped Words)
"eat"	"aet"	{ "aet": ["eat"] }
"tea"	"aet"	{ "aet": ["eat", "tea"] }
"tan"	"ant"	{ "aet": ["eat", "tea"], "ant": ["tan"] }
"ate"	"aet"	{ "aet": ["eat", "tea", "ate"], "ant": ["tan"] }
"nat"	"ant"	{ "aet": ["eat", "tea", "ate"], "ant": ["tan", "nat"] }
"bat"	"abt"	{ "aet": ["eat", "tea", "ate"], "ant": ["tan", "nat"], "abt": ["bat"] }
Final Output
[ ["eat", "tea", "ate"], ["tan", "nat"], ["bat"] ]
✅ All anagrams are grouped together!
 */