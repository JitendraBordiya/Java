package Com.Programs;

import java.util.Scanner;

public class Prime {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<n-1;i++) {
			if(n%i==0) 
				count=count+1;
			}
		if(count>0)
			System.out.println("n is not a Prime number");
		else
			System.out.println("n is  a prime number");
	}

}
