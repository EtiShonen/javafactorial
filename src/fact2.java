import java.util.Scanner;

public class fact2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, fact=1;
		System.out.print("enter any number ");
		
		Scanner r=new Scanner(System.in); 
		n=r.nextInt();
		
		for(int i=1; i<=n; i++) {
			fact=fact*i;
		}
		System.out.print("factorial "+ fact);
	}

}
