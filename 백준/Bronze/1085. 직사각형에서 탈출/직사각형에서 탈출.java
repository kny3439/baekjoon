import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int r=w-x;
		int r2=h-y;

		int a=Math.min(r, r2);
		int b=Math.min(x, y);
		
		System.out.println(Math.min(a, b));
	}
}