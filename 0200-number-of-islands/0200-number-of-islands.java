class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        
        boolean visit[][] =  new  boolean[n][m];



       
for( int i = 0;i<grid.length;i++){
    for(int j = 0;j<m;j++){
        if(!visit[i][j] && grid[i][j] == '1'){
             bfs( grid ,visit ,i ,j );
             count++;
        }
    }
}

return count;

    }


    void bfs(char[][] grid ,boolean[][] visit , int  i , int j){

        int n = grid.length;
        int m = grid[0].length;
        visit[i][j] = true;

        Queue<Pair>pq = new LinkedList<>();

        pq.add(new Pair(i , j ));

        while(!pq.isEmpty()){

            Pair p = pq.poll();

            int r = p.x;
            int c  = p.y;

            if(r+1 < n && !visit[r+1][c] && grid[r+1][c] == '1'){
                pq.add(new Pair(r+1 , c));
                visit[r+1][c] = true;
            }

             if(r > 0  && !visit[r-1][c] && grid[r-1][c] == '1'){
                pq.add(new Pair(r-1 , c));
                visit[r-1][c]= true;
            }

             if(c+1 < m && !visit[r][c+1] && grid[r][c+1] == '1'){
                pq.add(new Pair(r, c+1));
                visit[r][c+1]= true;
            }


             if( c >  0 && !visit[r][c-1] && grid[r][c-1] == '1'){
                pq.add(new Pair(r, c-1));
                visit[r][c-1]= true;
            }

        }

    }

}

class Pair{

    int x ;
    int y ;

    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}