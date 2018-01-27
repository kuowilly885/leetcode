package test_crack;

class _105 {
    public TreeNode buildTree(int[] pre, int[] in) {
    	return help(pre,in,0,pre.length-1,0);
    }
    
    TreeNode help(int[] pre, int[] in, int ps, int pe, int is) {
    	if (pe>ps) {
        	TreeNode r=new TreeNode(pre[ps]);
        	int i=is,cnt;
            while (in[i]!=pre[ps]) i++;
        	cnt = i-is;
        	r.left=help(pre,in,ps+1,ps+cnt,is);
        	r.right=help(pre,in,ps+cnt+1,pe,i+1);
        	return r;
    	}
    	return ps>pe?null:new TreeNode(pre[ps]);
    }

}
