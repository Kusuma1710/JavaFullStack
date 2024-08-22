import java.util.Scanner;
class Time
{
 public static void main(String args[])throws Expection
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the hours minutes and seconds");
 int hr = sc.nextInt();
 int min = sc.nextInt();
 int sec = sc.nextInt();
 System.out.println("CLOCK");
 System.out.println("HOURS:MINUTES:SECONDS");
 for(hr=hr;hr<24;hr++)
  { for (min=min;min<60;min++)
    { for(sec=sec;sec<60;sec++)
	{
		System.out.print(hr,min,sec);
		Thread.sleep();
	}sec=0;
     }min=0;
   }hr=0;
}
}
