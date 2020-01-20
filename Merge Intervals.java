 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

          ArrayList<Interval> result = new  ArrayList<>();
          
          for(int i =0 ;i< intervals.size();i++)
          {
              Interval interval = intervals.get(i);
              
              if(interval.end < newInterval.start)
              {
                  result.add(interval);
              }
              else if(interval.start>newInterval.end)
              {
                  result.add(newInterval);
                  result.addAll(intervals.subList(i,intervals.size()));
                  return result;
              }
              else
              {
                  int start = Math.min(interval.start,newInterval.start);
                  int end   = Math.max(interval.end,newInterval.end);
                  newInterval.start = start;
                  newInterval.end = end;
                  
              }
          }
          
          result.add(newInterval);
          return result;
          
          


    }
}
