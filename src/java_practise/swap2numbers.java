package java_practise;

public class swap2numbers {

	public static void main(String[] args) {

		int a = 20, b = 30;

		System.out.println("Before swapping values are :" + a + " " + b);
 
		// logic 1 -> using 3rd variable
	/*	int t = a;
		a = b;
		b = t; 
	*/	
		
		//logic 2 -> addition & subtraction without using 3rd variable
		
/*		a=a+b;  //a=10 b=20 a+b=30 (a)
		b=a-b;	//a=30 b=20
		a=a-b;
*/
		
		//logic 3 -> multiplication & div
/*		a=a*b;
		b=a/b;
		a=a/b;  
*/
		//logic 4 -> single statement
		b=a+b-(a=b);
		
		System.out.println("After swapping values are " + a + " " + b);

	}

}
