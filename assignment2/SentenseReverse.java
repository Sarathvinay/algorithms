package assignment2;

import java.util.Scanner;

public class SentenseReverse {
	
	String S1;
	
	public void get_data()
	{
		
		Scanner stdin = new Scanner(System.in);
		this.S1=stdin.nextLine();
		stdin.close();
		sentenseReverse();
		
	}
	
	public void sentenseReverse()
	{
		String[] words = S1.split(" ");
		
		String S2="";
		
		for(int i=words.length-1;i>=0;i--)
		{
			S2=S2+words[i]+" ";
		}
		
		System.out.println(S2);
		
	}

	public static void main(String[] args) {
		SentenseReverse S1 = new SentenseReverse();
		S1.get_data();
		System.exit(0);

	}

}
