interface A
{
void show();
}
class Bbb implements A
{
 public void show()
{
System.out.println("Method from an interface");
}
}
class C
{ public static void main(String args[])
{
Bbb b =new Bbb();
b.show();
}
} 
