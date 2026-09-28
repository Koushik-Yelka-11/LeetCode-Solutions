class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i+=k){
            int digit=0;
            for(int j=i;j<i+k;j++){
                digit+=s.charAt(j)-'a';
            }
            digit%=26;
            sb.append((char)('a'+digit));
        }
        return sb.toString();
    }
}