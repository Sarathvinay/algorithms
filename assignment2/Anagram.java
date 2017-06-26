package assignment2;


import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	String S1,S2;
	
	
	public Anagram()
	{
		Scanner stdin = new Scanner(System.in);
		this.S1 = stdin.nextLine();
		this.S2 = stdin.nextLine();
		stdin.close();
		if(isAnagram())
			System.out.println("Anagrams");
		else
			System.out.println("Not an Anagram");
	}
	
	public boolean isAnagram()
	{
		
		int l1,l2;
		
		l1 = S1.length();
		l2 = S2.length();
		
		if(l1 != l2)
			return false;
		
		char[] c1= S1.toCharArray();
		char[] c2= S2.toCharArray();
		
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2))
		return true;
		
		return false;
	}
	
    @SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Anagram a1 = new Anagram();

	}

}
