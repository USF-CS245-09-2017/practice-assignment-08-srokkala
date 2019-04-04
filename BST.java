
public class BST<T> 
{
	private Node <T>root;

	

	public boolean find(Comparable <T> value)
	{
		return find(root,value);
	}
	
	public boolean find(Node node, Comparable<T> value)
	{
		// TODO Auto-generated method stub
		if(node == null)
		{
			return false;
		}
		int tell = node.getElement().compareTo(value);
		if( tell == 0)
		{
			return true;
		}
		else if(tell < 0)
		{
			return find(node.getLeft(),value);
		}
		
		else
		{
			return find(node.getRight(),value);
		}
	}
	
	
	public void insert(Comparable <T> value) 
	{
		// TODO Auto-generated method stub
		root = insert(root,value);	
	}
	
	
	
	private Node<T> insert(Node<T> node, Comparable<T> value) 
	{
		// TODO Auto-generated method stub
		
		if(node == null)
		{
			Node<T> n = new Node<T>(value);
			return n;
		}
		else if(node.getElement().compareTo((T) value) > 0)
		{
			node.setRight(insert(node.getRight(),value));
		}
		else 
		{
			node.setLeft(insert(node.getLeft(), value));
		}
		return node;
	}

	
	public void delete(Comparable value)
	{
		root = delete(root,value);
	}
	
	
	
	public Node<T> delete(Node<T> node, Comparable value) 
	{
	 
		// TODO Auto-generated method stub
	if(node == null)
		{
			return null;
		}
	
	
	if(node.getElement().compareTo((T) value) == 0)
	{
		if(node.getLeft() == null)
		{
			return node.getRight();
		}
			else if (node.getRight() == null)
			{
			return node.getLeft();
			}
			else 
			{
				if(node.getRight().getLeft() == null)
				{
					node.setElement(node.getRight().getElement());
					node.setRight(node.getRight().getRight());
					return node;
				}
				else 
				{
					node = (Node<T>) remove(node.getRight());
					return node;
				}
			}
				
					
		
		
		}
		
	else if(node.getElement().compareTo((T) value) > 0)
	{
		node.setLeft(delete(node.getLeft(),value));
	}
	
	else 
	{
		node.setRight(delete(node.getRight(),value));
	}
	return node;
		
}

	public Comparable remove(Node<T> node) 
	{
		// TODO Auto-generated method stub
		if(node.getLeft().getLeft() == null)
		{
			Comparable small = node.getLeft().getElement();
			node.setLeft(node.getLeft().getRight());
			return small;
		}
		else 
		return remove(node.getLeft());
	}

	public void print() 
	{
		// TODO Auto-generated method stub
		print(root);
		
	}

	private void print(Node<T> node) 
	{
		// TODO Auto-generated method stub
		if (!(node == null))
		{
			print(node.left);
			System.out.println(node.getElement());
			print(node.right);
		}
		
		
	}

}
