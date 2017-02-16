package imports;

import java.util.EmptyStackException;

import imports.Node;

public class StackG<E> implements IStack<E> {
	private Node<E> lastNode;
	private int size;
	
	public StackG(){
		lastNode=null;
		size=0;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public void push(E data){
		this.lastNode=new Node<E>(data,this.lastNode);
		this.size++;
	}
		
	public E pop(){
		if(isEmpty()){
			throw new EmptyStackException();
		}
		Node<E> temp=this.lastNode;
		this.lastNode=temp.getNext();
		this.size--;
		return temp.getData();
	}
	
	public E top(){
		if(isEmpty()){
			throw new EmptyStackException();
		}
		return lastNode.getData();
	}
}

