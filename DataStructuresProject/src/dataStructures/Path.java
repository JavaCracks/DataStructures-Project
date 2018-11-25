package dataStructures;

import java.util.ArrayList;

public class Path<T extends Comparable<T>, E extends Comparable<E>> implements Comparable<Path<T, E>> {

	private GraphByLists<T, E> list;
	private GraphByMatrix<T, E> matrix;
	private ArrayList<Vertex<T>> vertices;

	public Path(GraphByLists<T, E> list, GraphByMatrix<T, E> matrix) {

		this.list = list;
		this.matrix = matrix;
		vertices = new ArrayList<>();

	}

	public ArrayList<Vertex<T>> getVertices() {
		return vertices;
	}

	public void setVertices(ArrayList<Vertex<T>> vertices) {
		this.vertices = vertices;
	}

	@Override
	public int compareTo(Path<T, E> o) {
		return 0;
	}

	@Override
	public String toString() {

		String path = "";

		if (matrix == null) {

			for (int i = 0; i < vertices.size() - 1; i++) {

				Vertex<T> a = vertices.get(i);
				Vertex<T> b = vertices.get(i + 1);

				path += a.toString() + " --" + list.edgesBetween(a.getValue(), b.getValue()) + "--> " + b.toString()
						+ "\n";

			}
		}

		return path;

	}

}