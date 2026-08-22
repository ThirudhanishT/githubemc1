class Solution {
    public boolean checkDivisibility(int n) {
        int rem=0;
        int sum=0;
        int temp=n;
        int temp1=n;
        while(n!=0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        int product=1;
        while(temp!=0)
        {
            rem=temp%10;
            product=product*rem;
            temp=temp/10;
        }
        int res=sum+product;
        if(temp1%res==0)
        {
            return true;
        }
        return false;
    }
}