package test_crack;

class _134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    	int nums = gas.length, totalGas = 0, totalCost = 0, start = 0, tank = 0;
        for (int i = 0 ; i < nums ; i++) {
    		totalGas+=gas[i];
    		totalCost+=cost[i];
    		tank += (gas[i] - cost[i]);
    		if (tank < 0) {
    			tank = 0;
    			start = i+1;
    		}
        }
        
        if (totalGas < totalCost) {
        	return -1;
        } else {
        	return start;
        }
    }
}
