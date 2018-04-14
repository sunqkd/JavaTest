package com.java;

public class BinaryTree {
	
	private Node root; // ���ڵ�
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
	// �ڲ���  �ڲ���
	class Node {
		private int data;
		private Node left;
		private Node right;
		// ���췽��
		public Node(int data) {
			this.data = data;
		}
		// ��ӽڵ�
		public void add(int data) {
			if(this.data > data) {
				if(this.left == null) {
					this.left = new Node(data);
				}else {
					this.left.add(data); // �ݹ�
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
			// �������  ��=����=����
			if(this.left != null) {
				this.left.print();
			}
			System.out.print(this.data + "=>");// �м�
			if(this.right != null) {
				this.right.print();
			}
		}
	}
}
