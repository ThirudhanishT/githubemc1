class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        List <String> l1=new ArrayList<>();
        List <String> l2=new ArrayList<>();
        String r1=null;
        String r2=null;
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(String i: word1)
        {
           sb1.append(i);
           r1=sb1.toString().trim();
        }
        for(String i:word2)
        {
           sb2.append(i);
           r2=sb2.toString().trim();
        }
        if(r1.equals(r2))
        {
            return true;
        }
        return false;
    }
}