class Solution {


  public  int[]  nextMin(int[] arr) {

    Stack<Integer>st = new Stack<>();

      int  res[] = new int[arr.length];

       int n = arr.length;

       res[n-1] = n;

      st.push(n-1);

      for( int i = n-2;i>=0 ;i--){

     while (!st.isEmpty() &&   arr[st.peek()]  >=  arr[i] ) st.pop();

     if(st.size() == 0) res[i] = n;
     else   res[i]  = st.peek();

     st.push(i);    
      }
      

      return  res;

    }


    public  int[] preMin(int[] arr) {

   Stack<Integer>st = new Stack<>();

        int  res[] = new int[arr.length];

       int n = arr.length;

       res[0] = -1;

      st.push(0);

      for( int i = 1;i <n;i++){

     while (!st.isEmpty() &&   arr[st.peek()] >=   arr[i] ) st.pop();

     if(st.size() == 0) res[i] = -1;
     else   res[i]  = st.peek();

     st.push(i);    
      }
      

      return  res;

    }
    public int largestRectangleArea(int[] heights) {
        

        int  lft[] = preMin(heights);
        int  ryt[] = nextMin(heights);

        int max = 0;


        for( int i = 0;i<heights.length;i++){

            max = Math.max( max ,heights[i]*( (ryt[i]-lft[i])-1));
        }

        return max; 
    }
}