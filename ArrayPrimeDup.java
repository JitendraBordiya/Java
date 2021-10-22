package Com.Programs;

public class ArrayPrimeDup {
public static void main(String ar[]) {
	int a[]={20,3,81,9,2,9,3,3,66,11,5,90,5};
	int sum=0;
	int p=0;
	for(int i=0;i<a.length;i++) {
		p=1;
		for(int j=2;j<a[i];j++) {
			if(a[i]%j==0) {
				p=0;
				break;
			}
			}
		if(p==1) {
			for(int j=i+2;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
                   sum +=a[j];	
                   break;
				}
			}
				}
		}
	System.out.println(sum);
}

}
