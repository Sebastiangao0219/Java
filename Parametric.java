/**
 * 
 */

/**
 * @author Sebastian Gao
 *
 */
public class Parametric {
	static class Node<X>{
		X item;
		Node<X> next;
		
		public Node (X item, Node<X> next) {
			this.item = item;
			this.next = next;
		}
	}
	
	static <X> int length (Node<X> node) {
		if (node == null) {
			return 0;
		}else {
			return 1 + length (node.next);
		}
	}
	public static void main(String[] args) {
		Node<String> data = null;
		for (int i = 0; i < args.length; i++) {
			data = new Node<String> (args[i], data);
		}
		System.out.println("length = " + length(data));
		
	}
}
