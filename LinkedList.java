
public class LinkedList<E> implements Stack, Queue{
	private ListNode<E> head;
	private ListNode<E> tail;
	private int size;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void add (E data) {
		add(size, data);
	}
	
	public boolean add (int index, E data) {
		ListNode<E> newNode = new ListNode<E>(data);
		
		if (index == 0) {
			newNode.setNextPointer(head);
			head = newNode;
			
			if (size == 0) {
				tail = head;
			}
		}
		else if (index == size) {
			tail.setNextPointer(newNode);
			tail = tail.getNextPointer();
		}
		else {
			ListNode<E> holderNode = head;
			for (int i = 0; i < index; i++) {
				holderNode = head.getNextPointer();
			}
			newNode.setNextPointer(holderNode.getNextPointer());
			holderNode.setNextPointer(newNode);
		}

		size++;
		return true;
	}
	
	/*public E remove (int index) {
		
	}*/
	
	public int size() {
		return this.size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void push(Object item) {
		add(0, (E) item);
		
	}

	@Override
	public Object pop() {
		ListNode<E> outData = head;
		head = head.getNextPointer();
		return outData;
	}

	@Override
	public Object peek() {
		return head;
	}

	@Override
	public boolean isEmpty() {
		if (size > 0) return false;
		else return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void offer(Object item) {
		add(size, (E) item);		
	}

	@Override
	public Object poll() {
		ListNode<E> outData = head;
		head = head.getNextPointer();
		return outData;
	}
	
	public String toString () {
		if (isEmpty()) return "[]";
		
		String str = "[";
		
		for (ListNode<E> i = head; i.getNextPointer() != null; i = i.getNextPointer()) {
			str += i + ", ";
		}
		
		str = str.substring(0, (str.length()-2)) + "]";
		
		return str;
		
	}
	
	public static void main (String [] args) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		linkedlist.add("First");
		linkedlist.add("Second");
		linkedlist.add("Third");
		
		System.out.println(linkedlist);
	}
	
}
