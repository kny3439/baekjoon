

import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int c = 0;

	        while(n>=0) {

	            if (n % 5 == 0 ) {
	                n /= 5;
	                c += n;
	                System.out.println(c);
	                return;

	            }else{
	                n -= 3;
	                c++;
	            }

	        }

	        // 와일문에서 계산 끝내고 출력하기
	       System.out.println("-1");

	    }

	}
