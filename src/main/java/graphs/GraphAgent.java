package graphs;

import java.util.ArrayList;

public class GraphAgent {

	int vertices;
	//number of nodes in the graph
	
	ArrayList<Node > NodeList;
	GraphAgent(int Vertices)
	{
	
		this.vertices=Vertices;
		NodeList = new ArrayList<Node >(Vertices);
		for (int i = 0; i < Vertices; i++)
			NodeList.add(new Node(i));
	}
	
	
	
}
