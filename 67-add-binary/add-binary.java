class Solution {
    public String addBinary(String a, String b) {
        String result="";
        int n=a.length();
        int m=b.length();
        int carry=0;
        int i=n-1;
        int j=m-1;
        while ( i >= 0 || j >= 0 || carry > 0) {
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = bitA + bitB + carry;
            result = (sum % 2) + result;
            carry = sum / 2;

            i--;
            j--;
        }

        return result;
    }
}

