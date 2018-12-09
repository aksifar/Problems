package com.aksifar.Util;

import java.util.LinkedList;
import java.util.Queue;

import com.aksifar.Trees.BinaryTreeNode;

public final class TreeUtil {
	
	//To prevent instantiation of the class
	private TreeUtil(){};
	
	public static void printInOrderTraversal(BinaryTreeNode root)
	{
		if(root == null)
			return;
		printInOrderTraversal(root.getLeft());
		System.out.print(" " + root.getData());
		printInOrderTraversal(root.getRight());
	}
	
	public static void printPreOrderTraversal(BinaryTreeNode root)
	{
		if(root == null)
			return;
		System.out.print(" " + root.getData());
		printPreOrderTraversal(root.getLeft());
		printPreOrderTraversal(root.getRight());
	}
	
	public static void printPostOrderTraversal(BinaryTreeNode root)
	{
		if(root == null)
			return;
		printPostOrderTraversal(root.getLeft());
		printPostOrderTraversal(root.getRight());
		System.out.print(" " + root.getData());
	}
	
	public static void printLevelOrderTraversal(BinaryTreeNode root)
	{
		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty())
		{	BinaryTreeNode current = q.poll();
			System.out.print(" " + current.getData());
			BinaryTreeNode left = current.getLeft();
			BinaryTreeNode right = current.getRight();
			if( left != null )
			{ 
				 q.offer( left );
			}
			if( right != null )
			{ 
				 q.offer( right );
			}
			
		}
	}
}
