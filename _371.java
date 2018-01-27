package test_crack;

public class _371 {
    public int getSum(int a, int b) {
    	int res = 0, mask = 1, add = 0;
    	for (int i = 0 ; i < 32 ; i++, mask <<= 1) {
    		if ((a & mask ^ b & mask) != 0) {
    			res = add == 0 ? res | mask : res;
    			add <<= 1;
    		} else if ((a & mask) != 0) {
    			res = add != 0 ? res | mask : res;
    			add = mask << 1;
    		} else if (add != 0) {
    			res |= mask;
    			add = 0;	
    		}
    	}
        return res;
    }
}
