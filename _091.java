package test_crack;

class _091 {
    public int numDecodings(String s) {
        int size = s.length();
        if (size == 0) return 0;
        if (size == 1) return s.charAt(0) > '0' ? 1 : 0;
        int[] dp = new int[size];
        dp[0] = s.charAt(0) > '0' ? 1 : 0;
        dp[1] = (s.charAt(1) > '0' ? dp[0] : 0) + ((s.charAt(0) == '2' && s.charAt(1) < '7') || s.charAt(0) == '1' ? 1 : 0);

        for (int i = 2; i < size ; i++)
        	if (dp[i-1] == 0 && dp[i-2] == 0) return 0;
        	else dp[i] = (s.charAt(i) > '0' ? dp[i-1] : 0) + ((s.charAt(i-1) == '2' && s.charAt(i) < '7') || s.charAt(i-1) == '1' ? dp[i-2] : 0);
        
        return dp[size - 1];
    }
}
