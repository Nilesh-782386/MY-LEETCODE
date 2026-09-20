class Solution {
    public int countDigitOccurrences(int[] arr, int dig) {


     StringBuilder sb = new StringBuilder();

     for( int num : arr){
      sb.append(num);
     }
      int count = 0;

     System.out.println(sb);

     int i = 0;
     while (i <sb.length() ) {

      int el  = sb.charAt(i)-'0';
      i++;
     
      if(el == dig ) count++;
      
     }

     return  count;
    }
}