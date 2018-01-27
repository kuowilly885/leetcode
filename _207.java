package test_crack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class _207 {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		Map<Class,List<Class>> graph = new HashMap<>();
		for (int i = 0 ; i < prerequisites.length ; i++) {
			Class c1 = new Class(prerequisites[i][0]), c2 = new Class(prerequisites[i][1]);
			if (graph.containsKey(c1)) graph.get(c1).add(c2);
			else {
				List<Class> set = new ArrayList<>();
				set.add(c2);
				graph.put(c1, set);
			}
		}

		Set<Class> check = new HashSet<>();
		Circle c = new Circle();
		for (Class e : graph.keySet()) {
			if (!e.visited) {
				dfs(check, e, graph, c);
				if (c.circle) return false;
			}
		}
		return true;
		
	}
	
	public void dfs (Set<Class> check, Class curClass, Map<Class,List<Class>> graph, Circle c) {
		if (c.circle) return;

		if (check.contains(curClass)) {
			c.circle = true;
			return;
		} else {
			if (curClass.visited) return;
			check.add(curClass);
			curClass.visited = true;
		}
		
		List<Class> outArrows = graph.get(curClass);
		if (outArrows != null) for (Class e : outArrows) dfs (check, e, graph, c);

		check.remove(curClass);
	}
	
	class Class {
		boolean visited = false;
		int val;
		public Class(int val) {
			this.val = val;
		}

		public boolean equals(Object obj) {
			return ((Class)obj).val == this.val;
		}

		public int hashCode() {
			return this.val;
		}
	}

	class Circle {
		boolean  circle = false;
	}
}


