class Solution {
    public int majorityElement(int[] nums) {
        int majElm=nums[nums.length-1];
        int count=1;

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]==majElm){
                count++;
            }else{
                count--;
            }

            if(count==0){
                count=1;
                majElm=nums[i];
            }
        }
        return majElm;
    }
}