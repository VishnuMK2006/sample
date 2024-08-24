class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int ri=0,ci=0,max=Integer.MIN_VALUE,c=0,i=0,j=0;
        for(j=0;j<matrix[0].length;j++){
        for(i=0;i<matrix.length;i++){
                if(matrix[i][j]==-1)
                c=1;
                if(max<=matrix[i][j])
                max=matrix[i][j];
            }
            if(c==1){
                for(int v=0;v<matrix.length;v++){
                    if(matrix[v][j]==-1)
                    matrix[v][j]=max;
                }
            }
            max=-1;
            c=0;
            
        }
        return matrix;
    }
}
