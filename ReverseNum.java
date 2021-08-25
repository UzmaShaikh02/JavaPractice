package JavaProblems;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		System.out.println("Please enter a number : ");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int reverse =0 ;
		for (;num !=0; num =num/10) {
			int remainder= num %10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("The reverse of the given number is :" +reverse);
		sc.close();
	}

}
