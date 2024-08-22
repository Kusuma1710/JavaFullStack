interface A
{
int id=50;
}
interface B
{
int id2=60;
}
class Multi implements A,B
{
public static void main(String args[]){
System.out.println("Value if id is:"+id);
}
}
