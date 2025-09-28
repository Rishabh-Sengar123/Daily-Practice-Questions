// Last updated: 9/28/2025, 6:34:24 PM
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long min_time = Arrays.stream(time).min().getAsInt();
        long l = 1, m = 0, r = min_time * totalTrips;
        long curr_trips = 0;
        while (l <= r) {
            m = (l + r) / 2;
            curr_trips = 0;
            for (int i = 0; i < time.length; i++) {
                curr_trips += Math.floorDiv(m, time[i]);
            }
            if (curr_trips >= totalTrips) {
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }
        return l;
    }
}