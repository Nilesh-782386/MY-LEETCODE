class Solution {

    boolean allZero( int  arr[]){
        
    for( int i : arr){
    if( i != 0 ) return false; 
    }
    return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
    
    int i = 0;
    int j = 0;
    List<Integer>l = new ArrayList<>();
    int  arr[] = new  int[26];
    int n = s.length();
    int k = p.length();
    for( int m = 0;m<p.length();m++){
    int ch = p.charAt(m)-'a';
    arr[ch]++;
    }

    while( j < n){
    char ch  =  s.charAt(j);

    arr[ch-'a']--;

    if(j-i+1 == k ){

       if(allZero(arr)){
            l.add(i);
        }
         arr[s.charAt(i)-'a']++;
         i++;
       }
       
 j++;
    }
    return  l;
    }
}