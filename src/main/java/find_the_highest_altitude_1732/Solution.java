package find_the_highest_altitude_1732;

class Solution {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Find the Highest Altitude.
    Memory Usage: 36.5 MB, less than 75.59% of Java online submissions for Find the Highest Altitude.
     */
    public int largestAltitude(int[] gain) {
        int maxHigh = 0;
        int currHigh = 0;
        for (final int currGain : gain) {
            currHigh += currGain;
            maxHigh = Math.max(currHigh, maxHigh);
        }
        return maxHigh;
    }
}
