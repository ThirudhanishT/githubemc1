class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max=0.0;
        int maxa=0;
        for(int i=0;i<dimensions.length;i++)
        {
            int l=dimensions[i][0];
            int b=dimensions[i][1];
            double m=(double)Math.sqrt(l*l+b*b);
            int area=l*b;
            if(max<m || max==m && area>maxa)
            {
                max=m;
                maxa=area;
            }
        }
        return maxa;
    }
}