
public class Node<T> 
{
	public Comparable<T> element;
    public Node<T> left;
    public  Node<T> right;
    
    
    //generated getters and setters
    
    public Node(Comparable<T> element)
    {
    	this.element = element;
    }
	public Comparable<T> getElement() 
	{
		return element;
	}
	public void setElement(Comparable element) 
	{
		this.element = element;
	}
	public void setLeft(Node<T> left) 
	{
		this.left = left;
	}
	public Node getLeft() 
	{
		return left;
	}
	
	public void setRight(Node<T> right) {
		this.right = right;
	}
    
	public Node getRight() 
	{
		return right;
	}
	
    

}
