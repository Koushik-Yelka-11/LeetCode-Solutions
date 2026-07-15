class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumEven=0,sumOdd=0;
        int Odd=-1;
        int Even=0;
        int x=0;
        while(x<n){
            Even=(Even+2);
            Odd=(Odd+=2);
            sumEven+=Even;
            sumOdd+=Odd;
            x++;
        }
        int min=Math.min(sumOdd,sumEven);
        System.out.print(min);
        for(int i=min;i>0;i--){
            if(sumOdd%i==0 && sumEven%i==0){
                return i;
            }
        }
        return -1;
    }
}