class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.indexOf(needle)!=-1)
        {
            return haystack.indexOf(needle);
        }
        return -1;
    }
}