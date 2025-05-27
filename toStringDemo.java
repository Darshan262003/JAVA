
  class Box
  {
    double height,width,depth;
    Box(double h,double w,double d)
    {
	height=h;
	width=w;
	depth=d;
    }
    public String toString()
    {
	return "The dimensions are "+width+" by"+height+"by"+depth+".";
    }
  } 
class toStringDemo
{
  public static void main(String args[])
  {
   Box b=new Box(10,12,14);
   String s="The bos is "+b;
   System.out.println(b);
   System.out.println(s);
   
   String s2="Face the failure untill the failure fails to fail you";
   int start=4;
   int end=27;
   
   char buf[]=new char[end-start];
   s2.getChars(start,end,buf,0);
 
   System.out.println(buf);
   System.out.println("the number of arguements"+ args.length);
   
   for(int i=0;i<args.length;i++)
   {
   	System.out.println("The arguement "+args[i]);
   }   
  }

}