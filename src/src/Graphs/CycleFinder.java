package Graphs;

import java.util.ArrayList;
import java.util.List;

public class CycleFinder {
	private MyGraph myGraph;
	private int[]   vertexesWalked;
	
	public CycleFinder(MyGraph myGraph) {
		this.myGraph = myGraph;
		vertexesWalked = new int[myGraph.getAllVertexes().size()];
	}
	
	public List<List<OrientedVertex>> getNumberOfCycles(MyGraph myGraph) {
		List<OrientedVertex>       incomeGraph = myGraph.getAllVertexes();
		List<List<OrientedVertex>> result      = new ArrayList<>();
		
		for(OrientedVertex orientedVertex : incomeGraph) {
			OrientedVertex[] sublings = orientedVertex.getSublings();
			if()
		} return result;
	}
}
