class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int time=arrivalTime+delayedTime;
        int res=time%24;
        return res;
    }
}