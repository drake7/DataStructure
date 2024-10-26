package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Graph {


	// adjacency matrix
	private Map<Integer,List<Integer>> adjList;


	public Graph() {
		adjList = new HashMap<>();
	}

	public void addVertex(int vertex)
	{
		//array list contains the information of the adjacent vertices 
		adjList.put(vertex, new ArrayList<>());
	}

	public ArrayList<Integer> getVertex(int vertex)
	{
		//array list contains the information of the adjacent vertices 
		return (ArrayList<Integer>) adjList.get(vertex);
	}
	public void addEdge(int vertex1,int vertex2)
	{
		adjList.putIfAbsent(vertex1, new ArrayList<>());
		adjList.putIfAbsent(vertex2, new ArrayList<>());
		adjList.get(vertex1).add(vertex2);
		adjList.get(vertex2).add(vertex1);
	}
	
	
	public void printGraph() {
		for(int vertex: adjList.keySet())
		{
			System.out.print(vertex + " : ");
			for(int neighbour : adjList.get(vertex))
			{
				System.out.print(neighbour + ",");
			}
			
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Graph graph = new Graph();

        // Add vertices
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        // Add edges (undirected)
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(5, 6);
        // Print the graph
        System.out.println("Graph adjacency list:");
        graph.printGraph();
        
        RouteBetween2Nodes rn = new RouteBetween2Nodes();
        
        System.out.println(""+rn.nodesConnected(graph, 0, 6));
        
	}
	
}
