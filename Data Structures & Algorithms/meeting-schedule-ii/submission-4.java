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
        TreeMap<Integer,Integer> numLine=new TreeMap<>();
        for(Interval interval:intervals){
            numLine.put(interval.start,numLine.getOrDefault(interval.start,0)+1);
            numLine.put(interval.end,numLine.getOrDefault(interval.end,0)-1);
        }

        int curr =0;
        int res=0;

        for(int key: numLine.keySet()){
            curr+=numLine.get(key);
            res=Math.max(res,curr);
        }

        return res;
    }
}
