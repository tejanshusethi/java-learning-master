public class countsetbits {
    public static int countsetbits(int n){
        int count=0;
        while(n>0){
            count+=(n&1);// Add 1 if last bit is set
            n>>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(countsetbits(n));
    }
}
/*🔍 Dry Run: Extracting Last Bit for n = 10 (1010 in Binary)

We analyze how n & 1 works at each step:

Step	n (Decimal)	n (Binary)	n & 1 (Last Bit)	count (Set Bits)	n >>= 1 (Right Shift)
1	10	1010	1010 & 0001 = 0	                        0	              0101 (5)
2	5	0101	0101 & 0001 = 1	                         1	              0010 (2)
3	2	0010	0010 & 0001 = 0	                          1	             0001 (1)
4	1	0001	0001 & 0001 = 1	                         2	            0000 (0)
✔ Final Output: 2 (since 1010 has two 1s)

 */