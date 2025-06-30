class A
{
  synchronized void foo(B b)
  {
   String name=Thread.currentThread().getName();
   System.out.println("The Thread inside A class is "+name);
   try
   {
     Thread.sleep(100);
   }
   catch(InterruptedException e)
   {
     System.out.println("Exception"+e);
   }
   System.out.println("Trying to call b.last"+name);
   b.last();
   
  }
   synchronized void last()
   {
    System.out.println("Inside the last of A method");
    }
}
class B
{
   synchronized void bar(A a)
  {
   String name=Thread.currentThread().getName();
   System.out.println("The Thread inside B class is"+name);
   try
   {
     Thread.sleep(10);
   }
   catch(InterruptedException e)
   {
     System.out.println("Exception"+e);
   }
   System.out.println("Trying to call a.last"+name);
   //a.last();
   
  }
   synchronized void last()
   {
    System.out.println("Inside the last of B method");
    }
  
}
class Deadlock implements Runnable
{
  
  A a=new A();
  B b=new B();
  Thread t;
  Deadlock()
  {
    Thread.currentThread().setName("MainThread");
    t=new Thread(this,"Racing Thread");
  }
    void deadlockStart()
    {
      t.start();
      a.foo(b);
      System.out.println("Back inside main thread");

    }
   public void run()
   {
     b.bar(a);
     System.out.println("Inside another Thread");
   }
  
  public static void main(String args[])
  {
     Deadlock dl=new Deadlock();
     dl.deadlockStart();
  }
}