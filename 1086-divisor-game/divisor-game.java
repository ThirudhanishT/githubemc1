class Solution {
    public boolean divisorGame(int n) {
        int i=1;
        int count=0;
        while(i<n)
        {
            if(n%i==0)
            {
                n=n-i;
                count++;
                i=1;
            }
            else
            i++;
        }
        if(count%2==1)
        {
            return true;
        }
        return false;
    }
}