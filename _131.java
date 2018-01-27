package test_crack;

import java.util.ArrayList;
import java.util.List;

class _131 {
    public List<List<String>> partition(String s) {
    	List<List<String>> res=new ArrayList<>();
    	
    	if (s==null || s.length()==0)
    		return res;

    	partion(res,new ArrayList<>(),getPalindromeTable(s),0,0,0,s);
    	
        return res;
    }
    
    public boolean[][] getPalindromeTable(String s) {
    	boolean[][] dp=new boolean[s.length()][s.length()];
    	
    	// Build a table for checking whether substring[i, j] is a palindrome. For example, if dp[0][3] is true, it means substring[0, 3] is a palindrome.
        for (int j=0;j<s.length();j++)
        	for (int i=0,k=j;i<s.length()-j;i++,k++)
            	dp[i][k]=(k==i || (s.charAt(i)==s.charAt(k) && (k==i+1 || dp[i+1][k-1])));
        
        return dp;
    }
    
    public void partion (List<List<String>> res, List<String> tmp, boolean[][] dp, int i, int j, int cnt, String s) {
    	if (j==s.length()) {
    		
    		// cnt means the number of words which in partitions we've sliced. If cnt equals the length of the original string, we add the partition to res.
    		if (cnt==s.length())
    			res.add(new ArrayList<>(tmp));
    		
    		return;
    	}
    	
    	// Cut.
    	if (dp[i][j]) {

    		// We only cut the substring into partition if the substring is a palindrome.
    		tmp.add(s.substring(i,j+1));
    		
    		// Update substring interval i, j and number of words which in partitions we've sliced, and continue to partition.
    		partion(res,tmp,dp,j+1,j+1,cnt+j-i+1,s);
    		
    		// Restore the tmp to the state before cut.
    		if (tmp.size()>0) tmp.remove(tmp.size()-1);
    	}
    	
    	// Not cut, which means we increase the length of the potential substring which could be sliced in the future.
    	partion(res,tmp,dp,i,j+1,cnt,s);
    }
}
