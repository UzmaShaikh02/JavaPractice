package JavaProblems;

import java.util.*;

public class PerfectNum {
	
	public static void PerfectNumber(int num) {
		// TODO Auto-generated method stub
		int i, Sum = 0;
		for(i=0; i<num; i++) {
			if(num%i==0) {
				Sum= Sum +i;
			}
		}
		if (Sum == num) {
			System.out.format("%d is a perfect num : " +num);
		}
		else {
			System.out.format("%d is not a perfect num : " +num);
		}
	}
	public static void main(String[] args) {
		//Take input from user
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter a Number : ");
		int num= sc.nextInt();
		PerfectNumber (num);
		sc.close();
		
	}

	

}
