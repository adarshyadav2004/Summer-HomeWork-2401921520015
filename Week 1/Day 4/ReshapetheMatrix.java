public class ReshapetheMatrix {
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows= mat.length;
        int cols= mat[0].length;
        // check no element avalibale in matrix are equal to no of reshape matrix boxes
        if(rows*cols != r*c){
            return mat;
        }
        int[][] result = new int[r][c];
        for(int i=0;i<rows*cols;i++){
            result[i/c][i%c]=mat[i/cols][i%cols]; // logic 
        }
        return result;
    }
}
    
}
