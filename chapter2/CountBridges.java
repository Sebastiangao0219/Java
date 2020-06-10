package csc403;

import stdlib.In;
import stdlib.StdIn;
import stdlib.StdOut;

public class CountBridges {
	public static void main(String[] args) {
		args = new String[] { "data/a5bridges.txt" };
		In in = new In(args[0]);
		A5Graph G = new A5Graph(in);
		A5Graph copy = new A5Graph(G);
		
		
		int bridge=0;
		StdIn.fromFile("data/a5bridges.txt");
		StdIn.readLine();
		StdIn.readLine();
		while(!StdIn.isEmpty()) {
			String lineint = StdIn.readLine();
			String [] graph = lineint.split("\\s+");
			int v1 = Integer.parseInt(graph[0]);
			int v2 = Integer.parseInt(graph[1]);
			copy.deleteEdge(v1,v2);
			A5CC cc = new A5CC(copy);
			if(cc.count()>1) {
				bridge++;
			}
			copy.addEdge(v1,v2);
		}
		StdOut.print("the number of bridges is "+bridge);
	}

}
