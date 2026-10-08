class Solution {

    static void fillAll(int[] arr , String ss) {


    for( char ch : ss.toCharArray()){
      arr[ch-'a']++;
    }
  }
    public List<List<String>> groupAnagrams(String[] s) {

    List<List<String>>aa =  new ArrayList<>();
      HashMap<String,ArrayList<String>>p = new HashMap<>();
    int arr[] = new int[26];
     for(int i = 0;i<s.length;i++){

    StringBuilder sb = new StringBuilder("");
     fillAll(arr , s[i]);
   for( int  j = 0;j<arr.length;j++){
    if( arr[j]> 0){
        while(arr[j] != 0 ){
        char ch = (char)('a'+j);
        arr[j]--;
        sb.append(ch);
        }
    }


   }
    if(p.containsKey(sb.toString())){
        p.get(sb.toString()).add(s[i]);
     }else{
        p.put(sb.toString() , new ArrayList<>(List.of(s[i])));
      }
    
   
     }

     
    for(String k  : p.keySet()){
      
      ArrayList<String>a = p.get(k);
      aa.add(a);
    }



     return aa;

    }
}