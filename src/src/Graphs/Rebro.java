package Graphs;

public class Rebro {
	// направление будем указывать знаком так: [1, -2] значит что из 1 есть вектор в 2 но не
	// наоборот и [-1,3] означает что направление есть из 3 в 1, но не 1 -> 3.
	private int[] twoBindedVertexes = new int[2];
	
	public Rebro(int[] twoBindedVertexes) {
		this.twoBindedVertexes = twoBindedVertexes;
	}
	
	public int[] getTwoBindedVertexes( ) {
		return twoBindedVertexes;
	}
	
	public int getFirstVertexes( ) {
		return twoBindedVertexes[0];
	}
	
	public int getSecondVertexes( ) {
		return twoBindedVertexes[1];
	}
	
	public void setTwoBindedVertexes(int[] twoBindedVertexes) {
		this.twoBindedVertexes = twoBindedVertexes;
	}
	
	public long hashCode(Rebro rebro) {
		if(rebro == null) {
			return 0;
		}
		
		long result = 1;
		for(int element : rebro.getTwoBindedVertexes()) {
			long elementHash = element ^ (element >>> 32);
			result = 31 * result + elementHash;
		}
		return result;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o || ! (o instanceof Rebro)) {
			return true;
		}
		Rebro rebro = (Rebro)o;
		return getFirstVertexes() == rebro.getFirstVertexes() && getSecondVertexes() == rebro
				.getSecondVertexes();
	}
	
	public int getNameFromVertex(OrientedVertex orientedVertex) {
		return orientedVertex.getNameOfVertex();
	}
	
	public boolean compareVertexes(OrientedVertex leftVertex, OrientedVertex rightVertex) {
		return leftVertex.getNameOfVertex() == rightVertex.getNameOfVertex();
	}
}