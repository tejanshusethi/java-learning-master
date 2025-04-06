import java.util.*;
public class pascalstraingle {
    public List<Integer> generaterow(int row){
        List<Integer>ansrow=new ArrayList<>();
        ansrow.add(1);
        long ans=1;
        for(int col=1;col<row;col++){
           ans=ans*(row-col);
           ans=ans/col;
           ansrow.add((int)ans);
        }
        return ansrow;
    }
    public List<List<Integer>>generate(int numRows){
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generaterow(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
/*
 * Loop: col = 1 to 4 (since col < row)

col = 1
ans = ans * (5 - 1) = 1 * 4 = 4
ans = ans / 1 = 4
Add 4 → ansRow = [1, 4]

col = 2
ans = 4 * (5 - 2) = 4 * 3 = 12
ans = 12 / 2 = 6
Add 6 → ansRow = [1, 4, 6]

col = 3
ans = 6 * (5 - 3) = 6 * 2 = 12
ans = 12 / 3 = 4
Add 4 → ansRow = [1, 4, 6, 4]

col = 4
ans = 4 * (5 - 4) = 4 * 1 = 4
ans = 4 / 4 = 1
Add 1 → ansRow = [1, 4, 6, 4, 1]

🔚 Final Output of generateRow(5):
[1, 4, 6, 4, 1]
🧩 If We Run pascalTriangle(5):
It calls generateRow(1) to generateRow(5):

generateRow(1) → [1]
generateRow(2) → [1, 1]
generateRow(3) → [1, 2, 1]
generateRow(4) → [1, 3, 3, 1]
generateRow(5) → [1, 4, 6, 4, 1]
 this formula is computed when nCr =n!/r!*(n-r)! gives the same kat katake vhi aa rha ki ans*(row-col)/col
 */
