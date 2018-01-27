package test_crack;
import java.util.Deque;
import java.util.LinkedList;

class _394 {
    public String decodeString(String s) {
    	Deque N=new LinkedList<>(),S=new LinkedList<>();
    	String t="";
    	for (int i=0,n=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		if (c>='0'&&c<='9') n=n*10+c-'0';
    		else {
    			if (n!=0) {
    				N.push(n);
    				S.push(t);
    				t="";
    				n=0;
    			}
    			if (c==']') {
    				int k=(int) N.pop();
    				StringBuilder b=new StringBuilder();
    				while (k-->0) b.append(t);
    				t=S.pop()+b.toString();
    			} else if (c!='[') t+=c;
    		}
    	}
    	return t;
    }
}
