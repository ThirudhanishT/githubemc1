class Solution {
public:
    int climbStairs(int n) {
    long long int a=1;
    long long int b=1;
    long long int sum;
    while(n-1!=0)
    {
        sum=a+b;
        a=b;
        b=sum;
        n--;
    }
    return sum;  
    }
};