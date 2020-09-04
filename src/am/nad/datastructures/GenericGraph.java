package am.nad.datastructures;

import java.util.*;

public class GenericGraph<T> {
	
	private Map<T, List<T> > map = new HashMap<>();
	
	public void addVertex(T v) {
		map.put(v, new LinkedList<T>());
	}
	public void addEdge(T source, T dest, boolean bidirect) {
		if (!map.containsKey(source)) {
			addVertex(source);
		}
		if (!map.containsKey(dest)) {
			addVertex(dest);
		}
		if (bidirect == true) {
			map.get(dest).add(source);
		}
	}
	
	public void edgesCount(boolean bidirect) {
		int count = 0;
		for(T i : map.keySet()) {
			count += map.get(i).size();
		}
		System.out.println("Graph has :" + count + " edges");
	}
	
	public void hasVertex(T s) {
		if (map.containsKey(s)) {
			System.out.println("Graph has :" + s + "as a vertex");
		} else {
			System.out.println("Graph doesn't have" + s + "as a vertex");
		}
	}
	
	public void vertexCount() {
		System.out.println("Graph has :" + map.keySet().size() + "vertex");
	}
	
	public void hasEdge(T s, T d) {
		if (map.get(s).contains(d)) {
			System.out.println("Graph has edge between" + s + " and " + d);
		} else {
			System.out.println("Graph hasn't edge between " + s + " and " + d);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		for(T i : map.keySet()) {
			strBuilder.append(i.toString() + ": ");
			for(T j : map.get(i)) {
				strBuilder.append(j.toString() + " ");
			}
			strBuilder.append("\n");
		}
		
		return strBuilder.toString();
	}
	
}
