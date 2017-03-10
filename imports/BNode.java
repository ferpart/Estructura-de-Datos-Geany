package imports;

public class BNode<E> {
	private E data;
	BNode<E> left, right;
	
	public BNode (){                                                                                                    //Default Constructor
		left=null;
		right=null;
		data=null;
	}
	
	public BNode (E data){
		this.data=data;
		left=null;
		right=null;
	}
	
	public E getData(){                                                                                                 //Gets the data from the node
		return data;
	}
	
	public void setData(E data){                                                                                        //Asigns the value to the variable data
		this.data = data;
	}
	
	public BNode<E> getLeft(){                                                                                          //Gets next node value
		return left;
	}
	
	public void setLeft(BNode<E> node){                                                                                 //Sets next node value
		this.left = node;
	}
	
	public BNode<E> getRight(){                                                                                          //Gets previous node value
		return right;
	}
	
	public void setRight(BNode<E> node){                                                                                 //Sets previous node value
		this.right = node;
	}
	
}
