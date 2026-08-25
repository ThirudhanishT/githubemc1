class Solution {
    public int missingMultiple(int[] nums, int k) {
        int min=999999999;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%k==0)
            {
                min=Math.min(min,nums[i]);
            }
        } 
        int i=1;
        while(true)
        {
            boolean found = false;

            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == k * i) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                return k * i;
            }

            i++; 
        }
    
    }
}