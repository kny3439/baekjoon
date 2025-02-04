
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        sc.close();
	        
	        int sum = 0;  
	        int n = 0;    

	        // 몇 번째 대각선인지
	        while (sum < x) {
	            n++;
	            sum += n;
	        }

	        int index = x - (sum - n);

	        int bt, top; 
	        
	        if (n % 2 == 0) {
	            bt = index;
	            top = n - index + 1;
	        } else {
	            bt = n - index + 1;
	            top = index;
	        }

	        System.out.println(bt + "/" + top);
	    }
	}
