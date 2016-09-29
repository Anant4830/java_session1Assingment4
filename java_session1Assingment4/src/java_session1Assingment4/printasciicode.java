package java_session1Assingment4;

import java.util.Scanner;

public class printasciicode {
	public void printcharactor(int x,int y){
		for(int i=x;i<=y;i++)
			System.out.println(i+"  -  "+((char) i));
	}

	public static void main(String[] args) {
		printasciicode obj1 = new printasciicode();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of m as 65 and value of n as 90 and hit enter:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		System.out.println("below is the ascii value of integer from 65 to 90:");
		
		obj1.printcharactor(m, n);
		
		
		// TODO Auto-generated method stub

	}

}
