class CallMe
{
  void call(String msg)
  {
    System.out.print("["+msg);
    try
    {
     Thread.sleep(10000);
    }
    catch(InterruptedException e)
    {
     System.out.println("This Exception is"+e);
    }
    System.out.println("]");
  }
}
class Caller implements Runnable
{ 
  CallMe target;
  String msg;
  Thread t;
  public Caller(CallMe targ,String s)
  {
      target=targ;
      msg=s;
      t=new Thread(this);
  }
  public void run()
  {
   //System.out.println("thread is alive?"t.isAlive());
    synchronized(target)
    {
     target.call(msg);
    }
  }
}
class Sync
{
   public static void main(String args[])
   {
    CallMe target=new CallMe();
    
    Caller ob1=new Caller(target,"GOD'S PLAN BABY");
    Caller ob2=new Caller(target,"DARSHAN");
    Caller ob3=new Caller(target,"KUMAR");
 
   ob1.t.start();
   ob2.t.start();
   ob3.t.start();
   System.out.println("The thread 1 "+ob1.t.isAlive());
   System.out.println("The thread 2 "+ob2.t.isAlive());
   System.out.println("The thread 3 "+ob3.t.isAlive());

   
   try
   {
     ob1.t.join();
     ob2.t.join();
     ob3.t.join();
   }
   catch(InterruptedException e)
   {
     System.out.println("The Exception is"+e);
   }
   }
}