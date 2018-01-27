package test_crack;

class _324 {
    public void wiggleSort(int[] nums) {
    	boolean shouldBigger = true;
    	boolean sameFlag = false;
    	boolean forward = true;
    	int sameStart = -1;
    	int i = 1;
    	
    	while (!((i == -1 || i == nums.length) && !sameFlag)) {
    		if (forward) {
    			shouldBigger = true;
    			i = 1;
    	        for (; i < nums.length ; i++) {
    	        	if (sameFlag) {
    	        		if (nums[i] == nums[i-1]) {
    	        			continue;
    	        		} else {
    	        			if (shouldBigger) {
    	        				if (nums[i] > nums[i-1]) {
    	        					swap(sameStart+1,i,nums);
    	        					sameStart = sameStart + 2;
    	        					if (sameStart == i) {
    	        						sameFlag = false;
    	        					}
    	        				} else {
    	        					swap(sameStart,i,nums);
    	        					sameStart = sameStart + 1;
    	        					shouldBigger = false;
    	        				}
    	        			} else {
    	        				if (nums[i] > nums[i-1]) {
    	        					swap(sameStart,i,nums);
    	        					sameStart = sameStart + 1;
    	        					shouldBigger = false;
    	        				} else {
    	        					swap(sameStart+1,i,nums);
    	        					sameStart = sameStart + 2;
    	        					if (sameStart == i) {
    	        						sameFlag = false;
    	        					}
    	        				}
    	        			}
    	        		}
    	        		
    	        	} else {
    	            	if (shouldBigger) {
    	                	if (nums[i] > nums[i-1]) {
    	                		shouldBigger = false;
    	                		continue;
    	                	} else if (nums[i] < nums[i-1]) {
    	                		swap(i,i-1,nums);
    	                	} else {
    	                		sameFlag = true;
    	                		sameStart = i-1;
    	                	}
    	            	} else {
    	            		if (nums[i] < nums[i-1]) {
    	            			shouldBigger = true;
    	            			continue;
    	            		} else if (nums[i] > nums[i-1]) {
    	                		swap(i,i-1,nums);
    	                	} else {
    	                		sameFlag = true;
    	                		sameStart = i-1;
    	                	}
    	            	}
    	        	}
    	        }
    	        if (sameFlag) sameStart = nums.length - 1;
    	        forward = false;
    		} else {
    			i = nums.length - 2;
    			if (nums.length % 2 != 0) {
    				shouldBigger = true;
    			} else {
    				shouldBigger = false;
    			}
    	        for (; i >=0 ; i--) {
    	        	if (sameFlag) {
    	        		if (nums[i] == nums[i+1]) {
    	        			continue;
    	        		} else {
    	        			if (shouldBigger) {
    	        				if (nums[i] > nums[i+1]) {
    	        					swap(sameStart-1,i,nums);
    	        					sameStart = sameStart - 2;
    	        					if (sameStart == i) {
    	        						sameFlag = false;
    	        					}
    	        				} else {
    	        					swap(sameStart,i,nums);
    	        					sameStart = sameStart - 1;
    	        					shouldBigger = false;
    	        				}
    	        			} else {
    	        				if (nums[i] > nums[i+1]) {
    	        					swap(sameStart,i,nums);
    	        					sameStart = sameStart - 1;
    	        					shouldBigger = false;
    	        				} else {
    	        					swap(sameStart-1,i,nums);
    	        					sameStart = sameStart - 2;
    	        					if (sameStart == i) {
    	        						sameFlag = false;
    	        					}
    	        				}
    	        			}
    	        		}
    	        		
    	        	} else {
    	            	if (shouldBigger) {
    	                	if (nums[i] > nums[i+1]) {
    	                		shouldBigger = false;
    	                		continue;
    	                	} else if (nums[i] < nums[i+1]) {
    	                		swap(i,i+1,nums);
    	                	} else {
    	                		sameFlag = true;
    	                		sameStart = i+1;
    	                	}
    	            	} else {
    	            		if (nums[i] < nums[i+1]) {
    	            			shouldBigger = true;
    	            			continue;
    	            		} else if (nums[i] > nums[i+1]) {
    	                		swap(i,i+1,nums);
    	                	} else {
    	                		sameFlag = true;
    	                		sameStart = i+1;
    	                	}
    	            	}
    	        	}
    	        }
    	        if (sameFlag) sameStart = 0;
    	        forward = true;
    		}
    	}
    }
    
    public void swap (int i, int j, int[] nums) {
    	int tmp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = tmp;
    }
}
