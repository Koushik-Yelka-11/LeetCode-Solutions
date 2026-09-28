class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length()-1;i++){
                int digit1=s.charAt(i)-'0';
                int digit2=s.charAt(i+1)-'0';
                sb.append((char)(digit1+digit2)%10);
            }
            s=sb.toString();
        }
        return s.charAt(0)==s.charAt(1);
    }
}