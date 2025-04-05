public class swaptwonumber {
    public static void main(String[] args) {
        int a=10,b=5;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+","+b);
    }
}


/*
a=5,b=10
 * 5- 00000101
 * 10-00001010
 * 
 * a= a^b
 *  
 * xor kara inka toh answer aya hmre pass 15 in decimal(00001111)
 * a=15,b=10
 * b=a^b
 * (00001111)^(00001010)=(00000101)=(5)in decimal
 * a=15,b=5
 * 
 * a=a^b
 *   (00001111)^(0000101)=(00001010)=(10)in decimal
 * a=10,b=5
 * 
 */