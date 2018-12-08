package com.aksifar.Trees;

import com.aksifar.Util.TreeUtil;

public class MainTree {
 
	public static void main(String[] args) {
		
		Tree A = new Tree(4);
		Tree B = new Tree(5);
		Tree C = new Tree(6);
		Tree D = new Tree(4);
		Tree E = new Tree(1);
		Tree F = new Tree(6);
		Tree G = new Tree(5);
		
		
		A.setLeft(B);
		A.setRight(C);
		
		B.setLeft(D);
		D.setLeft(G);
		
		C.setLeft(E);
		C.setRight(F);
		
		TreeUtil.inOrderTrversal(A);
	}
}
