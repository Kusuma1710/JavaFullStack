class Method //method overloading
{
	void shape(int i)
	{
		System.out.println("Rectangle"+i);
	}
	void shape(float k)
	{
		System.out.println("square"+k);
	}
	void shape(long j)
	{
		System.out.println("traingle"+j);
	}
}
class overload
{
 	public static void main(String[] args){
	Method m = new Method();	
	m.shape(90);
	m.shape(12.3f);
	m.shape(22222l);
}
}	
