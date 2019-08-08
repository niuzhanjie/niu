package com.example.demo.util.node;

public class MyLinkedList {

	Node head=null;//链表的头结点
	/**
	 * 新增链表
	 * 找到链表的末尾节点，把新添加的数据作为末尾及得按的后续节点
	 * @param data
	 */
	public void addNode(int data) {
		Node newNode=new Node(data);//传入data值
		if(head==null) {//判断是否是第一次传入，第一次为链表头结点
			head=newNode;//赋值
			return;
		}
		Node temp=head;//从第一个节点开始
		while(temp.next != null) {//找到最后一个节点
			temp=temp.next;//往后逐个节点
		}
		temp.next=newNode;
	}
	
	/**
	 * 输出链表
	 */
	public void printLink() {
		System.out.println(head+"head");
		Node curNode=head;
		while(curNode!=null) {
			System.out.print(curNode.data+"");
			curNode=curNode.next;
		}
		System.out.println();
	}
	
	
	public boolean deleteNode(int index) {
		if(index<1 || index>length()) {//删除节点不存在
			return false;
		}
		if(index==1) {//删除头结点
			head=head.next;
			return true;
		}
		Node preNode=head;
		Node curNode=preNode.next;
		int i=1;
		while(curNode !=null) {
			if(i==index) {//寻找到待删除节点
				preNode.next=curNode.next;//待删除节点的前节点指向待删除节点的后节点
				return true;
			}
			//当前节点和前节点同时向后移
			preNode=preNode.next;
			curNode=curNode.next;
			i++;
		}
		return true;
	}
	
	/**
	 * 求链表长度
	 */
	public int length() {
		int length=0;
		Node curNode=head;
		while(curNode!=null) {
			length++;
			curNode=curNode.next;
		}
			
		return length;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
