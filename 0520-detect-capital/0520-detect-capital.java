class Solution {
    public boolean detectCapitalUse(String word) {


  

   int countCap = 0;
   int countSmall = 0;

  for(char ch : word.toCharArray()){

     int num = (int)ch;

     if(num  < 97 ) countCap++;
     if( num > 96 )countSmall++;
  }  
   
   
  if(countSmall == word.length())return true;
  if(countCap == word.length())return true;

  if( (int)(word.charAt(0)) < 97 && countCap == 1  ) return true;

  return false;
    }
}