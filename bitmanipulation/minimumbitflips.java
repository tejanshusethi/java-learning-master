public class minimumbitflips {
    public static int minbitflips(int start,int goal){
        // return Integer.bitCount(start^goal); this is the simple method
        int xor=start^goal;// Find differing bits
        int count=0;
        while(xor>0){
            xor=xor&(xor-1);// Removes rightmost set bit
            count++;
        }
        return count;
        // isme toh ye tha sirf ki count btoa kitne flip karenge padenge goal achieve karne ke liye
    }
    public static int converttogoal(int start,int goal){
       int xor=start^goal;
       return start^xor;// Flip those bits to match goal
    
    }
    public static void main(String[] args) {
        
    }
}

/*
 * 10-1010 and 7-0111 so inka xor nikalenge toh hoga=1101 ab inki set bit count karlo 
 * iska mtlb ye hain isko 3 bit flip karna padega 
 */


/*
 * ye goal complete karne ke liye dry run
 * Step-by-Step Execution

Step	Expression	Value (Binary)	Value (Decimal)
1	start = 10	1010	10
2	goal = 7	0111	7
3	xor = start ^ goal	1010 ^ 0111 = 1101	13
4	return start ^ xor	1010 ^ 1101 = 0111	7

 */
