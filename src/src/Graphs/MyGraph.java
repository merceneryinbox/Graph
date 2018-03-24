package Graphs;

import java.util.List;
import java.util.Objects;

public class MyGraph {
	List<OrientedVertex> vertexesList;
	
	public MyGraph(List<OrientedVertex> vertexesList) {
		this.vertexesList = vertexesList;
	}
	
	public List<OrientedVertex> getAllVertexes( ) {
		return vertexesList;
	}
	
	private void setGraph(List<OrientedVertex> graph) {
		this.vertexesList = vertexesList;
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
		return Objects.equals(getAllVertexes(), myGraph.getAllVertexes());
	}
	
	@Override
	public int hashCode( ) {
		
		return Objects.hash(getAllVertexes());
	}
	
	@Override
	public String toString( ) {
		StringBuilder myVertexesListInString = new StringBuilder();
		for(int i = 0; i < vertexesList.size(); i++) {
			myVertexesListInString.append(vertexesList.get(i).getBindedOrientedVertixes());
		}
		return "vertexesList{" + "vertexesList=" + myVertexesListInString.toString() + '}';
	}
}
