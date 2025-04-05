public class checkithbit {
    public static boolean iskthbitleftshift(int num,int k){
         return (num&(1<<(k-1)))!=0;
    }
    public static boolean iskthbitrightshift(int num,int k){
        return ((num>>(k-1))&1)==1;
    }
    public static void main(String[] args) {
         int num=5;
         int k=3;
         System.out.println(iskthbitleftshift(num, k));
         System.out.println(iskthbitrightshift(num, k));
    }
}


/*
 * dry run for left shift operator
 * 1-001
 * left shift by2 it become -100 which is equal to 4
 * and then 5=101 and 4=100 and operator will be done
 * so the answer came will be 100 which is non zero
 * 
 * 
 * dry run for right shift operator 
 * 5-101 k=2
 * right shift by 1 it become 00010 which is 2 in decimal 
 * then  00010 and by 01 
 * 10&01=0 which is false
 * 
 * 
 * 
 */
