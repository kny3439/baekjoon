
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int cnt=0;
		
		int i=1;
		while(true) {
			
			if(String.valueOf(i).contains("666")) {
				cnt++;
				if(cnt==n) {
				System.out.println(i);
				return;
				}
				
			}
			
			i++;
		}
		
	}
}
