package test_crack;

import java.util.Deque;
import java.util.LinkedList;

class _20 {
    public boolean isValid(String s) {
        if (s.length() == 0) return true;
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0 ; i < s.length() ; i++) {
        	char c = s.charAt(i);
        	if (c == '(' || c== '[' || c == '{') {
        		stack.push(c);
        	} else {
        		if (stack.isEmpty()) return false;
        		char fromStack = stack.pop();
        		if (fromStack == '(' && c != ')') return false;
        		else if (fromStack == '[' && c != ']') return false;
        		else if (fromStack == '{' && c != '}') return false;
        	}
        }
        return stack.isEmpty();
    }
}
