
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		HashMap<Integer, String> map=new HashMap<Integer, String>();
		HashMap<String, Integer> map2=new HashMap<String, Integer>();

		for (int i = 0; i < n; i++) {

			String poketName = sc.next();
			map.put(i+1, poketName);
			map2.put(poketName, i+1);

		}

		for (int i = 0; i < m; i++) {

			String result = sc.next();

			if(65<=result.charAt(0) && result.charAt(0)<=122) {
				System.out.println(map2.get(result));
			}else {
				System.out.println(map.get(Integer.parseInt(result)));
			}
			
		}

		sc.close();
	}
}
