package com.aksifar.Util;

import com.aksifar.Trees.Tree;

public final class TreeUtil {
	
	//To prevent instantiation of the class
	private TreeUtil(){};
	
	public static void inOrderTrversal(Tree root)
	{
		if(root == null)
			return;
		inOrderTrversal(root.getLeft());
		System.out.println(root.getData());
		inOrderTrversal(root.getRight());
	}
}
