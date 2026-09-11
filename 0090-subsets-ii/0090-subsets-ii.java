class Solution {



void help(List<List<Integer>>ll ,  int arr[] , int idx , ArrayList<Integer>a){

if(idx == arr.length){
    ll.add(new ArrayList<>(a));
    return;
}

 a.add(arr[idx]);
 help(ll , arr , idx+1 , a);
 a.remove(a.size()-1);
 int i =  idx+1;
while(i < arr.length && arr[i] == arr[i-1])i++;
 help(ll , arr , i , a);

}
    public List<List<Integer>> subsetsWithDup(int[] arr) {

 Arrays.sort(arr);

        List<List<Integer>>ll =  new ArrayList<>();

        help(ll ,arr , 0 , new ArrayList<>() );

        return ll;
    }
}