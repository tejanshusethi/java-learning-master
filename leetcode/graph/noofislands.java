// class Solution {
//     public void dfs(char[][]grid,int i,int j){
//         if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]=='0'){
//             return;
//         }
//         grid[i][j]='0';
//         dfs(grid,i+1,j);
//         dfs(grid,i-1,j);
//         dfs(grid,i,j+1);
//         dfs(grid,i,j-1);
//     }
//     public int numIslands(char[][] grid) {
//         int count=0;
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j]=='1'){
//                     dfs(grid,i,j);
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// // }



// geeks for geeks
// Note: An island is either surrounded by water or the boundary of a grid and is formed by connecting adjacent lands horizontally 

// or vertically or diagonally i.e., in all 8 directions
/*
 * class Solution {
    class Pair{
        int first;
        int second;
        public Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    private void bfs(int ro,int co,int[][]vis,char[][]grid){
        vis[ro][co]=1;
        Queue<Pair>q=new LinkedList<Pair>();
        q.add(new Pair(ro,co));
        int n=grid.length;
        int m=grid[0].length;
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();
            // traverse the nieghbours and mark them if they are land
            for(int delrow=-1;delrow<=1;delrow++){
                for(int delcol=-1;delcol<=1;delcol++){
                    int nrow=row+delrow;
                    int ncol=col+delcol;
                    if(nrow>=0&&nrow<n&&ncol>=0&&ncol<m&&grid[nrow][ncol]=='1'&&
                    vis[nrow][ncol]==0){
                        vis[nrow][ncol]=1;
                        q.add(new Pair(nrow,ncol));
                    }
                }
            }
        }
        
    }
    public int numIslands(char[][] grid) {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        int [][]vis=new int[n][m];
        int cnt=0;
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                if(vis[row][col]==0&&grid[row][col]=='1'){
                    cnt++;
                    bfs(row,col,vis,grid);
                }
            }
        }
        return cnt;
        
    }
 */