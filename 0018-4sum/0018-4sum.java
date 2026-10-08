class Solution {
    public List<List<Integer>> fourSum(int[] arr, int tarr) {

      long   tar = (long)tarr;
        List<List<Integer>>aa  = new ArrayList<>(); 

      Arrays.sort(arr);
      
      for(int l = 0;l<arr.length;l++){
      if(l != 0 && arr[l-1] == arr[l]) continue;
      for(int i = l+1;i<arr.length;i++){

    if(i != l+1 && arr[i-1] == arr[i]) continue;

    int st = i+1;
    int end = arr.length-1;
     while( st < end){
      long  sum = (long) arr[l] + arr[i]+arr[st]+arr[end];


      if( sum == tar ){

        aa.add(new ArrayList<>(Arrays.asList(arr[l] , arr[i] , arr[st] , arr[end] )));

        st++;
        end--;

        while( st < end  && arr[st] == arr[st-1])st++;
        while( st < end  && arr[end] == arr[end+1])end--;

      }else if( sum  < tar ){

        st++;
      }else{
        end--;
      }
     }

      }

      }
      return aa;
    }
}