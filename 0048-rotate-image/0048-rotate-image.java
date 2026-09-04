class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int[][] tran = new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                tran[i][j]=matrix[j][i];
            }
        }
        int k=0;
        for(int i=0;i<n;i++){
            k=0;
            for(int j=n-1;j>=0;j--){
                matrix[i][k++]=tran[i][j];
            }
        }
    }
}