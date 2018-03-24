package Graphs;

import java.util.List;
import java.util.Objects;

public class OrientedVertex {
	public List<OrientedVertex> getBindedOrientedVertixes( ) {
		return bindedOrientedVertixes;
	}
	
	public void setBindedOrientedVertixes(List<OrientedVertex> bindedOrientedVertixes) {
		this.bindedOrientedVertixes = bindedOrientedVertixes;
	}
	
	private List<OrientedVertex> bindedOrientedVertixes;
	private int                  nameOfVertex;
	
	public OrientedVertex(List<OrientedVertex> bindedOrientedVertixes, int nameOfVertex) {
		this.bindedOrientedVertixes = bindedOrientedVertixes;
		this.nameOfVertex = nameOfVertex;
	}
	
	public int getNameOfVertex( ) {
		return nameOfVertex;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(! (o instanceof OrientedVertex)) {
			return false;
		}
		OrientedVertex that = (OrientedVertex)o;
		return getNameOfVertex() == that.getNameOfVertex();
	}
	
	@Override
	public int hashCode( ) {
		
		return Objects.hash(getNameOfVertex());
	}
	
	public void setNameOfVertex(int nameOfVertex) {
		this.nameOfVertex = nameOfVertex;
	}
	
}
