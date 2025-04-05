public class division {
    public int divide(int divident,int divisor){
        if(divident==divisor)return 1;
        boolean sign=true;
        if(divident>=0&&divisor<0)sign=false;
        if(divident<=0&&divisor>0)sign=false;
        long n=Math.abs((long)divident);
        long d= Math.abs((long)divisor);
        long quiotent=0;
        while(n>=d){
            int cnt=0;
            while(n>=(d<<(cnt+1))){//d*2^cnt+1=3*2^1 aur vo numerator se badi hini chiye
                cnt+=1;
            }
            quiotent+=(1L<<cnt);//yani ki isme ayega 2^cnt
            n-=(d<<cnt); // iska mtlb hain ki 3*2^cnt ko substract kardo numerator mein se
        }
        if(quiotent==(1L<<31)&&sign){
            return Integer.MAX_VALUE;
        }
        if(quiotent==(1<<31)&&!sign){
            return Integer.MIN_VALUE;
        }
        return sign?(int)quiotent:(int)-quiotent;
    }
    public static void main(String[] args) {
        
    }
}
/*
 * divident=22,divisor=3
 * (3*7)=3*(2^2+2^1+2^0)=3*2^0+3*2^1+3*2^2=3,6,12 biggest number is 12 which i remove
 * 
 * 22-12=10
 * and ans =2*2=4
 * 
 * 10-6=4 and ans=4+2
 * 
 * 4-3=1 and ans=4+2+1=7
 * 
 * so 1 is less than divisor 
 * n>=d
 * while(n>=(d*2^cnt+1)){
 * cnt++;
 * }
 * ans+=2^cnt
 * n=n-(d*(1<<cnt))=3*2^2
 * 
 * 1L ensures that the bit shifting operation is performed 
 * using a long instead of an int, preventing integer overflow.
 * 
 * 
//  * test case divident=10 and divisor -3

 * 10!=3= continue
 * dono >0 so sign=true
 * n=10
 * d=3
 * cnt=0
 * 
 * 10>=(3<<1)=10>=6->increment cnt+=1
 * 10>=(3<<2)=10>=14 which is false rok do 
 * 
 * ans+=(1<<cnt)=ans =2^1=2
 * 
 * n-=(d<<cnt)=n-(3*2^1)=6 =10-6=4
 * 
 * fir dubara loop chalegi 
 * cnt=0
 * fir check karenge ki cnt ++ karna hain ya ni karna thik aa 
 * ho ni sakta aage toh 
 * quiotent+=2^0=1
 * n-=3*2^0=3
 *  4-3=1 1<3 so false and loops stops 
 * 
 * so we return quiotent 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
