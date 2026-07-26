class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        int n=(nums.size())*2;
        int m=(nums.size());
        vector<int> ans(n);
        vector<int> res(m);
        for(int i=0;i<n;i++)
        {
            if(i<m)
            {
                ans[i]=nums[i];
                res[i]=nums[i];
            }
            else
            {
                ans[i]=nums[i-m];
            }
        
        }
        return ans;
    }
};