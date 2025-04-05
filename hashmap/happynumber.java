import java.util.*;
class Solution {
    public boolean isHappy(int n) {
          HashSet<Integer> set = new HashSet<>();
        while(n!=1&&!set.contains(n)){
            set.add(n);
            int sum=0;
            while(n>0){
                sum+=Math.pow((n%10),2);
                n=n/10;
            }
            n=sum;
        }
        return n==1;
    }
}


/*
 * xample 1: n = 19
Initial Values

n = 19
sum = 0
First Iteration

digit = 19 % 10 = 9
sum = 0 + Math.pow(9, 2) = 0 + 81 = 81
n = 19 / 10 = 1
Second Iteration

digit = 1 % 10 = 1
sum = 81 + Math.pow(1, 2) = 81 + 1 = 82
n = 1 / 10 = 0 (Loop exits)
Final sum = 82

Example 2: n = 145
Initial Values

n = 145
sum = 0
First Iteration

digit = 145 % 10 = 5
sum = 0 + Math.pow(5, 2) = 0 + 25 = 25
n = 145 / 10 = 14
Second Iteration

digit = 14 % 10 = 4
sum = 25 + Math.pow(4, 2) = 25 + 16 = 41
n = 14 / 10 = 1
Third Iteration

digit = 1 % 10 = 1
sum = 41 + Math.pow(1, 2) = 41 + 1 = 42
n = 1 / 10 = 0 (Loop exits)
Final sum = 42

How This Works
Iteration	digit = n % 10	sum += digit²	n = n / 10
1st (n=19)	9	81	1
2nd	1	82	0 (Exit)
For n = 145:

Iteration	digit = n % 10	sum += digit²	n = n / 10
1st (n=145)	5	25	14
2nd	4	41	1
3rd	1	42	0 (Exit)

 */