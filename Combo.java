package Com.Programs;

import java.util.*;
public class Combo{
	public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
 System.out.print("Enter No of Rows : ");
 int rows=sc.nextInt();
 System.out.print("Enter No of col : ");
 int col=sc.nextInt();
 for(int i=1;i<=rows;i++) {
		for(int s=1;s<i;s++){
			System.out.print(" ");
		}
		for(int j=1;j<=2*(rows-i)+1;j++) {
			System.out.print("*");
			
		}
		if(i>=2) {
			
			for(int j=1;j<=i-1;j++) {
				System.out.print("-");
				}
		}
				 
			
		System.out.println();
		
 }
 
sc.close();
	}
}
