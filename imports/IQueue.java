package imports;

public interface IQueue<E> {
	public boolean isEmpty();
	public void enqueue(E data);
	public E dequeue();
	public E peek();
	public int size();
}
