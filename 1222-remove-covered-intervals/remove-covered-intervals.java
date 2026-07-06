import java.util.Arrays;

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        // Sort intervals
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0])
                return b[1] - a[1];   // Descending end value
            return a[0] - b[0];       // Ascending start value
        });

        int count = 0;
        int maxEnd = 0;

        for (int[] interval : intervals) {

            // Covered interval
            if (interval[1] <= maxEnd) {
                continue;
            }

            // Not covered
            count++;
            maxEnd = interval[1];
        }

        return count;
    }
}