package com.bridgelabz.datastructures;

public class LinkedList {
		Node head;
		//every list having node that start with head
	public void insert(int data)
	{
		//to implement the functions 
		//to insert data first creating node  object 
	
		Node node =new Node();
		//to intialize of an object
		node.data=data;
		node.next=null;//by default value is null
		// insert the  nodes into list,list having head
		
		
		if(head==null)
		{
			head=node;
		}
		else //if head is not null
		{
			Node temp=head;
			while(temp.next!=null)
			{
		    temp=temp.next;	
			}
			temp.next=node;
		}
	}
	/*public void insertAtStart(int data)
			{
		
	      Node head;
		  Node node=new Node();//
		  node.data=data;
		  node.next=null;
		  node.next=head;*/
		  
		
		
		
		
		
		
			
	public void show()
		{
			Node node=head;//to start with the head
			while(node.next!=null)//node.next is not equal to null
			{
				System.out.println(node.data);//to print node data
				System.out.println(node.next);
				node=node.next;
			}
			System.out.println(node.data);	
		}

}
