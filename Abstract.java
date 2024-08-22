abstract class Abs
{
 abstract void show();
 void display()
{
 System.out.println("COmplete abstract class");
}
}
class Test extends Abs
{
 void show()
{
System.out.println(" Abstract class method");
}
}
class Abstract
{
	public static void main(String args[]){
	Test t = new Test();
	t.show();
	t.display();
}
}