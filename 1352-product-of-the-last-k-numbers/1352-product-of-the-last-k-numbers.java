class ProductOfNumbers {
    int ans  = 1;
    ArrayList<Integer>a  = new ArrayList<>();

    public ProductOfNumbers() {
     
    }
    
    public void add(int num) {
     a.add(num);
    }
    
    public int getProduct(int k) {

        int i = a.size()-1;
     while(k >  0){
        ans = ans*a.get(i);
        i--;
        k--;
    }
     int curr = ans;
     ans =1;

    return curr; 
    }

}

