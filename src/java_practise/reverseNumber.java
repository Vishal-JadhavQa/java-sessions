package java_practise;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		//logic 1
		int num = sc.nextInt();
		
/*		int rev = 0;
		
		while(num!=0) {
			rev=rev*10 + num%10;
			num=num/10;
		}
*/
		//logic 2 -> string buffer
		
/*		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		
*/
		//logic 3 -> StringBuilder class
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append(num);
		StringBuilder rev=sb1.reverse();
		
		System.out.println("Reverse number is :" +rev);
	}

}
