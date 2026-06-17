class Solution {
    public int maxProfit(int[] prices) {
       int l=0;
       int r=1;
       int maxPr=0;
       while(r<prices.length){
            if(prices[r]>prices[l]){
                int pr=prices[r]-prices[l];
                maxPr=Math.max(maxPr,pr);
            }else{
                l=r;
            }
            r++;
       }
       return maxPr;
    }
}
