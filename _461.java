package test_crack;

class _461 {
    public int hammingDistance(int x, int y) {
        int dis=x^y,cnt=0;
        for (int i=0;i<32;i++,dis=dis>>1) if ((dis&1)==1) cnt++;
        return cnt;
    }
}
