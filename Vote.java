import java.util.Scanner;
class Vote
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age");
int i = sc.nextInt();
if(i>=18)
{
System.out.println("Eligible to vote");
}else
{
System.out.println("Not eligible to vote");
}
}
}
