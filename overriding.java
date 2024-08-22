class Method
{
	void show()
	{	System.out.println("Parent class method called:");
	}
}
class Overriding extends method
{
	void show()
	{
	 super.show();
	System.out.println(" Sub class method called");
	}
}
