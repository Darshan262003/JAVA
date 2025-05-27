class Calculate
{
  double height;
  double width;
  double depth;
   Box()
  {
   height=20;
   width=30;
   depth=40;		
  }

  double vol()
  {
    return height*width*depth;
  }
}
class BoxDemo2
{
  public static void main(String[] args)
  {
	Box mybox1=new Box();
	System.out.println("Volume is "+mybox1.vol());
	
  }
}	
