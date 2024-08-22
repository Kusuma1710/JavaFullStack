import java.util.Scanner;
class clock
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hours, minutes and seconds");
		int hr=sc.nextInt();
		int min=sc.nextInt();
		int sec=sc.nextInt();
		System.out.println("CLOCK");
		System.out.println("=======");
		System.out.println("HH:MM:SS");
			for(hr=hr;hr<24;hr++){
				for(min=min;min<60;min++){
					for(sec=sec;sec<60;sec++){
				System.out.printf("%2d:%2d:%2d\r",hr,min,sec);
				Thread.sleep(1000);
		}sec=0;
	}min=0;
}hr=0;
}
}
