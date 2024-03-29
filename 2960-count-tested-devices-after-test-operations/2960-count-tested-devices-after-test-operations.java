class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int tested = 0;
        for(int i:batteryPercentages) {
            if(i-tested>0) {
                tested++;
            }
        }
        return tested;
    }
}