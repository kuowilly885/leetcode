package test_crack;

class _283 {
    public void moveZeroes(int[] nums) {
    	int sPos = -1;
        for (int i = 0 ; i < nums.length ; i++) {
        	if (sPos==-1 && nums[i]==0) sPos=i;
        	if (sPos!=-1 && nums[i]!=0) {
        		swap(sPos,i,nums);
        		sPos++;
        	}
        }
    }
    
    public void swap(int i, int j, int[] nums) {
    	int tmp=nums[i];
    	nums[i]=nums[j];
    	nums[j]=tmp;
    }
}
