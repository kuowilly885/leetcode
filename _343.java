package test_crack;

class _343 {
    public int integerBreak(int n) {
        if (n == 2 || n == 3)
            return n - 1;
        int[] arr = new int[n + 1];
        arr[2] = 2;
        arr[3] = 3;
        for (int i = 4 ; i <= n ; i++)
            arr[i] = i % 3 == 0 ? arr[i-3]*3 : arr[i-2]*2;
        return arr[n];
    }
}
