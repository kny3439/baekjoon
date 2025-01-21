import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();


		for(int k=0; k<s; k++ ) {
			int a=sc.nextInt();
			String str=sc.next();
			for(int i=0; i<str.length(); i++) {
				for(int j=0; j<a; j++) {
					char c=str.charAt(i);
					System.out.print(c);
				}
			}
			System.out.println();
		}	
		
		
	}
}