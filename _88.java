package test_crack;

class _88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	int i = m - 1, j = n - 1, merge = m + n - 1;
    	while (j >= 0)
            if (i < 0 || nums2[j] > nums1[i]) nums1[merge--] = nums2[j--];
            else nums1[merge--] = nums1[i--];
    }
}
