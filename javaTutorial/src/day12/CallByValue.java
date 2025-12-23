package day12;

// passing copy of the variable

public class CallByValue {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		int number=100;
		
		System.out.println("Before method "+ number);
		
		// t.m1(number);
		
		// copy of the variable is used not the orignal variable 
		// only operation is done on copy variable 
		System.out.println("After method " + number);
 
	}

}
