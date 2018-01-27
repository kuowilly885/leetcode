package test_crack;

class _171 {
    public int titleToNumber(String s) {
    	int num = 0;
    	int digit = 1;
        for (int i = s.length() - 1 ; i >= 0 ; i--) {
        	int c = s.charAt(i) - 'A' + 1;
        	num = num + (digit == 1 ? c : (c * digit));
        	digit*=26;
        }
        return num;
    }
}
