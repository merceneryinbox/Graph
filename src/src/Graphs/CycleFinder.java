package Graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Алгоритм работы:
 * принимается на вход граф
 * в цикле выбирается по одному элементу = orientedVertex
 * из него вытаскиваются связанные вертексы
 * проверяется знак имени каждого связанного вертекса, если он + => к нему применяется функция
 * проверки:
 * которая делает следующее -
 * проверяет не равен ли обрабатываемый вертекс предыдущему который уже был обработан
 * (парент - хранится внутри инстанса цикла и является интом и в начале равен = 0)
 */
public class CycleFinder {
	private MyGraph myGraph;
	private int[]   vertexesWalked;
	private int parentVertex = 0;
	
	public CycleFinder(MyGraph myGraph, int[] vertexesWalked, int parentVertex, List<Integer>
			cycles) {
		this.myGraph = myGraph;
		this.vertexesWalked = vertexesWalked;
		this.parentVertex = parentVertex;
		this.cycles = cycles;
	}
	
	public MyGraph getMyGraph( ) {
		return myGraph;
	}
	
	public void setMyGraph(MyGraph myGraph) {
		this.myGraph = myGraph;
	}
	
	public int[] getVertexesWalked( ) {
		return vertexesWalked;
	}
	
	public void setVertexesWalked(int[] vertexesWalked) {
		this.vertexesWalked = vertexesWalked;
	}
	
	public int getParentVertex( ) {
		return parentVertex;
	}
	
	public void setParentVertex(int parentVertex) {
		this.parentVertex = parentVertex;
	}
	
	public List<Integer> getCycles( ) {
		return cycles;
	}
	
	public void setCycles(List<Integer> cycles) {
		this.cycles = cycles;
	}
	
	List<Integer> cycles = new ArrayList<>();
	
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
