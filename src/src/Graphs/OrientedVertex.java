package Graphs;

import java.util.List;
import java.util.Objects;

public class OrientedVertex {
	private OrientedVertex[] sublings;
	
	public List<int[]> getBindedOrientedVertixes( ) {
		return bindedOrientedVertixes;
	}
	
	public void setBindedOrientedVertixes(List<int[]> bindedOrientedVertixes) {
		this.bindedOrientedVertixes = bindedOrientedVertixes;
	}
	
	public OrientedVertex(int nameOfVertex) {
		this.nameOfVertex = nameOfVertex;
	}
	
	private List<int[]>          bindedOrientedVertixes;
	private int                  nameOfVertex;
	
	public OrientedVertex(List<int[]> bindedOrientedVertixes, int nameOfVertex) {
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
	
	public OrientedVertex[] getSublings( ) {
		return new OrientedVertex[0];
	}
}
