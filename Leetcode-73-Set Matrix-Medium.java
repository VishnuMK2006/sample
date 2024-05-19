/*Space complexity-->O(m+n)[as per Chatgpt].
Way-1

*/

class Solution {
    public void setZeroes(int[][] arr) {
        int r[]=new int[200];
        int c[]=new int[200];
       int row,col,in=0;
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==0){
                r[in]=i;
                c[in]=j;
                in++;
            }
        }
       }
       for(int i=0;i<in;i++){
        row=r[i];col=c[i];
        //column tends to zero
        for(int j=0;j<arr[0].length;j++){
            arr[row][j]=0;
        }
        //row tends to zero
        for(int j=0;j<arr.length;j++){
            arr[j][col]=0;
        }
       }
    }
}

/*Space Complexity-->O(m*n)[as per Chatgpt].
way - 2

*/

class Solution {
    public void setZeroes(int[][] arr) {
        byte check[][]=new byte[arr.length][arr[0].length];/*byte array because it use 1 byte in memory for efficiency*/
       int row,col;
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==0){
                check[i][j]=1;
            }
        }
       }
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(check[i][j]==1){
        row=i;col=j;
        
        //column tends to zero
        for(int j1=0;j1<arr[0].length;j1++){
            arr[row][j1]=0;
        }
        //row tends to zero
        for(int j1=0;j1<arr.length;j1++){
            arr[j1][col]=0;
        }
        }
        }
        }
        
       
    }
}