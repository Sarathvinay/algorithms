package assignment2;

import java.util.Scanner;

public class CyclicString {
	
	
	public CyclicString()
	{
		String s1,s2;
		Scanner stdin = new Scanner(System.in);
		s1=stdin.next();
		s2=stdin.next();
		stdin.close();
		areCyclic(s1, s2);
		
	}
	
	public void areCyclic(String s1,String s2)
	{
		
		//index of returns the substring index
		
		if((s1 + s1).indexOf(s2) != -1)
		{
			System.out.println("Strings are cyclic");
		}
		else
			System.out.println("Strings are not cyclic");
		
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CyclicString c1 = new CyclicString();
		System.exit(0);

	}

}
