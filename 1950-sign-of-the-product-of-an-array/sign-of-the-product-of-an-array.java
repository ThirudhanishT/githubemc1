import java.math.BigInteger;
class Solution {
    public int arraySign(int[] nums) {
        BigInteger p=BigInteger.ONE;
        for(int i=0;i<nums.length;i++)
        {
            p=p.multiply(BigInteger.valueOf(nums[i]));
        }
        if(p.compareTo(BigInteger.ZERO)<0)
        {
            return -1;
        }
        if(p.compareTo(BigInteger.ZERO)>0)
        {
            return 1;
        }
        return 0;
    }
}