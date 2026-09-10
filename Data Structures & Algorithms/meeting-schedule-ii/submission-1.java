/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        TreeMap<Integer,Integer> numLine = new TreeMap<>();

        for(Interval i:intervals){
            numLine.put(i.start,numLine.getOrDefault(i.start,0)+1);
            numLine.put(i.end,numLine.getOrDefault(i.end,0)-1);
        }

        int curr=0;
        int res=0;
        for(int key:numLine.keySet()){
            curr+=numLine.get(key);
            res=Math.max(curr,res);
        }

        return res;
    }
}
