package imports;

public interface IStack<E> {
		public boolean isEmpty();
		public void push(E data);
		public E pop();
		public E top();
}

