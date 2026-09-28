class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr=text.split("\\s+");
        int count=0;
        for(String i:arr){
            boolean flag=true;
            for(char c:brokenLetters.toCharArray()){
                if(i.indexOf(c)!=-1){
                    flag=false;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}