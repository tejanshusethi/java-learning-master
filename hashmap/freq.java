import java.util.*;
public class freq {
    public static void main(String[] args) {
        int arr[]={1,4,2,5,1,4,4,6,4,4,4};
        Map<Integer,Integer>freq=new HashMap<>();
        for(int el:arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);
            }else{
                freq.put(el,freq.get(el)+1);
            }
        }
        System.out.println(freq.entrySet());
        int maxfreq=0;
        int anskey=-1;
       for(var e:freq.entrySet()){
          if(e.getValue()>maxfreq){
            maxfreq=e.getValue();
            anskey=e.getKey();
          }
       }
       System.out.printf("%d has much frequency and it occurs %d times",anskey,maxfreq);

    }
}
