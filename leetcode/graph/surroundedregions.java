// class Solution {
//     static void dfs(int row, int col, char[][] board, int[] delrow, int[] delcol) {
//         // Mark the current cell as visited by changing 'O' to '#'
//         board[row][col] = '#';
//         int n = board.length;
//         int m = board[0].length;

//         // Check all four possible directions (top, right, bottom, left)
//         for (int i = 0; i < 4; i++) {
//             int nrow = row + delrow[i];
//             int ncol = col + delcol[i];
//             if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && board[nrow][ncol] == 'O') {
//                 dfs(nrow, ncol, board, delrow, delcol);
//             }
//         }
//     }

//     public void solve(char[][] board) {
//         int n = board.length;
//         int m = board[0].length;

//         // Define movement directions (top, right, bottom, left)
//         int[] delrow = {-1, 0, 1, 0};
//         int[] delcol = {0, 1, 0, -1};

//         // Traverse first and last rows
//         for (int j = 0; j < m; j++) {
//             if (board[0][j] == 'O') {
//                 dfs(0, j, board, delrow, delcol);
//             }
//             if (board[n - 1][j] == 'O') {
//                 dfs(n - 1, j, board, delrow, delcol);
//             }
//         }

//         // Traverse first and last columns
//         for (int i = 0; i < n; i++) {
//             if (board[i][0] == 'O') {
//                 dfs(i, 0, board, delrow, delcol);
//             }
//             if (board[i][m - 1] == 'O') {
//                 dfs(i, m - 1, board, delrow, delcol);
//             }
//         }

//         // Final transformation: '#' → 'O' and 'O' → 'X'
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (board[i][j] == 'O') {
//                     board[i][j] = 'X'; // Surrounded regions are captured
//                 }
//                 if (board[i][j] == '#') {
//                     board[i][j] = 'O'; // Restore boundary-connected regions
//                 }
//             }
//         }
//     }
// }


// geeks for geeks
/*
 * Given a matrix mat where every element is either 'O' or 'X'. Replace all 'O' or a group of 'O' with 'X' that are surrounded by 'X'.

A 'O' (or a set of 'O') is considered to be surrounded by 'X' if there are 'X' at locations just below, just above, just left and just right of it.
class Solution {
    static void dfs(int row,int col,int vis[][],char mat[][],
    int delrow[],int delcol[]){
        vis[row][col]=1;
        int n=mat.length;
        int m=mat[0].length;
        // check for top,right,bottom,left
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0&&nrow<n&&ncol>=0&&ncol<m&&vis[nrow][ncol]==0&&mat[nrow][ncol]=='O'){
                dfs(nrow,ncol,vis,mat,delrow,delcol);
            }
        }
        
    }
    static char[][] fill(char mat[][]) {
        int n=mat.length;
        int m=mat[0].length;
        // code here
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        int vis[][]=new int[n][m];
        // traverse first row and last row
        for(int j=0;j<m;j++){
            // first row
            if(vis[0][j]==0&&mat[0][j]=='O'){
                dfs(0,j,vis,mat,delrow,delcol);
            }
            // last row
            if(vis[n-1][j]==0&&mat[n-1][j]=='O'){
                dfs(n-1,j,vis,mat,delrow,delcol);
            }
        }
        // traverse first coloumn and last coloumn
        for(int i=0;i<n;i++){
            if(vis[i][0]==0&&mat[i][0]=='O'){
                dfs(i,0,vis,mat,delrow,delcol);
            }
            // last coloumn
            if(vis[i][m-1]==0&&mat[i][m-1]=='O'){
                dfs(i,m-1,vis,mat,delrow,delcol);
            }
        }
        // if these are not boundry then it marked as 'X'
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0&&mat[i][j]=='O'){
                    mat[i][j]='X';
                }
            }
        }
        return mat;
        
    }
}
 */
