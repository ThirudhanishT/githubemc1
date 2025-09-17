class Solution {
    public int numberOfMatches(int n) {
        int matches;
        int advance;
        int count=0;
        do{
            if(n%2==0)
            {
                matches=n/2;
                advance=n/2;
                count=count+matches;
                n=advance;
            }
            else
            {
                matches=(n-1)/2;
                advance=((n-1)/2)+1;
                count=count+matches;
                n=advance;
            }
        }while(advance>1);
        return count;
        }
    }