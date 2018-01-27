package test_crack;

import java.util.List;

class _139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for (int i=0;i<s.length();i++) {
        	for (String e:wordDict) {
        		if (e.length()<=i+1 && s.substring(i+1-e.length(),i+1).equals(e) && dp[i+1-e.length()]) {
    				dp[i+1] = true;
    				break;
        		}
        	}
        }
        return dp[s.length()];
    }
}
