package Com.Programs;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of lines:");
		int lines=sc.nextInt();
		int mid=(lines+1)/2;
		for(int i=1;i<=mid;i++){
			for (int s=1;s<=(mid-i) ; s++) {
				System.out.print(" ");
				}
				for (int j=1;j<=(i*2-1) ; j++) {
				System.out.print("*");
				}
           System.out.println();
		}
		for(int i=1;i<=mid-1;i++){
			for (int s=1;s<=i ; s++) {
				System.out.print(" ");
				}
				for (int j=1;j<=2*(mid-i)-1 ; j++) {
				System.out.print("*");
				}
 System.out.println();
		}

sc.close();
	}

}
