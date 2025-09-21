import java.util.*;

public class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals based on start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> mergedIntervals = new ArrayList<>();
        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];

        // Step 2: Traverse intervals
        for (int i = 1; i < intervals.length; i++) {
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if (currentEnd < nextStart) {
                // No overlap, add the previous interval
                mergedIntervals.add(new int[] { currentStart, currentEnd });
                currentStart = nextStart;
                currentEnd = nextEnd;
            } else {
                // Overlapping intervals, merge by updating the end
                currentEnd = Math.max(currentEnd, nextEnd);
            }
        }

        // Add the last interval
        mergedIntervals.add(new int[] { currentStart, currentEnd });

        // Convert list back to array
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
