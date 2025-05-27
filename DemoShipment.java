class Box
{
  double width,height,depth;
  Box(Box ob)
  {
    width=ob.width;
    height=ob.height;
    depth=ob.depth;
  }
  Box(double w,double h,double d)
  {
    width=w;
    height=h;
    depth=d;
    
  }
  Box()
  {
    height=-1; 
    width=-1;
    depth=-1;
    
  }
  Box(double len)
  {
    width=height=depth=len;
  }
  double volume()
  {
    return width*depth*height;
  }
}
class BoxWeight extends Box
{
  double weight;
  BoxWeight(BoxWeight ob)
  {
      super(ob);
      weight=ob.weight;
  }
  BoxWeight(double w,double h,double d,double m)
  {
    super(w,h,d);
    weight=m;
  } 
  BoxWeight()
  { 
   super();
   weight=-1;
  }
  BoxWeight(double len,double m)
  {
    super(len);
    weight=m;
  }
}
class Shipment extends BoxWeight 
{
  double cost;
  Shipment(Shipment ob)
  {
    super(ob);
    cost=ob.cost;
   
  }
  Shipment(double w,double h,double d,double m,double c)
  {
    super(w,h,d,m);
    cost=c;
  } 
  Shipment()
  {
    super();
    cost=-1; 
  }
  Shipment(double len,double m,double c)
  {
    super(len,m);
    cost=c;
  }
}
class DemoShipment
{
  public static void main(String args[])
 {
   Shipment shipment1=new Shipment(11,20,15,10,3.14);
   double vol;
   vol=shipment1.volume();
   System.out.println("Volume of the shipment is"+ vol);
   System.out.println("Weight of the shipment is"+ shipment1.weight);
   System.out.println("Cost of the shipment is"+ shipment1.cost);
 }
}