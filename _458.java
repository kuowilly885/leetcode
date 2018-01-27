package test_crack;

class _458 {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
    	if (buckets == 0)
    		return 0;
    	int onePigPerBucket = 1;
    	int number = minutesToTest / minutesToDie + 1;
    	int count = 0;
    	while (onePigPerBucket < buckets) {
    		onePigPerBucket = onePigPerBucket * number;
    		count++;
    	}
    	return count;
    }
}
