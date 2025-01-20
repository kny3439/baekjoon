import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 두 정수 a b 를 한번에 입력받은 다음 a + b의 결과를 출력하는 프로그램 코드

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(a+b);
		
		scan.close();
	}
}