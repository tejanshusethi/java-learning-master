// package hashmap;
import java.util.*;

public class basics {
    public static void main(String[] args) {
        // Syntax
        Map<String,Integer>mp=new HashMap<>();
        // adding elements
        mp.put("Akash",21);
        mp.put("Tejanshu",23);
        mp.put("rk",26);
        mp.put("sk",29);
        mp.put("tk",20);
        mp.put("vk",222);
        System.out.println(mp.get("rk"));//26
        System.out.println(mp.get("gk"));//null
        // changing and updating of a key in a hashmap
        mp.put("akashs",25);//akash-25
        System.out.println(mp.get("akashs"));//25

        System.out.println(mp.remove("akashs"));//25
        // checking if a key is in the hashmap
        System.out.println(mp.containsKey("akashs"));//false
        // adding a new entry only if the new key doesnot exist already
        mp.putIfAbsent("Yashika", 30);
        // get all keys in the map
        System.out.println(mp.keySet());
        // get all values in the map
        System.out.println(mp.values());
        // get all entries in the map
        System.out.println(mp.entrySet());



    //  traversing all the entryset
    for(String key:mp.keySet()){
        System.out.printf("age is %s is %d\n",key,mp.get(key));

    }
    System.out.println();
    for(Map.Entry<String,Integer>e:mp.entrySet()){
        System.out.printf("age is %s is %d\n",e.getKey(),e.getValue());
    }
    System.out.println();
    for(var e:mp.entrySet()){
        System.out.printf("age is %s is %d\n",e.getKey(),e.getValue());
    }


    }
}
