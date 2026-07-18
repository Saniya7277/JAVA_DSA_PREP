class Solution {
    public int pascalTriangleI(int r, int c) {
        int[][] ar=new int[r+1][r+1];
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                    ar[i][j]=1;
                }
                else{
                    ar[i][j]=ar[i-1][j]+ar[i-1][j-1];
                }
            }


        }
        return ar[r][c];

    }
}
