class Solution {
    public int maxArea(int[] heights) {
        int l=0,r=heights.length-1;
        int res=0;
        while(l<r){
            int cap = (r-l)* Math.min(heights[l], heights[r]);
            res= Math.max(cap,res);
            if(heights[l]<=heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return res;
    }
}
