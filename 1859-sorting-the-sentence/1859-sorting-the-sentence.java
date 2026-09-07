class Solution {
    public String sortSentence(String s) {


             HashMap<Integer,String>hm = new HashMap<>();

        
        String arr[]  = s.split(" ");

        for(String ss: arr){
         int   idx  = ss.charAt(ss.length()-1)-'0';
         hm.put(idx ,ss.substring(0 , ss.length()-1));
        }
        


        int ans[] =  new int[hm.size()];
        int k = 0;
    for(String ss: arr){
          int   idx  = ss.charAt(ss.length()-1)-'0';
        ans[k++] = idx;
        }
         Arrays.sort(ans);
         int last = ans[ans.length-1];

          String ansString  = "";
     for(int  I  : ans){
       String sss = hm.get(I);
       ansString += sss;
    if(I != last)    ansString += " ";
     }

    return ansString;

    }
}