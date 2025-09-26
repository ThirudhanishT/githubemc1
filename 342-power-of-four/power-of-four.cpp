class Solution {
public:
    bool isPowerOfFour(int n) {
    if(n<0)
    {
        return false;
    }
    long long power=1;
    while(power<=n)
    {
        if(power==n)
        {
            return true;
        }
        power=power*4;
    }
    return false;
    }
};