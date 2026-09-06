class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left=0;
        int right=s.length()-1;
        boolean pal=true;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                pal=false;
                break;
            }
            left++;
            right--;
        }
        return pal;
    }
}