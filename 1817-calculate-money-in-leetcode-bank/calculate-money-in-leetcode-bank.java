class Solution {
    public int totalMoney(int n) {
        int amount=0;
        if(n<8){
            for(int i=1;i<=n;i++){
                amount+=i;
            }
            return amount;
        }
        int start=1;
        while(n>7){
            for(int i=start;i<start+7;i++){
                amount+=i;
            }
            n-=7;
            start++;
        }
        for(int i=start;i<start+n;i++){
            amount+=i;
        }
        return amount;
    }
}