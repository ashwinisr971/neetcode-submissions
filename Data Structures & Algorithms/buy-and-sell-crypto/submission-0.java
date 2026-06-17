class Solution {
    public int maxProfit(int[] prices) {
        int[] lmin=new int[prices.length];
        int[] rmax=new int[prices.length];
        lmin[0]=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<lmin[i-1]){
                lmin[i]=prices[i];
            }else{
                lmin[i]=lmin[i-1];
            }
        }
        rmax[rmax.length-1]=prices[prices.length-1];
        int currPr=0;
        int maxPr=0;
        for(int i=prices.length-2;i>=0;i--){
            if(prices[i]>rmax[i+1]){
                rmax[i]=prices[i];
            }else{
                rmax[i]=rmax[i+1];
            }
            currPr=rmax[i]-lmin[i];
            maxPr=Math.max(currPr,maxPr);
        }
        return maxPr;
    }
}
