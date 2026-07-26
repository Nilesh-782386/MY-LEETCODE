class Solution {
    public int findJudge(int n, int[][] arr) {


   if (arr.length == 0) {
    return n == 1 ? 1 : -1;
}



      int max = 0;
      HashSet<Integer>h = new HashSet<>();
      int en[] = new int[n+1];
     for(int i = 0;i<arr.length;i++){
        int a = arr[i][0];
        int b = arr[i][1];
        en[b]++;
        h.add(a);
        
     }
     int i = 0;
     int k = 0;
     for(  i = 0;i<en.length;i++){
    if(en[i] > max){
        max = en[i];
        k = i;
    }
    
     }

     if(max == n-1 &&  !h.contains(k) ) return k;



       return -1;
    }
    


    }

