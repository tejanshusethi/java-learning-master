import java.util.*;
class Solution {
  
    public boolean wordPattern(String pattern, String s) {
        String words[]=s.split(" ");
        if(pattern.length()!=words.length)return false;

        HashMap<Character,String>chartoword=new HashMap<>();
        HashMap<String,Character>wordtochar=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String word=words[i];
            // check if char is already mapped to a different word
            if(chartoword.containsKey(ch)){
                if(!chartoword.get(ch).equals(word))return false;
            }else{
                chartoword.put(ch,word);
            }
            // check if word is already mapped to a different char
            if(wordtochar.containsKey(word)){
                if(!wordtochar.get(word).equals(ch))return false;
            }else{
                wordtochar.put(word,ch);
            }

        }
        return true;



    }
}
/*
 * Example Input
pattern = "abba"
s = "dog cat cat dog"
Step 1: Split s into Words
words = ["dog", "cat", "cat", "dog"]
Step 2: Length Check
pattern.length() = 4, words.length = 4  ✅ (Valid)
Step 3: Iterating Through pattern and words
Iteration	ch (Pattern)	word (Words)	charToWord (Mapping)	wordToChar (Mapping)	Result
1st (i=0)	'a'	"dog"	{ 'a' → "dog" }	{ "dog" → 'a' }	✅
2nd (i=1)	'b'	"cat"	{ 'a' → "dog", 'b' → "cat" }	{ "dog" → 'a', "cat" → 'b' }	✅
3rd (i=2)	'b'	"cat"	{ 'a' → "dog", 'b' → "cat" }	{ "dog" → 'a', "cat" → 'b' }	✅
4th (i=3)	'a'	"dog"	{ 'a' → "dog", 'b' → "cat" }	{ "dog" → 'a', "cat" → 'b' }	✅
Since all mappings are valid, return true.
 */
