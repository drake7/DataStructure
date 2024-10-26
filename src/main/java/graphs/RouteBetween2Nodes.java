package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

import dsAssignment1.LinkedList;

public class RouteBetween2Nodes {

	//can either implement the bfs or dfs
	//lets try bfs first
	
	
	
	public boolean nodesConnected(Graph g,int vertex1, int vertex2)
	{
		
		
		if(vertex1 == vertex2)
			return true;
		
		Set<Integer> visited = new HashSet<>();
		Queue<Integer> queue = new java.util.LinkedList();
		
		queue.add(vertex1);
		visited.add(vertex1);
		
		
		while(!queue.isEmpty())
		{
			//get first element out
			int vertex = queue.poll();
			
			if(vertex == vertex2)
			{
				return true;
			}
			
			for(int neighbour : g.getVertex(vertex))
			{
				
				if(!visited.contains(neighbour))
				{
					queue.add(neighbour);
					visited.add(neighbour);
					
				}
				
			}
			
		}
		return false;
	}
	
}
