class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=0;
        while(left<right){
            int w=right-left;
            int h=Math.min(height[left],height[right]);
            int currArea=w*h;
            maxArea=Math.max(maxArea,currArea);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }

        }
        return maxArea;


        // int max=0;
        // for(int i=0;i<height.length;i++){
        //     for(int j=0;j<height.length;j++){
        //         if(i!=j){
        //             int h=Math.min(height[i],height[j]);
        //             int w=Math.abs(j-i);
        //             int area=h*w;
        //             max=Math.max(area,max);
        //         }
        //     }
        // }
        // return max;
    }
}