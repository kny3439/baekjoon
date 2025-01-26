
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int cnt=num;
		
		for(int i=0; i<num; i++) {
			String str=sc.next();
			
			boolean[]arr=new boolean[26]; // 알파벳 개수
			// boolean 의 초기값은 false.
			

			for(int j=0; j<str.length()-1; j++) {
				
				if(str.charAt(j)!=str.charAt(j+1)) {
					
					if(arr[str.charAt(j+1)-'a']==true) {
						cnt--;
						break;
						
						// 'a'는 아스키코드로 숫자 97.
						// ex) 'a' -> arr[0];  'b' -> arr[1]; 
					}
				}
				arr[str.charAt(j)-'a']=true;
				// 이미 나온 알파벳은 true로 바꾸어 다음에 나왔을 때
				// 안쪽 조건 문 안에서 그룹단어가 아님을 증명
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
