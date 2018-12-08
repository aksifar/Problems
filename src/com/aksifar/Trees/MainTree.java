package com.aksifar.Trees;

import com.aksifar.Util.TreeUtil;

public class MainTree {
 
	public static void main(String[] args) {
		
		Tree A = new Tree(1);
		Tree B = new Tree(2);
		Tree C = new Tree(3);
		Tree D = new Tree(4);
		Tree E = new Tree(5);
		Tree F = new Tree(6);
		Tree G = new Tree(7);
		
		
		A.setLeft(B);
		A.setRight(C);
		
		B.setLeft(D);
		D.setLeft(G);
		
		C.setLeft(E);
		C.setRight(F);
		
		TreeUtil.printInOrderTrversal(A);
		System.out.println();
		TreeUtil.printPreOrderTrversal(A);
		System.out.println();
		TreeUtil.printPostOrderTrversal(A);
	}
}
