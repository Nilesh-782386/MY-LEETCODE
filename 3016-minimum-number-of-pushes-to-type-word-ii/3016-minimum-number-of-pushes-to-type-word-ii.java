class Solution {
     void rev( int arr[]){
    int i = 0;
    int j = arr.length-1;

    while (i < j ) {

      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }
    public int minimumPushes(String word) {

   HashMap<Character , Integer>hm  = new HashMap<>();
 

    for( int i  = 0;i<word.length();i++){
      char ch  = word.charAt(i);
     if(hm.containsKey(ch)){
      hm.put(ch , hm.get(ch)+1);
     }else{
      hm.put(ch ,1 );
     }
    }

    int tot = 0;
    int k = 0;
    int ans[] = new int[hm.size()];
    for( char  key : hm.keySet()){
      ans[k++] = hm.get(key);
    }
    Arrays.sort(ans);
     rev(ans);
    for(int i = 0;i<ans.length;i++){

  
      if(i<=7){
        tot += 1*ans[i];
         
      }
      if(i > 7  && i<= 15){
        tot += 2*ans[i];
      }
         if(i > 15  && i<= 23){
        tot += 3*ans[i];
      }

      if(i > 23  && i<= 30){
        tot += 4*ans[i];
      }
    }



    return tot;
    }

}