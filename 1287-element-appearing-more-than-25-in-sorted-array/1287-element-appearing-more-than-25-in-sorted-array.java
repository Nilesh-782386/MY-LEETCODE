class Solution {
    public int findSpecialInteger(int[] arr) {
        
    
    double   freq = (arr.length/4.0);

    int fr = (int)freq;
    HashMap<Integer, Integer>h =  new HashMap<>();
    for( int i = 0;i<arr.length;i++){

        if(h.containsKey(arr[i])){
        h.put(arr[i] ,  h.get(arr[i])+1);
    }else{
         h.put(arr[i] , 1);
    }
    }
    for(int  k : h.keySet()){
        if(h.get(k) > fr){
            return  k;
        }
    }

    return -1;

    }
}