package imports;

public class BinaryTree<E> {
	
	private BNode<E> root;
	
	public BinaryTree(){
		root= null;	
	}
	
	public boolean isEmpty(){
		return root==null;	
	}
	
	public void insert(E data)
	{
		root = insert(root, data);
	}
	
	private BNode<E> insert(BNode<E> node, E data){	
		if (node==null){
			node = new BNode<E>(data);
		}
		else{
			if (node.getLeft()== null){
				node.left = insert(node.left, data);
			}
			else{
				node.right = insert(node.right, data);
			}
		}
		return node;
	}
	
	public int countNodes(){
		return countNodes(root);
	}
	
	public int countNodes(BNode<E> r){
		if (r ==null){
			return 0;
		}
		else{
			int l = 1;
			l += countNodes(r.getLeft());
			l += countNodes(r.getRight());
			return l;
		}
	}
	
	public boolean search(E val){
		return search(root, val);
	}
	
	private boolean search(BNode<E> r, E val ){
		if (r.getData()==val){
			return true;
		}
		if (r.getLeft() != null){
			if (search(r.getLeft(), val)){
				return true;
			}
		}
		if (r.getRight() != null){
			if (search(r.getRight(), val)){
				return true;
			}
		}
		return false;
	}
	
	public void inorder()
    {
        inorder(root);
    }
    private void inorder(BNode<E> r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    }
    /* Function for preorder traversal */
    public void preorder()
    {
        preorder(root);
    }
    private void preorder(BNode<E> r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());             
            preorder(r.getRight());
        }
    }
    /* Function for postorder traversal */
    public void postorder()
    {
        postorder(root);
    }
    private void postorder(BNode<E> r)
    {
        if (r != null)
        {
            postorder(r.getLeft());             
            postorder(r.getRight());
            System.out.print(r.getData() +" ");
        }
    }     
	
	
	
	

}
