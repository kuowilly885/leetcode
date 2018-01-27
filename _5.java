package test_crack;

class _5 {
    public String longestPalindrome(String s) {
        int size = s.length();
        boolean[][] dp = new boolean[size][size];
        String rslt = "";
        for (int j = 0 ; j < size ; j++) {
    		int k = j;
        	for (int i = 0 ; i < size - j ; i++) {
            	if (k == i || (s.charAt(i) == s.charAt(k) && (k == i+1 || dp[i+1][k-1]))) {
        			dp[i][k] = true;
        			if (k-i+1 > rslt.length()) rslt = s.substring(i,k+1);
        		}
        		k++;
        	}
        }
        return rslt;
    }
}
