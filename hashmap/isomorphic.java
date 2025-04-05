import java.util.*;
public class isomorphic {
    public  static boolean isisomorphic(String s,String t){
        HashMap<Character,Character>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character sch=s.charAt(i);
            Character tch=t.charAt(i);
            if(mp.containsKey(sch)){
                if(mp.get(sch)!=tch)return false;
            }else if (mp.containsValue(tch)){
               return false;
            }else{
                mp.put(tch,sch);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // 1. consitent mapping
        // 2. no two character may map to the same character
           String s="egg";
           String t="add";
           System.out.println(isisomorphic(s,t));
    }
}
