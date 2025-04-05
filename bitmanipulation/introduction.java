public class introduction {
    public static String convertbinary(int n){
        String res="";
        while(n>0){
            if(n%2==1)res+="1";
            else res+="0";
            n=n/2;
        }
        String reversed=new StringBuilder(res).reverse().toString();
        return reversed;

    }
    public static int convertdecimal(String x){
        int len=x.length();
        int p2=1;
        int num=0;
        for(int i=len-1;i>=0;i--){
            if(x.charAt(i)=='1'){
                num=num+p2;
            }
            p2=p2*2;
        }
        return num;
    }
    public static String onecomplement(String x){
        StringBuilder compliment=new StringBuilder();
        for(char bit:x.toCharArray()){
            compliment.append(bit=='0'?'1':'0');
        }
        return compliment.toString();

    }
    /*
     * right shift operator - >>> 
     * iska formula hain = x/2^k this is formula for finding any right sfit 
     * like 13>>1 = 13/2^1=6
     * 
     * and when we do left shift operator-<<< 
     * iska formula hain =num*2^k this is formula for finding any left shift
     * like 13<<1=26
     * 
     * 
     * not operator -
     * 1. flip
     * 2.check -ve if yes it will 2's complement otherwise stop
     * agar number negative ho tabh toh simple flip and then doing 
     *  phele isme 1's complement nikalo then two's complement 
     * agar number check karo +ve hain  phele 1's complement then 2's and then flip karo and then check karo 
     * -ve nhi hain toh stop hojoa 
     * 
     * 
     * xor operator-
     * 1. even no of ones will be zero
     * 2. odd no of ones will be one 
     * 
     * 
     * Step-by-Step for 45 → Binary
Find the largest power of 2 ≤ 45
2
5
=
32
2 
5
 =32 → 1 at 
2
5
2 
5
  place.
45 - 32 = 13
Find the largest power of 2 ≤ 13
2
3
=
8
2 
3
 =8 → 1 at 
2
3
2 
3
  place.
13 - 8 = 5
Find the largest power of 2 ≤ 5
2
2
=
4
2 
2
 =4 → 1 at 
2
2
2 
2
  place.
5 - 4 = 1
Find the largest power of 2 ≤ 1
2
0
=
1
2 
0
 =1 → 1 at 
2
0
2 
0
  place.
1 - 1 = 0 (Done!)

     * 
     */
    public static void main(String[] args) {
        int n=5;
        String x="101";
        System.out.println(convertbinary(n));
        System.out.println(convertdecimal(x));
        System.out.println(onecomplement(x));
    }
}

