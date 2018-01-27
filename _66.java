package test_crack;

class _66 {
    public int[] plusOne(int[] digits) {
    	digits[digits.length - 1]++;
        for (int i = digits.length - 1 ; i > 0 && digits[i] >= 10; i--) {
        	int raw = digits[i];
        	digits[i] = raw % 10;
        	digits[i-1] = raw / 10 + digits[i-1];
        }
        if (digits[0] >= 10) {
        	int raw = digits[0];
        	digits[0] = raw % 10;
        	int first = raw / 10;
        	int[] newArr = new int[digits.length+1];
        	newArr[0] = first;
        	for (int i=0 ; i < digits.length ; i++) {
        		newArr[i+1] = digits[i];
        		digits = newArr;
        	}
        }
        return digits;
    }
}
