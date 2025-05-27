package p2;
 
class OtherPackage
{
  OtherPackage()
  {
    p1.Protection pro=new p1.Protection();
    System.out.println("Inside the OtherPackage constructor");
    //System.out.println("value of n"+pro.n);
  //  System.out.println("value of n_pri"+pro.n_pri);
    //System.out.println("value of n_pro"+pro.n_pro);
    System.out.println("value of n_pub"+pro.n_pub);
   }
} 