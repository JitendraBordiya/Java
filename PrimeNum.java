
	package Com.Programs;

	import java.util.Scanner;

	public class PrimeNum {
		public static void main(String ar[]) {
			String Prime="";
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int count;
			for(int i=1;i<n;i++) {
				 count=0;
				for(int j=1;j<=i;j++) {
					if(i%j==0)
						count=count+1;
				}
				if(count == 2) {
					Prime=Prime+i+" ";
				}
				}
			
			System.out.println(Prime);
			

	}
	}

