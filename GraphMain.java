package GRAPH;

public class GraphMain {
	 public static void main(String args[])
	    {
	        Graph obj=new Graph();
	        obj.createGraph(4);
	        obj.printG();
	        obj.resetvisited();
	        System.out.println("DFS");
	        obj.DFS(0);
	        obj.resetvisited();
	        System.out.println("BFS");
	        obj.BFS(0);

	    }
	}
