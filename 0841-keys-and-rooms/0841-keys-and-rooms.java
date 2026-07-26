class Solution {

    void dfs( int start ,List<List<Integer>> rooms ,  boolean visit[] ){

        visit[start] = true;


        for( int val : rooms.get(start)){
            if(!visit[val]){

                visit[val] = true;
                dfs(val , rooms , visit);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {


       boolean visit[]   = new boolean[rooms.size()];


       visit[0] = true;

       dfs(0 , rooms , visit);

    for( boolean  b : visit){
        
        if(!b) return b;
    }

    return  true;
    }
}