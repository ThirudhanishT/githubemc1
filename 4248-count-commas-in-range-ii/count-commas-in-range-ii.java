class Solution {
    public long countCommas(long n) {
        long threshold=1000;
        long count=0;
        while(threshold<=n)
        {
           count+=n-threshold+1;
           threshold*=1000;
        }
        return count;
    }
}