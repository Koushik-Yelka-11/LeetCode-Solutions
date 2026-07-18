class Solution {
    public int findGCD(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        int temp =min;
        int result=1;
        while (temp>1){
            if(min%temp==0 && max%temp==0){
                result=temp;
                break;
            }
            temp--;
        }
        return result;
    }
}