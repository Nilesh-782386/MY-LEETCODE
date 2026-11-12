class Solution {
    public int longestMonotonicSubarray(int[] arr) {
        
     int incrsSeq = 1;
     int decrSeq  = 1;

     int MaxincrsSeq = 0;
     int MaxdecrSeq  = 0;


   if( arr.length == 1) return 1;  
for( int i = 1;i<arr.length;i++){
    
   
   if(arr[i-1] < arr[i]){
    incrsSeq++;
   }else{
    incrsSeq = 1;
   }
  MaxincrsSeq =  Math.max(incrsSeq ,MaxincrsSeq );
}


for( int i = 1;i<arr.length;i++){
    
   
   if(arr[i-1] > arr[i]){
    decrSeq++;
   }else{
    decrSeq = 1;
   }
  MaxdecrSeq =  Math.max(decrSeq ,MaxdecrSeq );
}



 return Math.max(MaxdecrSeq , MaxincrsSeq);

    


    }
}