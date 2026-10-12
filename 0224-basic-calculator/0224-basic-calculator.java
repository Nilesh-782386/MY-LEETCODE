class Solution {
    public int calculate(String s) {

    int currNum = 0;
    int sign = 1;
    int result = 0;

    Stack<Integer>st = new Stack<>();

    for(char ch : s.toCharArray()){



        if(Character.isDigit(ch)){
            currNum = currNum*10+ch-'0';
        }else if(ch == '+'){

           result += sign*(currNum);
           currNum = 0;
           sign  = 1; 
        }else if( ch == '-'){
           result += sign*(currNum);
           currNum = 0;
           sign  = -1; 

        }else if(ch == '('){
        
         st.push(result);
         st.push(sign);
         currNum = 0;
         result = 0;
         sign = 1;
        }else if(ch == ')' ){

        result  +=  (sign)*currNum;

        result = result*st.pop();
        result += st.pop();
        currNum = 0;
        sign = 1;
         }else{

         continue;
        }
    }
     
     
    return result+(sign)*currNum;  


    }
}