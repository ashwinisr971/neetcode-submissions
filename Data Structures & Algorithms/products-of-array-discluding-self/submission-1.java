class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prd=1, zeroCount = 0;
        for(int i:nums){
            if(i!=0){
                prd*=i;
            }else{
                zeroCount++;
            }
        }

        if (zeroCount > 1) {
            return new int[nums.length];
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 0) {
                res[i] = (nums[i] == 0) ? prd : 0;
            } else {
                res[i] = prd / nums[i];
            }
        }
        return res;
    }
}  
