package com.aksifar.Trees;

import com.aksifar.Util.TreeUtil;

public class MainTree {
 
	public static void main(String[] args) {
		
		BinaryTreeNode A = new BinaryTreeNode(1);
		BinaryTreeNode B = new BinaryTreeNode(2);
		BinaryTreeNode C = new BinaryTreeNode(3);
		BinaryTreeNode D = new BinaryTreeNode(4);
		BinaryTreeNode E = new BinaryTreeNode(5);
		BinaryTreeNode F = new BinaryTreeNode(6);
		BinaryTreeNode G = new BinaryTreeNode(7);
		
		
		A.setLeft(B);
		A.setRight(C);
		
		B.setLeft(D);
		D.setLeft(G);
		
		C.setLeft(E);
		C.setRight(F);
		
		TreeUtil.printInOrderTraversal(A);
		System.out.println();
		TreeUtil.printPreOrderTraversal(A);
		System.out.println();
		TreeUtil.printPostOrderTraversal(A);
		
		
		//Tree for LevelOrder Traversal
		BinaryTreeNode a = new BinaryTreeNode(1);
		BinaryTreeNode b = new BinaryTreeNode(2);
		BinaryTreeNode c = new BinaryTreeNode(3);
		BinaryTreeNode d = new BinaryTreeNode(4);
		BinaryTreeNode e = new BinaryTreeNode(5);
		BinaryTreeNode f = new BinaryTreeNode(6);
		BinaryTreeNode g = new BinaryTreeNode(7);
		
		a.setLeft(b);
		a.setRight(c);
		
		b.setLeft(d);
		b.setRight(e);
		
		c.setLeft(f);
		c.setRight(g);
		System.out.println();
		System.out.println("Level Order Traversal: ");
		TreeUtil.printLevelOrderTraversal(a);
	}
}
