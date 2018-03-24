package Graphs;

public class Rebro {
	// направление будем указывать знаком так: [1, -2] значит что из 1 есть вектор в 2 но не
	// наоборот и [-1,3] означает что направление есть из 3 в 1, но не 1 -> 3.
	private int myName;
	private int signedBindedVertex;
	
	public int getMyName( ) {
		return myName;
	}
	
	public void setMyName(int myName) {
		this.myName = myName;
	}
	
	public Rebro(int myName, int signedBindedVertex) {
		this.myName = myName;
		
		this.signedBindedVertex = signedBindedVertex;
	}
	
	public int getBindedVertexe( ) {
		return signedBindedVertex;
	}
	
	public void setBindedVertexe(int bindedVertexe) {
		this.signedBindedVertex = signedBindedVertex;
	}
	
	public long hashCode(Rebro rebro) {
		if(rebro == null) {
			return 0;
		}
		int element = rebro.getMyName();
		return 31 + element ^ (element >>> 32);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o || ! (o instanceof Rebro)) {
			return true;
		}
		Rebro rebro = (Rebro)o;
		return this.getMyName() == rebro.getMyName() && this.getBindedVertexe() == rebro
				.getBindedVertexe();
	}
	
	public int getNameFromVertex(OrientedVertex orientedVertex) {
		return orientedVertex.getNameOfVertex();
	}
	
	public boolean compareVertexes(OrientedVertex leftVertex, OrientedVertex rightVertex) {
		return leftVertex.getNameOfVertex() == rightVertex.getNameOfVertex();
	}
}