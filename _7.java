package test_crack;

class _7 {
    public int reverse(int x) {
    	return x < 0 ? -reverse(-(long)x) : reverse((long)x);
    }
    
    public int reverse(long x) {
    	long reversedNumber = 0;
    	while (x > 0) {
            if ((reversedNumber = reversedNumber * 10 + x % 10) > Integer.MAX_VALUE) return 0;
            x /= 10;
    	}
    	return (int) reversedNumber;
    }
}
