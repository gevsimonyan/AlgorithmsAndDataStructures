package am.nad.datastructurestest;

import am.nad.datastructures.GenericGraph;

public class GraphTest {

	public static void main(String[] args) {
		GenericGraph<Integer> graph = new GenericGraph<Integer>();
	
		graph.addEdge(0, 1, true);
		graph.addEdge(0, 2, true);
		graph.addEdge(1, 3, true);
		graph.addEdge(1, 3, true);
		graph.addEdge(2, 4, true);
		graph.addEdge(3, 5, true);
		
		System.out.println(graph.toString());
		
		graph.vertexCount();
		
		graph.edgesCount(true);
		
		graph.hasEdge(1, 3);
		graph.hasEdge(5, 11);
		
		graph.hasVertex(5);
		graph.hasVertex(6);
		
		
		
	}

}
