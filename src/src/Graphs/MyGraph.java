package Graphs;

import java.util.List;
import java.util.Objects;

public class MyGraph {
	List<OrientedVertex> graph;
	
	public MyGraph(List<OrientedVertex> graph) {
		this.graph = graph;
	}
	
	public List<OrientedVertex> getGraph( ) {
		return graph;
	}
	
	public void setGraph(List<OrientedVertex> graph) {
		this.graph = graph;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(! (o instanceof MyGraph)) {
			return false;
		}
		MyGraph myGraph = (MyGraph)o;
		return Objects.equals(getGraph(), myGraph.getGraph());
	}
	
	@Override
	public int hashCode( ) {
		
		return Objects.hash(getGraph());
	}
	
	@Override
	public String toString( ) {
		StringBuilder myGraphInString = new StringBuilder();
		for(int i = 0; i < graph.size(); i++) {
			myGraphInString.append(graph.get(i).getBindedOrientedVertixes());
		}
		return "MyGraph{" + "graph=" + myGraphInString.toString() + '}';
	}
}
