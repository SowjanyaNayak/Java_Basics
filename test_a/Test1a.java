package test_a;

public class Test1a {
	
	public static int  rollnb=8;
	public static void main(String arg[]) throws Exception
	{
System.out.println("inside main");
Test2a obj1=new Test2a();
  System.out.println(rollnb);
  doAddition();
  System.out.println(rollnb);
  sub();
  System.out.println(rollnb);
	}
	  
	public static void doAddition() {
		System.out.println("first addition");
		rollnb+=3;
		
	}
	public static void sub() {
		System.out.println("sec addition");
		rollnb+=4;
		
	}

}
