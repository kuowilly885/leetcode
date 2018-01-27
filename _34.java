package test_crack;

class _34 {
    
	public int[] searchRange(int[] a, int b) {
		int bP;
		if (a==null || a.length==0 || (bP=bs(a,0,a.length-1,b))==-1) return new int[] {-1,-1};
		return new int[] {a[0]== b?0:bsG(a,0,bP,b,true),a[a.length-1]==b?a.length-1:bsG(a,bP,a.length-1,b,false)};
	}
	
	int bsG (int[] a, int s, int e, int t, boolean f) {
		if (e>s) {
			int m=(s+e)/2;
			if (a[m]!=t && a[f?m+1:m-1]==t) return f?m+1:m-1;
			else if (a[m]!=t && a[f?m+1:m-1]!=t) return f?bsG(a,m+1,e,t,true):bsG(a,s,m-1,t,false);
			else if (a[m]==t)return f?bsG(a,s,m-1,t,true):bsG(a,m+1,e,t,false);
		} else if (e==s && a[s]!=t && a[f?s+1:s-1]==t) return f?s+1:s-1;
		return -1;
	}
	
	int bs (int[] a, int s, int e, int t) {
		if (e>s) {
			int m=(s+e)/2;
			if (a[m]==t) return m;
			else if (a[m]>t) return bs(a,s,m-1,t);
			else return bs(a,m+1,e,t);
		} else if (e==s && a[s]==t) return s;
		return -1;
	}
}
