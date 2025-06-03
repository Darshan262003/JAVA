class ThrowsDemo
{
  static void throwOne() throws IllegalAccessException
  {
	System.out.println("Inside throwOne");
	throw new IllegalAccessException("Darshan");   
  }
  public static void main(String args[])
  {
 	try
	{
	  throwOne();
  	}
	catch(IllegalAccessException e)
	{
          System.out.println("caught Exception  \n"+e);
	}
        finally
        {
	 System.out.println("tHis is the end");
	}
 

 }
}