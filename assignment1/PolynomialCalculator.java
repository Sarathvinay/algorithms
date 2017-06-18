package assignment1;

import java.util.Scanner;

public class PolynomialCalculator {

	
	public PolynomialCalculator()
	{
		int num;
		double x_val;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the number of coefficients");
		num = stdin.nextInt();
		double[] coeff = new double[num];
		for(int i=0;i<num;i++)
		{
			coeff[i] = i+1;
		}
		System.out.println("Enter the value of X");
		x_val = stdin.nextInt();
		
		calculateExpression(coeff,x_val);
		stdin.close();
	}
	
	public void calculateExpression(double [] coeff,double x_val)
	{
		double final_value=0;
		
		for(double i=0;i<coeff.length;i++)
		{
			final_value = final_value+(coeff[(int) i] * (Math.pow(x_val,i)));
		}
		
		System.out.println("final value is : " + final_value);
		
	}
	
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
		PolynomialCalculator p1 = new PolynomialCalculator();
		System.exit(0);
	}
	
}
