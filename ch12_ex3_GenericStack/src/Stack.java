import java.util.LinkedList;

public class Stack<E> {
	private LinkedList<E> list = new LinkedList<>();
	
	public void push(E item) {
		//ads to top, like addFirst()
		list.addFirst(item);
	}
	
	public E pop() {
		//returns top elements and removes, removeFirst()
		return list.removeFirst();
	}
	
	public E peek(){
		//does a peek
		return list.peek();
	}
	
	public int size(){
		//returns size
		return list.size();
	}
}
