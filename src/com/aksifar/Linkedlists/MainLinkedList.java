package com.aksifar.Linkedlists;

public class MainLinkedList {

	Node<Integer> n1 = new Node<>(1); 
	Node<Integer> n2 = new Node<>(2); 
	Node<Integer> n3 = new Node<>(3); 
	Node<Integer> n4 = new Node<>(4); 
	Node<Integer> n5 = new Node<>(5); 
	LinkedList<Integer> list;
	
	public static void main(String[] args) {
		
		MainLinkedList obj = new MainLinkedList();
		obj.list = obj.createLinkedList();
		
		System.out.println(obj.list);
		System.out.println(obj.list.size());
		
//		obj.list.removeFromEnd();
//		System.out.println(obj.list);
		
		obj.list.delete(3);
		obj.list.delete(1);
		obj.list.delete(4);
		System.out.println(obj.list);
		

	}
	
	public LinkedList<Integer> createLinkedList() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(n1);
		list.add(n2);
		list.add(n3);
		list.add(n4);
		list.add(n5);
		return list;
	}

}
