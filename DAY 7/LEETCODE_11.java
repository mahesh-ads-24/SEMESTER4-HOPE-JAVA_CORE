
class LC_11 {
    public int maxArea(int[] height) {
        int left=0;
        int rgt=height.length-1;
        int max=0;
        while(left<rgt){
            int width=rgt-left;
            int hgt=Math.min(height[left],height[rgt]);
            int area=width*hgt;
            max=Math.max(max,area);
            if(height[left]<height[rgt])
                left++;
            else
                rgt--;
        }
        return max;
    }
}