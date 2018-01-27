package test_crack;

class _28 {
    public int strStr(String haystack, String needle) {
        int sizeOfBig = haystack.length();
        char firstCharOfSmall = needle.charAt(0);
        for (int i = 0 ; i < sizeOfBig ; i++) {
        	if (haystack.charAt(i) == firstCharOfSmall) {
        		if (checkWord(i, haystack, needle)) return i;
        	}
        }
    	return -1;
    	
    }
    
    public boolean checkWord(int i, String big, String small) {
    	if (i+small.length() - 1 < big.length()) {
    		for (int j = 0 ; j < small.length() ; j++) {
    			if (big.charAt(i) != small.charAt(j))
    				return false;
    		}
    	} else {
    		return false;
    	}
    	return true;
    }
}
