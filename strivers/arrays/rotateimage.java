import java.util.*;
public class rotateimage {
    public static void rotateimage(int[][]matrix){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // reverse each row
        for(int i=0;i<n;i++){
            int left=0,right=n-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
/*
 * ✅ Row 0: [1, 4, 7]
Initial: left = 0, right = 2
First Iteration of while loop:

swap matrix[0][0] and matrix[0][2] → swap(1, 7)
Now row 0 becomes: [7, 4, 1]
left = 1, right = 1 → loop ends
✅ Row 1: [2, 5, 8]
Initial: left = 0, right = 2
First Iteration of while loop:

swap matrix[1][0] and matrix[1][2] → swap(2, 8)
Now row 1 becomes: [8, 5, 2]
left = 1, right = 1 → loop ends
✅ Row 2: [3, 6, 9]
Initial: left = 0, right = 2
First Iteration of while loop:

swap matrix[2][0] and matrix[2][2] → swap(3, 9)
Now row 2 becomes: [9, 6, 3]
left = 1, right = 1 → loop ends
🔚 Final Matrix after full loop:
[7, 4, 1]
[8, 5, 2]
[9, 6, 3]

 */
