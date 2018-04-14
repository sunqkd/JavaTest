package com.java;

public class BinaryTree {
	
	private Node root; // 根节点
	public void addNode(int data) {
		if(root == null) {
			root = new Node(data);
		}else {
			root.add(data);
		}
	}
	public void printNode() {
		if(root !=null) {
			root.print();
		}
	}
	// 内部类  内部类
	class Node {
		private int data;
		private Node left;
		private Node right;
		// 构造方法
		public Node(int data) {
			this.data = data;
		}
		// 添加节点
		public void add(int data) {
			if(this.data > data) {
				if(this.left == null) {
					this.left = new Node(data);
				}else {
					this.left.add(data); // 递归
				}
			}else {
				if(this.right == null) {
					this.right= new Node(data);
				}else {
					this.right.add(data);
				}
			}
		}
		public void print() {
			// 中序遍历  左=》根=》右
			if(this.left != null) {
				this.left.print();
			}
			System.out.print(this.data + "=>");// 中间
			if(this.right != null) {
				this.right.print();
			}
		}
	}
}
