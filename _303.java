package test_crack;

public class _303 {
    int[] array;
    int[] original;
    public _303(int[] nums) {
        original = nums;
        if (nums != null && nums.length != 0) {
            int size = nums.length;
            int[] a = new int[size];
            a[0] = nums[0];

            for (int i = 1; i < size ; i++)
            {
                a[i] = a[i - 1] + nums[i];
            }
            array = a;
        }
    }
    
    public int sumRange(int i, int j) {
        return array[j] - array[i] + original[i];
    }
}
