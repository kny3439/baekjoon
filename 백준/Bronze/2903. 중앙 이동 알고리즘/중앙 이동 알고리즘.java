import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

			double r=Math.pow(2, a)+1;
			double r2=Math.pow(r, 2);
			
			System.out.println((int)r2);
			
	}
}
