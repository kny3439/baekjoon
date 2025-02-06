import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n2 = sc.nextInt();
		int r = 0;
		int min=0;

		for (int i = n; i <= n2; i++) {

			if (i == 1) {
				continue;
			}

			boolean isPrime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				r+=i;
				if(min==0) {
					min=i;
				}
			}
			
	
		}
		
		if(r==0) {
			System.out.println("-1");
		}else {
			
			System.out.println(r);
            System.out.println(min);
		}
	}
}
