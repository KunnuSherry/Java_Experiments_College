import java.util.*;
class Factorial
{
	static int factorial(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		return n*factorial(n-1);	
	}
}
class FactorialMain{	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Program by KunalSharma_011_CSE-A");
		System.out.print("Write the number: ");
		int n = sc.nextInt();
		System.out.println("The Factorial of "+n+" is: "+Factorial.factorial(n));
	}
}