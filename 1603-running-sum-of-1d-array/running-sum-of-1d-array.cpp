class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        vector<int> runningSum(nums.size());
        for(int i=0;i<nums.size();i++)
        {
            if(i==0)
            {
                runningSum[i]=nums[0];
            }
            else
            runningSum[i]=runningSum[i-1]+nums[i];
        }
        return runningSum;
    }
};