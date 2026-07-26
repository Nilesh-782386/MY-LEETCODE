class Solution {
    public boolean validPath(int n, int[][] arr, int st, int end) {

        ArrayList<ArrayList<Integer>>aa = new ArrayList<>();


        for( int i  = 0;i<n;i++) aa.add(new ArrayList<>());

        for(int i = 0;i<arr.length;i++){
            int a = arr[i][0];
            int b = arr[i][1];
            aa.get(a).add(b);
            aa.get(b).add(a);
        }


     boolean vis[] = new boolean[n];

        Queue<Integer>q = new LinkedList<>();

         q.add(st);

        while(!q.isEmpty()){
        int num = q.poll();
        vis[num] = true;
        if(vis[num] == vis[end] )return true;
        for(int val : aa.get(num)){

        if(!vis[val]){
          q.add(val);
          vis[val] = true;
        }
        }
          }



return  vis[end];
    }
}