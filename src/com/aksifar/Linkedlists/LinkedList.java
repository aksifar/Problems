package com.aksifar.Linkedlists;

public class LinkedList<T> {
	private Node<T> head = null, last = null, temp;
	int size=0;
	
	public void add(Node<T> node)
	{
		if(head == null) //first element
		{
			head = node;
			last = node;
		}
		else
		{
			last.setNext(node);
			last = last.getNext();
		}
		++size;
	}
	
	@Override
	public String toString() 
	{
		StringBuilder result = new StringBuilder("[ ");
		if (head == null)
		{
			result.append("]");
			return result.toString();
		}
		else 
		{
			//adding data of head
			result.append( head.getData()).append(" ");
			temp = head.getNext();
			while(temp != null)
			{
				result.append( temp.getData() ).append(" ");
				temp = temp.getNext();
			}
			result.append("]");
			return result.toString();
		}
	}
	
	public int size() {
		return this.size;
	}
//	clear();
	
	public void removeFromEnd()
	{
		temp = head.getNext();
		Node<T> secondLast = head;
		while(temp.getNext() !=null)
		{
			temp = temp.getNext();
			secondLast = secondLast.getNext();
		}
		last = secondLast;
		last.setNext(null);
		temp = null;
	}
	
	public void delete(T data)
	{
		if(head.getData() == data)
		{
			head = head.getNext();
		}
		
		temp = head.getNext();
		Node<T> secondLast = head;
		
		while(temp != null)
		{
			if(temp.getData() ==  data)
			{
				secondLast.setNext(temp.getNext());
				temp = null;
				
			}
			else
			{
				temp = temp.getNext();
				secondLast =  secondLast.getNext();
			}
		}
		
	}
}
