public class setithbit {
    public static int setithbit(int n,int i){
        return n|(1<<i);
    }
    public static int setRightmostUnsetBit(int n){
        return n|(n+1);
    }
    public static int clearithbit(int n,int i){
             return n&~(1<<i);
    }
    public static int togglebit(int n ,int i){
      return n^(1<<i);
    }
    public static int removelastbit(int n){
      return n&(n-1);
    }
    public static void main(String[] args) {
        int n=10,i=1;
        System.out.println(setithbit(n, i));
        System.out.println(clearithbit(n, i));
    }
}
/*
 * 10-1010
 * 1<<2= 0001<<2=0100=4
 * 
 * ab then 
 * 1010|0100=1110=14
 * 
 * 
 * ✅ Example Test Cases & Outputs

n	i	Binary (Before)	Mask (1 << i)	Binary (After)	Decimal Output
10	2	1010 (10)	0100 (4)	1110 (14)	14
5	1	0101 (5)	0010 (2)	0111 (7)	7
0	3	0000 (0)	1000 (8)	1000 (8)	8
8	0	1000 (8)	0001 (1)	1001 (9)	9
 * 
 * 
 */



 /*
  * 🔎 Step-by-Step Dry Run

Example: n = 10
Step 1: Convert n to Binary

10
10
=
1010
2
10 
10
​	
 =1010 
2
​	
 
Index:  3  2  1  0
Bits :  1  0  1  0
The rightmost 0 is at position 0.
Step 2: Compute n + 1

n
+
1
=
10
+
1
=
11
n+1=10+1=11
11
10
=
1011
2
11 
10
​	
 =1011 
2
​	
 
Index:  3  2  1  0
Bits :  1  0  1  1
Step 3: Perform Bitwise OR

1010
2
 
∣
 
1011
2
=
1011
2
1010 
2
​	
  ∣ 1011 
2
​	
 =1011 
2
​	
 
  1010  (10 in binary)
| 1011  (11 in binary)
--------
  1011  (11 in binary)
✔ Output: 11

✅ Example Test Cases & Outputs

n	Binary (Before)	n + 1 (Binary)	Binary (After)	Decimal Output
10	1010 (10)	1011 (11)	1011 (11)	11
8	1000 (8)	1001 (9)	1001 (9)	9
7	0111 (7)	1000 (8)	1111 (15)	15
0	0000 (0)	0001 (1)	0001 (1)	1






clear the ithbit
10=1010
1<<1 = 0010
~(0010)=1101

1010&1101=1000 which is 8(in binary)

  */




  /*
   * toggle the bit
   * 
   * 10-1010 1<<1=0010
   * perform bitwise xor
   * 1010^0010=1000 which is 8 in binary 
   * 
   */


   /*
    * remove last bit
    10-1010  n-1=1001 perform bitwise and operation 1010&1001=1000(8)in binary

    
    */