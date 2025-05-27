class Box
{
  double height;
  double width;
  double depth;
}
class BoxDemo
{
  public static void main(String[] args)
  {
    Box mybox1=new Box();
    mybox1.height=1;
    mybox1.width=3;
    mybox1.depth=5;

    double vol;
    vol=mybox1.width*mybox1.height*mybox1.depth;
    System.out.println("Volume is "+vol);

    Box mybox2=new Box();
    mybox2.height=100;
    mybox2.width=300;
    mybox2.depth=400;
    vol=mybox2.width*mybox2.height*mybox2.depth;  
    System.out.println("Volume is "+vol);
  
  
  }
}