class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        subsetsRec(nums,curr,nums.length-1,res);
        return res;
    }

    public void subsetsRec(int[] nums, List<Integer> curr,int index, List<List<Integer>> res){
        if(index<0){
             res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        subsetsRec(nums,curr,index-1,res);
        curr.remove(curr.size()-1);
        subsetsRec(nums,curr,index-1,res);
    }
}
