// package strivers.Strings;
public class removeouterparent {
    public static String removeOuterparentis(String s){
          int cnt=0;
          StringBuilder ans=new StringBuilder();
          for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                cnt--;
            }
            if(cnt!=0){
                ans.append(s.charAt(i));
            }
            if(s.charAt(i)=='('){
                cnt++;
            }
            
          }
          return ans.toString();
    }
     public static void main(String[] args) {
         
     }
}

/*
 *
We skip the first '(' of a primitive block (when cnt == 0 before incrementing).
We skip the last ')' of a primitive block (when cnt == 0 after decrementing).

+----+------+-------------+--------------------------+------------+--------+
| i  | s[i] | cnt Before |         Action           | cnt After  |  ans   |
+----+------+-------------+--------------------------+------------+--------+
|  0 |  '(' |     0       | cnt++ (skip adding)     |     1      |  ""    |
|  1 |  '(' |     1       | Add to ans              |     2      |  "("   |
|  2 |  ')' |     2       | Add to ans              |     1      |  "()"  |
|  3 |  '(' |     1       | Add to ans              |     2      |  "()("  |
|  4 |  ')' |     2       | Add to ans              |     1      |  "()()" |
|  5 |  ')' |     1       | cnt-- (skip adding)     |     0      |  "()()" |
|  6 |  '(' |     0       | cnt++ (skip adding)     |     1      |  "()()" |
|  7 |  '(' |     1       | Add to ans              |     2      |  "()()("|
|  8 |  ')' |     2       | Add to ans              |     1      |  "()()()" |
|  9 |  ')' |     1       | cnt-- (skip adding)     |     0      |  "()()()" |
+----+------+-------------+--------------------------+------------+--------+


 */
