package day12;

public class Test {
	
	// int number; // class variable
	
//	void m1(int number) // local variable
//	{
//		number = number+10;
//		System.out.println("The value from the method "+ number);
//	}
	
	int number; // class variable
	
	void m2(Test t)
	{
		t.number = t.number + 10;
		System.out.println("value in the method" + t.number);
		
		
	}
	

}
