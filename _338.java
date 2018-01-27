package test_crack;

class _338 {
    public int[] countBits(int num) {
    	int[] arr = new int[num + 1];
    	arr[0] = 0;
    	for (int i = 1 ; i <= num ; i++)
    		arr[i] = arr[i>>1] + (i&1);
    	return arr;
    }
}