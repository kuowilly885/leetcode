package test_crack;

class _14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int end=strs[0].length()-1;
        for (int i=1,j=0;i<strs.length;i++) {
        	j=0;
        	for (;j<strs[i].length() && j<=end;j++) {
        		if (strs[i].charAt(j)!=strs[0].charAt(j)) {
        			end=j-1;
        			break;
        		}
        	}
        	if (end==-1) return "";
        	else end=--j;
        }
        return strs[0].substring(0,end+1);
    }
}
