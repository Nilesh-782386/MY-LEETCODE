class Solution {
     
  public int totalMoney(int n) {

      
      int count_7 = 0;
      int tot = 0;
      if(n <= 7) return ((n)*(n+1))/2;


      int k = 1;
for(int i = 1;i<n;i++){

  k = i*7;
  count_7++;
  if(k > n ) break;
}
int t = count_7;
count_7--;

      int i =0;
      for(i = 0;i<count_7;i++){
      
        tot += 28+7*i;
      }
      int ls =  n%7;

      while (ls > 0) {
        tot += t;
        t++;
        ls--;
      }
      
      return tot;
    }

}