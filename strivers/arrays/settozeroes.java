import java.util.*;
public class settozeroes {
    public static void settozeroes(int[][]nums){
        int n=nums.length;
        int m =nums[0].length;
        int row[]=new int[n];
        int col[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums[i][j]==0){
                    row[i]=1;
                    col[i]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1||col[i]==1){
                    nums[i][j]=0;
                }
            }
        }

    }
    public static void anothermethod(int[][]nums){
        int col0=1;
        int n=nums.length;
        int m=nums[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums[i][j]==0){
                    // set their ith row in the first col
                    nums[i][0]=0;
                }else{
                    col0=0;//if there is zero in first col
                }
                nums[0][j]=0; //mark the jth column in the first row 
            }
        }
        // update the rest of the matrix based on the markers
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums[0][j]==0||nums[i][0]==0){
                    nums[i][j]=0;
                }
            }
        }
        // handle the first row specialize
        if(nums[0][0]==0){
            for(int j=0;j<m;j++){
                nums[0][j]=0;
            }
        }
        // handle the first coloumn
        if(col0==0){
            for(int i=0;i<n;i++){
                 nums[i][0]=0;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
/*
 * Updating the Matrix:

Iteration 1 (i=0):
matrix[0][0] = 1 → No change
matrix[0][1] = 2, but col[1] = 1 → Set matrix[0][1] = 0
matrix[0][2] = 3 → No change
Matrix after row 0 update:

[1, 0, 3]
[4, 0, 6]
[7, 8, 9]
Iteration 2 (i=1):
row[1] = 1, so all elements in row 1 should be 0
matrix[1][0] = 4 → Set to 0
matrix[1][1] = 0 → Already 0
matrix[1][2] = 6 → Set to 0
Matrix after row 1 update:

[1, 0, 3]
[0, 0, 0]
[7, 8, 9]
Iteration 3 (i=2):
matrix[2][0] = 7 → No change
matrix[2][1] = 8, but col[1] = 1 → Set matrix[2][1] = 0
matrix[2][2] = 9 → No change
Final Matrix:

[1, 0, 3]
[0, 0, 0]
[7, 0, 9]
Final Output
[
  [1, 0, 3],
  [0, 0, 0],
  [7, 0, 9]
]
Every row and column containing a 0 has been properly modified.


 */
