class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int value = 26 - (ch - 'a');
            map.put(ch, value);
        }
        int total=0;
        for(int i=0;i<s.length();i++)
        {
            char n=s.charAt(i);
            total+=map.get(n)*(i+1);
        }
        return total;
    }
}