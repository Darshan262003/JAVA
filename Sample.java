class Sample
{
	int a;
	int b;
	void display()
	{
		System.out.println("value of a and b"+a+" and "+b")
	}
	public static void main()
	{
		Sample s1=new Sample();
		s1.a=10;
		s1.b=20;
		
		s1.display();
	}
}