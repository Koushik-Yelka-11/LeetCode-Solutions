class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(String i:arr){
            if(map.get(i)==1 && k==1){
                return i;
            }else if(map.get(i)==1 && k>1){
                k--;
            }
        }
        return new String("");
    }
}