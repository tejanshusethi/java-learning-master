import java.util.*;
public class validanagram {
    static HashMap<Character,Integer>makefreqmap(String str){
           HashMap<Character,Integer>mp=new HashMap<>();
           for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }else{
                mp.put(ch,mp.get(ch)+1);
            }
           }
           return mp;
    }
    public static boolean isAnagram(String s,String t){
            if(s.length()!=t.length())return false;
            HashMap<Character,Integer>mp1=makefreqmap(s);
            // HashMap<Character,Integer>mp2=makefreqmap(t);
            // return mp1.equals(mp2);
            

            // approch no 2 in which we use only one map and string ik pheli sari map karlenge
            // and 2nd string bhi ik map mein hi value decrease karte jayenge agar 0 hogi to anagram 
            for(int i=0;i<t.length();i++){
                Character ch= t.charAt(i);
                if(!mp1.containsKey(ch))return false;
                int currfreq=mp1.get(ch);
                mp1.put(ch,currfreq-1);
            }
            // all values should be zero to be anagram
            for(Integer i :mp1.values()){
                if(i!=0)return false;
            }
            return true;

        }
        public static void main(String[] args) {
            String s="anagram";
            String t="nagaram";
            System.out.println(isAnagram(s,t));
    }
}

//  what makes anagram
/*
 * length of 2 strings should be equal 
 * freq of each char must be same
 * no character should be extra different 
 */
