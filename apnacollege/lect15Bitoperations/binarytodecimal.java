public class binarytodecimal {
    public static int binarytodecimal(String n){
        int len=n.length();
        int p2=1;
        int num=0;
        for(int i=len-1;i>=0;i--){
            if(n.charAt(i)=='1'){
                num=num+p2;
            }
            p2=p2*2;
        }
        return num;
    }
    public static void main(String[] args) {
        String binary="1011";
        int decimal=binarytodecimal(binary);
        System.out.println("Binary: " + binary + " -> Decimal: " + decimal);
    }
}
