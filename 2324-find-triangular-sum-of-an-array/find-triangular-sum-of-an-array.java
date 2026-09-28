class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1) return nums[0];
        int x=nums.length;
        int n=nums.length;
        while(x>1){
            for(int i=0;i<n-1;i++){
                nums[i]=(nums[i]+nums[i+1])%10;
            }
            x--;
            n--;
        }
        return nums[0];
    }
}