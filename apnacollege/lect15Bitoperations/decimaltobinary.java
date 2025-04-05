public class decimaltobinary {
    public static String convertbinary(int n){
        String res="";
        while(n!=0){
            if(n%2==1)res+='1';
            else res+='0';
            n=n/2;
        }
        return res;
    }
    public static void main(String[] args) {
        int number=11;
        System.out.println(convertbinary(number));
    }
}
