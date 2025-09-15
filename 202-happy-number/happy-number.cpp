class Solution {
public:
    bool isHappy(int n) {
        std::unordered_set<int>seen;
        long long m=n;
        int rem;
        int temp;
        while(m!=1)
        {
            if(seen.count(m)) return false;
            seen.insert(m);
            while(m!=0)
            {
                rem=m%10;
                m=m/10;
                temp=temp+(rem*rem);
            }
            m=temp;
            temp=0;
        }
        if(m==1)
        {
            return true;
        }
        return false;
    }
};