package assignment3;

import java.util.Scanner;

public class SortLinkedList {
	
	ListNode firsthalf,secondhalf;
	
	
	public  ListNode  mergeSort(ListNode head)
	{
		
		ListNode middle,middlenext,right,left;
		if(head == null || head.next == null)
			return head;
		
		middle = splitLinkedList(head);
		
		middlenext = middle.next;
		middle.next = null;
		
	

		left = mergeSort(head);
		right = mergeSort(middlenext);
		

		
		
		//LinkedListUtils l1 = new LinkedListUtils();
		//l1.displayData(left);
		//l1.displayData(right);
		
		
		head=sortedMerge(left,right);
		
		return head;
		
	}
	
	
	public ListNode splitLinkedList(ListNode head)
	{
		
		ListNode first,second;
		
		if(head == null  )
		{
		  return head;
		}
		
		first = head; /* slow pointer for getting the first half */
		second=first.next; /* Fast pointer to split the linked list*/
		
		while(second!=null)
		{
			second = second.next;
			if(second!=null)
			{
				first = first.next;
				second = second.next;
			}
		}
	
		
		
		return first;
	}
	

	public ListNode sortedMerge(ListNode firsthalf,ListNode secondhalf )
	{
		ListNode temp=null; 
		

		
		if(firsthalf == null)
			return secondhalf;
		else if(secondhalf == null)
			return firsthalf;
		

		if(firsthalf.data <= secondhalf.data)
		{
			temp = firsthalf;
			temp.next = sortedMerge(firsthalf.next, secondhalf);
			
		}
		
		else
		{
			temp = secondhalf;
			temp.next = sortedMerge(firsthalf, secondhalf.next);
		}
		
		return temp;
	}
	



public static void main(String args[])
{
	
	Scanner stdin = new Scanner(System.in);
	LinkedListUtils l1 = new LinkedListUtils();
	int data;
	String ch;
	ListNode head = new ListNode();
	head.data = 0;
	do
	{
		System.out.println("Enter the data you want to insert: ");
		data = stdin.nextInt();
		System.out.println("Do you want to continue to insert: (y/Y) ");
		head = l1.createList(head, data);
		ch = stdin.next();
	} while(ch.charAt(0) == 'y' || ch.charAt(0) == 'Y');
	
	System.out.println("Created list is : " );
	
	l1.displayData(head);
	
	System.out.println("List after sorting is :");
	SortLinkedList s1 = new SortLinkedList();
	head.next = s1.mergeSort(head.next);
	
	l1.displayData(head);
	
	stdin.close();
}
}