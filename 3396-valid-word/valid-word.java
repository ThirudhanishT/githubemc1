class Solution {
    public boolean isValid(String word) {
        boolean d=word.matches(".*[0-9].*");
        boolean v = word.matches(".*[aeiouAEIOU].*");
        boolean c = word.matches(".*[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z].*");
        boolean s=word.matches(".*[@#$%^&*!].*");
        int l=word.length();
        if(s)
        {
            return false;
        }
        return l>=3 && v && c;
    }
}