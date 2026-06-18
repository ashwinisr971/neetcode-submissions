class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> unq=new HashSet<>();
        int l=0,res=0;
        for(int r=0;r<s.length();r++){
            while(unq.contains(s.charAt(r))){
                unq.remove(s.charAt(l));
                l++;
            }
            unq.add(s.charAt(r));
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}
