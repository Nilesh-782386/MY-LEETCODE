class Solution {
     void freqCount(     ArrayList<Integer>a , int freq[] ){
      for (int i = 0; i < freq.length; i++) {
    if (freq[i] == 3) {
        a.add(i);
    }
}
     }
    public int countSpecialIntegers(int[] arr) {
    
    int n = arr.length;
    int freq[] = new int[101];

    for( int  i  : arr){
        freq[i]++;
    }
    ArrayList<Integer>a = new ArrayList<>();
    HashSet<Integer>h = new HashSet<>();
   int count = 0;
    freqCount(a , freq);

  for (int i = 0; i < a.size(); i++) {
    int num = a.get(i);
    int first = -1, second = -1, third = -1;

    for (int j = 0; j < n; j++) {
        if (arr[j] == num) {
            if (first == -1) first = j;
            else if (second == -1) second = j;
            else third = j;
        }
    }

    if (second - first == third - second) {
        count++;
    }
}

    return count;
    }
}

