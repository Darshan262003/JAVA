package p1;

class SamePackage
{
  Protection p=new Protection();
  SamePackage()
  {
    System.out.println("Inside the samePackage constructor");
    System.out.println("value of n"+p.n);
    //System.out.println("value of n_pri"+p.n_pri);
    System.out.println("value of n_pro"+p.n_pro);
    System.out.println("value of n_pub"+p.n_pub);
  }
}