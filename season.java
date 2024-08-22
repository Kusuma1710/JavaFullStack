import java.util.Scanner;
class season
{
	public static void main(String args[])
    {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a number");
	int s=sc.nextInt();
	switch(s)
	{
	  case 2:case 3:case 4:case 5:
		{System.out.print("Rainy");
	  	break;}

	  case 6:case 7:case 8:case 1:
		{ System.out.print("Summer");
		break;}

  	  case 9:case 10:case 11:case 12:
		{System.out.print("Winter");
	        break;}

	   default:
		{
		System.out.println("not a season");}
}
}
}


