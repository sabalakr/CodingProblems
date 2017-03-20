package com.sathesh.codingpractice;


class Node
{
	public int data;
	public Node next;
}

public class SingleLinkedList 
{

	private Node head;
	
	public void insertFirst(int data)
	{
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=head;
		head=newNode;
	}
	
	public void insertLast(int data)
	{
		Node current = head;
		while(current.next!=null)
		{
			current=current.next;
		}
		Node newNode=new Node();
		newNode.data=data;
		current.next=newNode;
	}
	
	public void insertAtAny(int after,int data)
	{
		Node current = head;
		while(current.next!=null && current.data!=after)
		{
			current=current.next;
		}
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=current.next;
		current.next=newNode;
	}
	
	public void print()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public static void main(String args[])
	 {
	   SingleLinkedList myLinkedlist = new SingleLinkedList();
	   myLinkedlist.insertFirst(5);
	   myLinkedlist.insertFirst(6);
	   myLinkedlist.insertFirst(7);
	   myLinkedlist.insertFirst(1);
	   myLinkedlist.insertLast(2);
	   myLinkedlist.print();
	 }
}
