import java.io.*;
class Error
{
 public static void main(String args[])throws Exception
{
try{
FileReader t = new FileReader("table.txt");
} 
catch(IOException ie)
{
	System.out.println("IO Exception");
}
	catch(Exception e)
    {
	System.out.println("Exception");
    }
  }
}