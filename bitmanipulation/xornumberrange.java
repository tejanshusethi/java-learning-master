public class xornumberrange {
    public static int xortupto(int n){
        if(n%4==0)return n;
        if(n%4==1)return 1;
        if(n%4==2)return n+1;
        return 0;
    }
    public static int rangeXor(int l,int r){
        return xortupto(r)^xortupto(l-1);
    }
    public static void main(String[] args) {
        int L = 3, R = 9;
        System.out.println("XOR from " + L + " to " + R + " is: " + rangeXor(L, R));
    
    }
}
/*
 * XOR from 0 to n follows a pattern based on n % 4:
n % 4 == 0 → XOR from 0 to n is n
n % 4 == 1 → XOR from 0 to n is 1
n % 4 == 2 → XOR from 0 to n is n + 1
n % 4 == 3 → XOR from 0 to n is 0


9mod4=1 (since 9 divided by 4 leaves remainder 1)
From the pattern: xorUpto(9) = 1

2mod4=2
From the pattern: xorUpto(2) = 2 + 1 = 3


1^3=0001^0011=0010 which is 2 in decimal





 */