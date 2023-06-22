public class Setmatrixzero {
   class Solution {
    public void setZeroes(int[][] matrix) {
        int i = 0 ;
        int j = 0 ;
       
        boolean fr = false,fc = false;
        for(i = 0; i < matrix.length;i++){
            for( j = 0; j< matrix[0].length;j++){
             if(matrix[i][j] == 0){
                if(i == 0) fr = true;
                if(j == 0) fc = true;
               matrix[i][0] = 0;
               matrix[0][j] = 0;
             }   
            }
        }
        for(i =1; i<matrix.length;i++){
            for(j = 1; j< matrix[0].length;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(fr) {
        for( j = 0; j < matrix[0].length; j++) {
            matrix[0][j] = 0;
        }
    }
    if(fc) {
        for( i = 0; i < matrix.length; i++) {
            matrix[i][0] = 0;
        }
    }
}
}
}
