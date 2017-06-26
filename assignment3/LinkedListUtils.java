package assignment3;

public class LinkedListUtils {

	public ListNode createList(ListNode head,int data)
	{


		ListNode temp = new ListNode();
		temp.data = data;
		temp.next = null;

		ListNode current ;

		current = head;

		while(current.next != null)
			current = current.next;
		current.next = temp;
		
		return head;
	}
	
	public void displayData(ListNode head)
	{
		ListNode current;
		current = head.next;
		int count=0;
		System.out.println("The elements are: ");
		while(current != null && count<=8)
		{
		//	System.out.println("Address is :"+ current.toString() );
		//	System.out.println("Data is :" +current.data);
			
		System.out.println(current.data);

			current = current.next;
			count++;
		}	
	}
	
	public int calculateLength(ListNode head)
	{
		int length = 0;
		
		ListNode current;
		
		current = head.next;
		
		if(current == null)
		return length;
		
		while(current != null)
		{
			length++;
			current = current.next;
		}
		return length;		
	}
	
	public ListNode lastNodeAddress(ListNode head)
	{
		ListNode temp,current;
		current = head.next;
		
		while(current.next.next!=null)
		{
			current = current.next;
		}
		
		temp = current.next;
		
		return temp;
	}
}
