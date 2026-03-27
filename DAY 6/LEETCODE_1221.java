
import java.util.*;
class LC_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int top=0, down=matrix.length-1;
        int left=0, rgt=matrix[0].length-1;
        while(top <= down && left<=rgt){
            for(int i=left;i<=rgt;i++){
                res.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=down;i++){
                res.add(matrix[i][rgt]);
            }
            rgt--;
            if(top<=down){
                for(int i=rgt;i>=left;i--){
                    res.add(matrix[down][i]);
                }
                down--;
            }
            if(left<=rgt){
                for(int i=down;i>=top;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}