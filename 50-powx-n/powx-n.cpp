class Solution {
public:
    double myPow(double x, int n) {
        long long int m=n;
        if(m<0)
        {
            x=1/x;
            m=-m;
        }
        double result=1.0;
        while(m>0)
        {
            if(m%2==1)
            {
                result=result*x;
            }
            x=x*x;
            m=m/2;
        }
        return result;
    }
};