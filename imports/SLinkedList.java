package imports;

import java.util.NoSuchElementException;

public class SLinkedList<E> implements LinkList<E> {
	
	private Node<E> firstNode;
	private int size;
	
	public SLinkedList (){					//Constructor por default
		firstNode=null;						//Primer nodo vacio
		size=0;								//Tamaño 0
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public int size(){
		return size;
	}
	
	public E getFirst(){					//Regresa el objeto que se encuentra contenido en el primer nodo
		if(firstNode != null){				//a no ser que la lista se encuentre vacia
			return firstNode.getData();
		}
		else{
			throw new NoSuchElementException ("La lista se encuentra vacia");
		}
	}
	
	public void addFirst(E data){		//Agrega un nuevo nodo al inicio de la lista
		this.firstNode=new Node<E>(data,this.firstNode);
		this.size++;
	}
	
	public void add(int index, E data){		//Agrega un nodo en cualquier posicion existente de la lista
		if(index<0||index>this.size){									
			throw new IndexOutOfBoundsException("Indice no valido");
		}
		if(index==0){
			addFirst(data);
		}
		else{
			Node<E> ant=this.firstNode;
			
			for(int i=0; i<index-1; i++){
				ant=ant.getNext();
			}
			
			Node<E> nuevo=new Node<E>(data, ant.getNext());
			ant.setNext(nuevo);
			this.size++;
		}
	
	}
	
	public boolean contains(E item){	//Busca a el primer nodo que contenga un dato en especifico y devuelve true
			int a=this.indexOf(item);	//En caso de encontrarlo regresa false
			return a !=-1;
	}
	
	public int indexOf(E item){			//Busca a el primer nodo que contenga un dato en especifico y devuelve su indice
		if(size!=0){
			Node<E> n;
			int aux=0;
			n=this.firstNode;
			while(aux<=size){
				if(item.equals(n.getData())){
					return aux;
				}
				n=n.getNext();
				aux++;
			}
		}
		return -1;
	}
	
	public E get (int index){		//Accede al objeto dentro de un nodo en cualquier posicion existente de la lista
		if(index<0||index>=this.size){
			throw new IndexOutOfBoundsException("Indice no valido");
		}
		Node<E> n;
		int aux=0;
		n=this.firstNode;
		while(aux<index){
			n=n.getNext();
			aux++;
		}
		return n.getData();
	}
	
	public E remove(int index){			//Elimina un nodo en cualquier posicion existente de la lista
		if(index<0||index>=this.size){
			throw new IndexOutOfBoundsException("Indice no valido");
		}
		
		Node<E> ant=this.firstNode;
		
		for(int i=0; i<index-1; i++){
			ant=ant.getNext();
		}
		
		E data=ant.getNext().getData();
		
		Node<E> nextNode=ant.getNext().getNext();
		ant.setNext(nextNode);
		size--;
		return data;
	}
	
	public String toString(){							//toString de SLinkedList con el uso de StringBuilder
		if(size==0){
			return "";
		}
		else{
			StringBuilder sb = new StringBuilder();
			Node<E> actual = this.firstNode;
			for(int i=0; i<this.size; i++){
				sb.append("["+actual.getData()+"] ");
				actual=actual.getNext();
			}
			return sb.toString();
		}
	}
	
}

