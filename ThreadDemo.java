class NewThread implements Runnable
{
 Thread t;
 NewThread()
 {
  t=new Thread(this,"AI171");
  System.out.println("Inside the child thread"+t);
 }
 public void run()
 {
  try
  {
    for(int n=1;n<6;n++)
    {
      System.out.println("The child thread number is "+n);
     
Thread.sleep(1000);
    }
  }
  catch(InterruptedException e)
  {
   System.out.println("The exception in child thread is "+e);
  }
 }
}
class ThreadDemo
{
 public static void main(String args[])
 {
  NewThread nt=new NewThread();
  nt.t.start();
  try
  { 
    for(int n=5;n>0;n--)
    {
      System.out.println("the main thread number is"+n);
      Thread.sleep(10);
    }
  }
 catch(InterruptedException e)
  {
   System.out.println("The main thread is "+e);
  }
 }
}
  