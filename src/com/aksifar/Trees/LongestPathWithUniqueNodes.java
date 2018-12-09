/*
 * Given a binary tree, find the length of the longest path where each node in the path has the unique value. 
 */

package com.aksifar.Trees;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;


public class LongestPathWithUniqueNodes {
	
	//Stack is used to identify the last iteration of the recursion, so that +1 can be done for root node
	private Stack<Integer> stack = new Stack<>(); 
	
    public int calulateLongestPath(BinaryTreeNode root) {
    	if (root == null)
    		return 0;
    	
    	Set<Integer> set = new HashSet<>();
    	stack.push(root.getData());
    	set.add(root.getData());
    	
    	int left = calulateLongestPath(root.getLeft());
    	int right = calulateLongestPath(root.getRight());
    	
    	int leftSubTreeLongestPath=0, rightSubTreeLongestPath =0;
    	if(root.getLeft() != null && set.add(root.getLeft().getData()))
    		leftSubTreeLongestPath += left + 1;
    	
    	if(root.getRight() != null && set.add(root.getRight().getData()))
    		rightSubTreeLongestPath += right +1;
    	
    	stack.pop();
    	if(stack.isEmpty())
    	{
    		int max = (leftSubTreeLongestPath > rightSubTreeLongestPath)
    				  ? leftSubTreeLongestPath : rightSubTreeLongestPath;
    		return max + 1; //adding one for root
    	}
    	return (leftSubTreeLongestPath > rightSubTreeLongestPath)
    			? leftSubTreeLongestPath : rightSubTreeLongestPath;
    }
    
    public static void main(String[] args) {
		BinaryTreeNode A = new BinaryTreeNode(4);
		BinaryTreeNode B = new BinaryTreeNode(5);
		BinaryTreeNode C = new BinaryTreeNode(6);
		BinaryTreeNode D = new BinaryTreeNode(4);
		BinaryTreeNode E = new BinaryTreeNode(1);
		BinaryTreeNode F = new BinaryTreeNode(6);
		BinaryTreeNode G = new BinaryTreeNode(5);
		
		
		A.setLeft(B);
		A.setRight(C);
		
		B.setLeft(D);
		D.setLeft(G);
		
		C.setLeft(E);
		C.setRight(F);
		
		LongestPathWithUniqueNodes s = new LongestPathWithUniqueNodes();
		System.out.println(s.calulateLongestPath(A));
	}
}