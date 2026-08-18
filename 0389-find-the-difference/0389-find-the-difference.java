class Solution {
    public char findTheDifference(String s, String t) {
     HashMap<Character , Integer>m1 = new HashMap<>();
        HashMap<Character , Integer>m2 = new HashMap<>();
        
        for( int i = 0; i<s.length(); i++){
          char ch = s.charAt(i);
          if(!m1.containsKey(ch)){
          m1.put(ch ,1);
          }else{
            m1.put(ch , m1.get(ch)+1);
          }
        }

       for( int i = 0; i<t.length(); i++){
          char ch = t.charAt(i);
          if(!m2.containsKey(ch)){
            if(!m1.containsKey(ch)){System.out.println(ch); return ch;}
          m2.put(ch ,1);
          }else{
            m2.put(ch , m2.get(ch)+1);
          }
        }
    
       for(Character c : m2.keySet()){
        if(m1.get(c) != m2.get(c)){
            return c;
        }
       } 
        
return 'a';
    }
}