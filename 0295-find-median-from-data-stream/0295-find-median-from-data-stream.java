class MedianFinder {
   
   PriorityQueue<Integer>min =  new PriorityQueue<>();
   PriorityQueue<Integer>max =  new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {


    }
    
    public void addNum(int num) {

     
     if( max.size() == 0 ){

        max.add(num);
     }else if( max.peek()  >=   num ){

        max.add(num);
     }else{
        min.add(num);
     }

     
     if(max.size() > min.size()+1){

       while( max.size() > min.size()+1 ){

        if( max.size()  ==  min.size())  break;

        min.add(max.poll());
       } 
    }


    if( max.size() < min.size()){

     while( max.size() < min.size() ) {

        if( max.size() == min.size()+1) break;
        if( max.size()  == min.size()) break;
        max.add(min.poll());

     }
    }


    }
    
    public double findMedian() {


      if(min.size() == max.size()) return (min.peek() + max.peek())/2.0;


      return max.peek();  
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */