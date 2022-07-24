package graphs;

import java.util.ArrayList;
import java.util.List;

public class Node {
  
	int index;
  
  //to define the index of the node
  Node(int index)
  {
	  this.index=index;
  }
  
  Node()
  {
  }
  
  static ArrayList<Integer> adjacent=new ArrayList<Integer>();
  
  //to add nodes(IF A node has B,then B node needs to have A too)
  public  void addAdjacent(int N)
  {
	  //adding neighbour into this node's list
	  adjacent.add(N);
	  
	  //adding this node into neighbour's list
	  Node.adjacent.add(index);
	  }
  
  void printAdjacencyList()
  {
	  System.out.println("Adjaceny List of node " + index);
      for (int i = 0; i < adjacent.size(); i++) 
      {
          adjacent.get(i);
      }
  }
}
