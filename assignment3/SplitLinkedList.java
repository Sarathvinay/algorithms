package assignment3;

import java.util.Scanner;

public class SplitLinkedList {
	
	
	public ListNode  splitList(ListNode head,int length,ListNode temp2)
	{
	    int split_length = 0,count=1;
	    
	    ListNode temp1=null,current=null;
	    
	    if(length % 2 == 0)
	    	split_length = length/2;
	    else
	    	split_length = (length+1)/2;
	    
	    current = head.next;
	    
	    
	    while(count<split_length)
	    {
	    	count++;
	    	current = current.next;
	    }
	    
	    
	    temp1 = current.next;
	    
	    current.next = null;
	    
	    temp2.next=head.next;
	    
	    head.next = temp1;
	    
	    return head;
	    
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String choice;
		ListNode head = new ListNode();
		LinkedListUtils l1 = new LinkedListUtils();
		int data;
		Scanner stdin = new Scanner(System.in);	
		do
		{
			System.out.println("Enter the data : ");
			data = stdin.nextInt();
			head = l1.createList(head, data);
			choice=stdin.next();
		}while(choice.charAt(0) == 'y' || choice.charAt(0) =='Y');
		
		System.out.println("Linked list before splitting is :");
		
		l1.displayData(head);
		
		int length = l1.calculateLength(head);
		System.out.println("The length of the linked list is : " + length);
		SplitLinkedList s1 = new SplitLinkedList();
		ListNode temp2 = l1.lastNodeAddress(head);
		head = s1.splitList(head, length,temp2);
		l1.displayData(head);
		stdin.close();

	}

}
