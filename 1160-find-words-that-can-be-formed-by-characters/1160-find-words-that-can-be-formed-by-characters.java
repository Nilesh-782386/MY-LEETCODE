class Solution {
     boolean  isContains(String s , HashMap<Character, Integer>h){
    

    HashMap<Character ,Integer>hh = new HashMap<>();
    for( int i = 0; i<s.length();i++){
        char ch = s.charAt(i);
        hh.put(ch , hh.getOrDefault(ch , 0)+1);
       }

        for( int i = 0; i<s.length();i++){
        char ch = s.charAt(i);
        
         if(!h.containsKey(ch))return false;
         if(hh.containsKey(ch)){
            if(hh.get(ch) > h.get(ch)) return false;
        }
       }
return true;
    
   }
    public int countCharacters(String[] arr, String s) {
      
HashMap<Character ,Integer>h = new HashMap<>();
for( int i =0;i<s.length();i++){
    char ch = s.charAt(i);
    h.put(ch , h.getOrDefault(ch , 0)+1);
}
int tot = 0;

 for( int i = 0;i<arr.length;i++){
    if(isContains(arr[i] , h)){
        tot += arr[i].length();
    }
 }
return tot;

    }
}