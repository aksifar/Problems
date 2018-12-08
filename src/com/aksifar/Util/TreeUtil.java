package com.aksifar.Util;

import com.aksifar.Trees.Tree;

public final class TreeUtil {
	
	//To prevent instantiation of the class
	private TreeUtil(){};
	
	public static void printInOrderTrversal(Tree root)
	{
		if(root == null)
			return;
		printInOrderTrversal(root.getLeft());
		System.out.print(" " + root.getData());
		printInOrderTrversal(root.getRight());
	}
	
	public static void printPreOrderTrversal(Tree root)
	{
		if(root == null)
			return;
		System.out.print(" " + root.getData());
		printPreOrderTrversal(root.getLeft());
		printPreOrderTrversal(root.getRight());
	}
	
	public static void printPostOrderTrversal(Tree root)
	{
		if(root == null)
			return;
		printPostOrderTrversal(root.getLeft());
		printPostOrderTrversal(root.getRight());
		System.out.print(" " + root.getData());
	}
}
