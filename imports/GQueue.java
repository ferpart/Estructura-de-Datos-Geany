package imports;

import java.util.NoSuchElementException;

public class GQueue<E> implements IQueue<E>{
	private Node<E> firstNode,
					lastNode;
	private int size;
	private String string;
	
	public GQueue(){
		firstNode=null;
		lastNode=null;
		size=0;
		string="";
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public void enqueue(E data){
		if(isEmpty()){
			Node<E> nuevo= new Node<E>(data,null);
			this.lastNode=nuevo;
			this.firstNode=nuevo;
		}
		else{
			Node<E> nuevo= new Node<E>(data,null);
			this.lastNode.setNext(nuevo);
			this.lastNode=nuevo;
		}
		this.size++;
	}
	
	public E dequeue(){
		if(isEmpty()){
			throw new NoSuchElementException();
		}
		Node<E> temp=this.firstNode;
		this.firstNode=temp.getNext();
		this.size--;
		if(isEmpty()){
			this.lastNode=null;
		}
		return temp.getData();
	}
	
	public E peek(){
		if(isEmpty()){
			throw new NoSuchElementException();
		}
		return firstNode.getData();
	}
	
	public String toString(){
		while(!isEmpty()){
			string+=("$"+dequeue()+"\n");
		}
		return string;
	}
	
	public int size(){ 
			return size;
			}
		
		
	
	
}

