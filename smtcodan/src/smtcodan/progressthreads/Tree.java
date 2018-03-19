package smtcodan.progressthreads;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Tree.
 *
 * @param <T> the generic type
 */
public class Tree<T> {
	
	/** The root element. */
	private Node<T> rootElement;

	/**
	 * Default constructor.
	 */
	public Tree() {
		super();
	}

	/**
	 * Return the root Node of the tree.
	 * 
	 * @return the root element.
	 */
	public Node<T> getRootElement() {
		return this.rootElement;
	}

	/**
	 * Set the root Element for the tree.
	 * 
	 * @param rootElement
	 *            the root element to set.
	 */
	public void setRootElement(Node<T> rootElement) {
		this.rootElement = rootElement;
	}

	/**
	 * Returns the Tree<T> as a List of Node<T> objects. The elements of the
	 * List are generated from a pre-order traversal of the tree.
	 * 
	 * @return a List<Node<T>>.
	 */
	public List<Node<T>> toList() {
		List<Node<T>> list = new ArrayList<Node<T>>();
		walk(rootElement, list);
		return list;
	}

	/**
	 * Returns a String representation of the Tree. The elements are generated
	 * from a pre-order traversal of the Tree.
	 * 
	 * @return the String representation of the Tree.
	 */
	public String toString() {
		return toList().toString();
	}

	/**
	 * Walks the Tree in pre-order style. This is a recursive method, and is
	 * called from the toList() method with the root element as the first
	 * argument. It appends to the second argument, which is passed by reference
	 * * as it recurses down the tree.
	 * 
	 * @param element
	 *            the starting element.
	 * @param list
	 *            the output of the walk.
	 */
	private void walk(Node<T> element, List<Node<T>> list) {
		list.add(element);
		for (Node<T> data : element.getChildren()) {
			walk(data, list);
		}
	}

	/**
	 * Represents a node of the Tree<T> class. The Node<T> is also a container,
	 * and can be thought of as instrumentation to determine the location of the
	 * type T in the Tree<T>.
	 */
}