class MedianFinder {

    PriorityQueue<Integer>min =  new PriorityQueue<>();
    PriorityQueue<Integer>max =  new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {
        
    }
    public void addNum(int num) {

        if(max.isEmpty()){
            max.add(num);
        }
       else  if(num <= max.peek()){
            max.add(num);
        }else{
             min.add(num);
        }

        if(max.size()-min.size() > 1 ){

            while( (max.size() -min.size()) >= 0 ){
            if(max.size() == min.size()) break;
              min.add(max.poll());
            }
        } 

         if(min.size()-max.size() >=  1 ){

            while( (min.size()- max.size()) >= 0 ){
                if(max.size() == min.size()) break;
               max.add(min.poll());
            }
        }
    }
    
    public double findMedian() {
     if(min.size() ==  max.size()) return (double)(min.peek()+max.peek())/2.0;

     return max.peek();
    }
}
