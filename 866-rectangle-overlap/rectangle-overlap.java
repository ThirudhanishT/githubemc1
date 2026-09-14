class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1=rec1[0];
        int y1=rec1[1];
        int x2=rec1[2];
        int y2=rec1[3];
        int x3=rec2[0];
        int y3=rec2[1];
        int x4=rec2[2];
        int y4=rec2[3];
        int x5,y5,x6,y6;
        x5=Math.max(x1,x3);
        y5=Math.max(y1,y3);
        x6=Math.min(x2,x4);
        y6=Math.min(y2,y4);
        if(x5<x6 && y5<y6)
        {
            if(x6-x5 >0 && y6-y5>0)
            return true;
        }
        return false;
    }
}