
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double r=0;
		double r2=0;
		
		for(int i=0; i<20; i++) {
			double sum=0;
			String str=sc.next(); // 과목 이름
			double score=sc.nextDouble(); // 학점
			String credit=sc.next(); // 등급
			
			  if (credit.equals("P")) {
	                continue;
	            }
			  
			switch (credit) {
			case "A+":
				sum=score*4.5;
				break;
			case "A0":
				sum=score*4.0;
				break;
			case "B+":
				sum=score*3.5;
				break;
			case "B0":
				sum=score*3.0;
				break;
			case "C+":
				sum=score*2.5;
				break;
			case "C0":
				sum=score*2.0;
				break;
			case "D+":
				sum=score*1.5;
				break;
			case "D0":
				sum=score*1.0;
				break;
			case "F":
				sum=score*0.0;
				break;

			default:
			
				break;
			}
			
			r+=sum;
			r2+=score;
		}
		
		System.out.printf("%.6f",r/r2);
		
		sc.close();
	}
}
