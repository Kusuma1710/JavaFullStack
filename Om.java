class Method
{
	void show()
	{	System.out.println("Parent class method called:");
	}
}
class Overriding extends Method
{
	void show()
	{
	 super.show();
	System.out.println(" Sub class method called");
	}
}
public class Om
{
	public static void main(String[] args)
{
	Overriding o = new Overriding();
	o.show();
}
}
