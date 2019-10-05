package multiplicationPackage;

import java.util.Scanner;

public class Prakriti {

	public static void main(String[] args) {
		
	
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the first No : ");
		double firstNo = obj.nextInt();
		System.out.println("Enter the Second No : ");
		double secondNo = obj.nextInt();
		
		double answer = firstNo / secondNo ;
		System.out.println("Division of "+firstNo+ " and "+ secondNo+" number equal to " + answer);

		
	}

}
