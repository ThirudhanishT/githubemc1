class Solution {
    public int countCommas(int n) {
        int count=0;
        int t=1000;
        while(t<=n)
        {
            count+=n-t+1;
            t*=1000;
        }
        return count;
    }
}