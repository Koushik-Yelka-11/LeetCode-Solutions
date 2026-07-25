import java.util.*;
class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> nums = new ArrayList<>();
        while(n>0){
            nums.add(n%10);
            n/=10;
        }
        nums.sort(Comparator.naturalOrder());
        int a=nums.get(nums.size() - 1);
        int b=nums.get(nums.size() - 2);
        return  a*b;
    }
}