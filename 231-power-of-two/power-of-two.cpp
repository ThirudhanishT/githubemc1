class Solution {
public:
    bool isPowerOfTwo(int n) {
        if(n<0)
        {
            return false;
        }
        long long int power=1;
        while(power<=n)
        {
            if(power==n)
            {
                return true;
            }
            power=power*2;
        }
        return false;
    }
};