public class MatrixDiagonalSum {
    class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
                    sum+=mat[i][i]; //primary diagonal
                    sum+=mat[i][n-i-1];// secondary diagonal
        }
                if(n%2==1){
                    sum-=mat[n/2][n/2]; // whenn n is even subtract middile elemnt once
                }
            
        
        return sum;
        
    }
}
    
}
