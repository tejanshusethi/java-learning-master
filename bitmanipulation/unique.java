
import java.util.*;
public class unique {
    public static int singlenumber2(int []nums){
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-1;i+=3){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[n-1];
    }
    // iske andar number twice present aur single bhi hain humne single count of number return karna hain 
    public static int[] singlenumber3(int []nums){
          int xorAll=0;
        //   xor all elements
        for(int num:nums){
           xorAll^=num;
        }
        // rightmost set bit
        int differbit=xorAll & (-xorAll);
        int b1=0;
        int b2=0;
        // divide number into two group and xor
        for(int num:nums){
            if((num&differbit)==0){
                b1^=num;
            }
            else{ 
                b2^=num;
            }
        }
        return new int[]{b1,b2};

    }
    public static void main(String[] args) {
        // int []nums={2,2,3,2};
        // int n=nums.length;
        // int ans=0;
        // for(int i=0;i<n;i++){
        //     ans=ans^nums[i];
        // }
        // System.out.println(ans);
        // this is when number is appearing twice and when the number is appearing thrice it will be different approch
        
        // System.out.println(singlenumber2(nums));

        int[] nums = {1, 2, 1, 3, 2, 5};
        int[] result = singlenumber3(nums);
        System.out.println("Unique numbers: " + result[0] + ", " + result[1]);

    }
}
/*
 * 4^1^1^2^2^3^4 isme same same wale to zero hojayenge aur unique ajyega
 * (4 ^ 4) ^ (1 ^ 1) ^ (2 ^ 2) ^ 3
= 0 ^ 0 ^ 0 ^ 3
= 3

 */



 /*
  * 
  dry run ={1,2,1,3,2,5}
  xor all =3^5=6(0110)

  Step 1: XOR All Numbers

We start by XORing all the numbers together to get the XOR of the two unique numbers.

Operation	Result (Decimal)	Binary Representation
1	1	0001
1 ^ 2	3	0011
3 ^ 1	2	0010
2 ^ 3	1	0001
1 ^ 2	3	0011
3 ^ 5	6	0110
 Final XOR Result: 6 (0110 in binary)
  find rightmost bit of 6
  Step 2: Find the Rightmost Set Bit

To differentiate the two unique numbers, we extract the rightmost set bit of 6 (0110).

Negative Representation of 6 (-6 in binary):
6  =  0000 0110
-6 =  1111 1010  (2's complement of 6)
Finding rightmost set bit using & operation:
6 & (-6) =  0000 0110
          & 1111 1010
          ----------------
            0000 0010  (2 in decimal)
💡 Rightmost Set Bit = 2 (0010 in binary)
  6&(-6)=2(0010)

  Why do we find the rightmost set bit?

This helps us split numbers into two groups:
Group 1: Numbers where this bit is NOT set
Group 2: Numbers where this bit is set

  

  spllit numbers based on 2nd bit
  Group 1 (Bit NOT Set at Position 2 - 0010)
Number	Binary Representation	(num & 2) ?
1	0001	0001 & 0010 = 0000 (No)
1	0001	0001 & 0010 = 0000 (No)
5	0101	0101 & 0010 = 0000 (No)
XOR within Group 1

1 ^ 1 ^ 5 = 5

  {1,1,5}-b1=1^1^5=5
  Group 2 (Bit SET at Position 2 - 0010)
Number	Binary Representation	(num & 2) ?
2	0010	0010 & 0010 = 0010 (Yes)
2	0010	0010 & 0010 = 0010 (Yes)
3	0011	0011 & 0010 = 0010 (Yes)
XOR within Group 2

2 ^ 2 ^ 3 = 3

  {2,2,3}-b2=2^2^3=3

  return b1 and b2 
  */
