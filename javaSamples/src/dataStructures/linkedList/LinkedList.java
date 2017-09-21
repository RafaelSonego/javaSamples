package dataStructures.linkedList;

public class LinkedList {

	private Node firstNode = null;
	private Node lastNode = null;
	private int totalElements = 0;

	// Adiciona no começo
	public void addInit(Object element) {
		// First element is null so new node linked with null
		Node node = new Node(element, firstNode);
		// Now first element is the node created
		this.firstNode = node;
		if (this.totalElements == 0) {
			this.lastNode = this.firstNode;
		}
		this.totalElements++;
	}

	// Adiciona no fim
	public void add(Object element) {
		if (this.totalElements == 0) {
			addInit(element);
		} else {
			Node node = new Node(element, null);
			this.lastNode.setNext(node);
			this.lastNode = node;
			this.totalElements++;
		}
	}

	public void add(int position, Object element) {

	}
	
	public Object get(int position) {
		return null;
	}

	public void remove(int position) {
	}

	public int size() {
		return totalElements;
	}

	public boolean contain(Object element) {
		return false;
	}

	@Override
	public String toString() {
		if (this.totalElements == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		Node node = firstNode;
		for (int i = 0; i < totalElements; i++) {
			builder.append(node.getElement());
			node = node.getNext();
			builder.append(",");
		}
		builder.append("]");
		return builder.toString();
	}

}
