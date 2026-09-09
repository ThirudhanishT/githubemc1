class Solution {
    long function(int n,int r)
    {
        long res=1;
        for(int i=0;i<r;i++)
        {
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> answ=new ArrayList<>();
        long ans;
        for(int i=0;i<=rowIndex;i++)
        {
            ans=function(rowIndex,i);
            answ.add((int)ans);
        }
        return answ;
    }
}