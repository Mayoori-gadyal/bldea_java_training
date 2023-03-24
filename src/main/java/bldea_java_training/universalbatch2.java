/**
 * 
 */

/**
 * @author Lenovo
 *
 */
import java.util.Scanner;
public class universalbatch2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sc=new Scanner(System.in);
System.out.print("enter the value of n:");
int n=Sc.nextInt();
for(int i=0;i<=n;i++) {
	for(int j=0;j<=n;j++) {
		if(j==0||i==0&&j<=n/2||j==n/2&&i<=n/2||i==n/2&&j<=n/2) {
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
	        
			for(int j=0;j<=n;j++) {
				if (j==0||j==n/2||i==n/2&&j<n/2||i==0&&j<n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
	}
		
			for(int j=0;j<=n;j++) {
				if (j==n/2||i==0||i==(n)&&j<=n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
	}
			for(int j=0;j<=n;j++) {
				if (j==n/2||i==0||i==(n)&&j<=n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
	}	
			for(int j=0;j<=n;j++) {
				if (j==0||j==n/2||i==n&&j<=n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
	}		
	System.out.println();
}
	}

}
