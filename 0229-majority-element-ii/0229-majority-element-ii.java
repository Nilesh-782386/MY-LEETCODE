class Solution {
    public List<Integer> majorityElement(int[] arr) {


       int n  = arr.length;
        int  maj1 = 0;
        int maj2 = 0;
        int freq1=0;
        int freq2=0;
         ArrayList<Integer>a =  new ArrayList<>();
    

    for(int i =0;i<arr.length;i++){
        
        if(maj1 == arr[i]){
             freq1++;
        }else if(maj2 == arr[i]){
          freq2++;
    }else if( freq1 ==  0 ){
             freq1 = 1;
             maj1 = arr[i];
    }else if( freq2 ==  0 ){
            freq2 = 1;
             maj2 = arr[i];
}else{
    freq1--;
    freq2--;
}
    }



freq1 = 0;
freq2 = 0;
 for( int i  : arr){
        if(i == maj1) freq1++;
        if(i == maj2) freq2++;
       }

       if(maj1 == maj2){
        a.add(maj1);
        return a;
       }
      
       if(freq1>n/3) a.add(maj1);
       if(freq2>n/3) a.add(maj2);
       return a;

    }
    
}
