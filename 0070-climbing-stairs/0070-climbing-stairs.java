class Solution {
    public int climbStairs(int n) {
    if(n == 1 || n== 2) return n;

int a = 1;
int b = 1;
int sum = a+b;
for( int i = 2;i<n;i++){
     a = b;
     b = sum;
     sum = a+b;

}
return sum;
    }
}