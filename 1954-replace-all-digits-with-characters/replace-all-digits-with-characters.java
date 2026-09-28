class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder();
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(Character.isLetter(arr[i])){
                sb.append(arr[i]);
            }else{
                sb.append((char)(arr[i-1]+Character.getNumericValue(arr[i])));
            }
        }
        return sb.toString();
    }
}