//program to check whether the number is oddd or even

import java.util.Scanner;
class Abc{

	 public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int a=sc.nextInt();
	if((a%2 == 0))
{
	System.out.println("Number is even");
} else
{
System.out.println("Number is not even");
}
}
}
