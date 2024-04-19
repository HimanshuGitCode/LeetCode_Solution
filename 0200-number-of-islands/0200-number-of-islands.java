class Solution {
    int directions[][] = new int[][] {{-1,0}, {0,1},{1,0}, {0,-1}};
    
    private void dfs(int row,int col,char[][] grid){
        if(row <0 || row>= grid.length || col<0 || col>=grid[0].length || grid[row][col] !='1'){
            return ;
        }
        grid[row][col] = '2';
        
        for(int direction[] : directions){
            int newRow = direction[0] + row;
            int newCol = direction[1] + col;
            dfs(newRow, newCol , grid);
        }
        
    }
    
 public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0;i<grid.length; i++){
            for (int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1') //if grid = 1 it will call dfs
                {
                    dfs(i,j,grid);
                    count +=1;
                }
            }
        }
     return count;
 }
}