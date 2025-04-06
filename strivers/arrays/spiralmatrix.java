import java.util.*;
public class spiralmatrix {
    public static List<Integer>spiralmatrix(int[][]matrix){
        List<Integer>ans=new ArrayList<>();
        int startrow=0;
        int startcol=0;
        int row=matrix.length;
        int col=matrix[0].length;
        int endrow=row-1;
        int total=row*col;
        int endcol=col-1;
        int count=0;
        // first row
        while(count<total){
            for(int idx=startcol;count<total&&idx<=endcol;idx++){
                 ans.add(matrix[startrow][idx]);
                 count++;
            }
            startrow++;
            // last col
            for(int idx=startrow;count<total&&idx<=endrow;idx++){
                ans.add(matrix[idx][endcol]);
                count++;
            }
            endcol--;
            // last row
            for(int idx=endcol;count<total&&idx>=startcol;idx--){
                    ans.add(matrix[endrow][idx]);
                    count++;
            }
            endrow--;
            // first col
            for(int idx=endrow;count<total&&idx>=startrow;idx--){
                ans.add(matrix[idx][startcol]);
                 count++;
            }
            startcol++;
        }
        return ans;

    }
public static void main(String[] args) {
    
}
}
