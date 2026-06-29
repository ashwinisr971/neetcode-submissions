class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int lmax=height[0];
        int rmax=height[n-1];

        int l=0,r=n-1;
        int res=0;
        while(l<r){
            if(lmax<=rmax){
                l++;
                lmax = Math.max(lmax,height[l]);
                res+=lmax-height[l];
            }else{
                r--;
                rmax=Math.max(rmax,height[r]);
                res+= rmax - height[r];
            }
        }

        return res;
    }
}
