
public class ListNode <E>{
	private E object;
	private ListNode<E> next;
	
	ListNode() {
		this.object = null;
		this.next = null;
	}
	
	ListNode(E object) {
		this.object = object;
		next = null;
	}
	
	ListNode(E object, ListNode<E> pointer) {
		this.object = object;
		this.next = pointer;
	}
	
	public String toString () {
		return object.toString();
	}
	
	public void setNextPointer(ListNode<E> pointer) {
		next = pointer;
	}
	
	public ListNode<E> getNextPointer() {
		return this.next;
	}
	
	public void setObject(E data) {
		object = data;
	}
	
	public E getObject() {
		return this.object;
	}
}
