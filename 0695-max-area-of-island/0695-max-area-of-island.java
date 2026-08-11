class Pair{
     int x;
     int y ;

    Pair( int x  ,int y){
        this.x = x;
        this.y = y;
    }
}
class Solution {

    int max = 0;

     void bfs(int s , int t ,  boolean visit[][] , int arr[][]){
      
      int count =0;
     int r = arr.length;
     int c = arr[0].length;
        visit[s][t] = true;
        count++;

        Queue<Pair>p = new LinkedList<>();
        p.add( new Pair(s , t));

        while( !p.isEmpty()){
            Pair pr = p.poll();
            int i = pr.x;
            int j = pr.y;
        if(i-1 >=0  && !visit[i-1][j] && arr[i-1][j] == 1){
            visit[i-1][j] = true;
            p.add(new Pair( i-1,j));
            count++;
        }

        if(j+1 < c  && !visit[i][j+1] && arr[i][j+1] == 1){
            visit[i][j+1] = true;
              p.add(new Pair( i,j+1));
            count++;
        }


        if(j-1 >=0  && !visit[i][j-1] && arr[i][j-1] == 1){
            visit[i][j-1] = true;
              p.add(new Pair( i,j- 1));
            count++;
        }

        if(i+1<r  && !visit[i+1][j] && arr[i+1][j] == 1){
            visit[i+1][j] = true;
              p.add(new Pair( i+1,j));
            count++;
        }
        }

        max= Math.max( max , count);
    }

    public int maxAreaOfIsland(int[][] arr) {
max =0;
     int r = arr.length;
     int c = arr[0].length;
    boolean visit[][] = new  boolean[r][c];

     for( int i = 0;i<r;i++){
        for( int j = 0;j<c;j++){
            if(!visit[i][j] && arr[i][j] == 1){
                bfs(i , j , visit , arr);
            }
        }
     }


     return max;
    }


   
}


