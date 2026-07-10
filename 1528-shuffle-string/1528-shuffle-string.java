class Solution {
    public String restoreString(String s, int[] indices) {

        HashMap<Integer,Character>hm = new  HashMap<>();
        StringBuilder ss =  new StringBuilder("");

        for( int i  = 0;i<indices.length;i++){
            char ch = s.charAt(i);
            hm.put(indices[i] ,ch);
        }

        Arrays.sort(indices);
        for( int i  = 0;i<indices.length;i++){
            ss.append(hm.get(indices[i]));
        }

        return ss.toString();
    }
}