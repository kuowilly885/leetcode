package test_crack;

import java.util.Deque;
import java.util.LinkedList;

class _150 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        for (int i=0;i<tokens.length;i++) {
        	char[] arr=tokens[i].toCharArray();
        	int num=0;
        	if (arr.length==1) {
        		if (arr[0]>='0' && arr[0]<='9') num=arr[0]-'0';
        		else {
        			int b=stack.pop(),a=stack.pop();
        			switch (arr[0]) {
        				case '+': num=a+b; break;
        				case '-': num=a-b; break;
        				case '*': num=a*b; break;
        				default: num=a/b;
        			}
        		}
        	} else {
        		int j=arr[0]=='-'?1:0;
            	for (;j<arr.length;j++) num=num*10+arr[j]-'0';
            	if (arr[0]=='-') num=-num;
    		}
        	stack.push(num);
        }
        return stack.peek();
    }
}
