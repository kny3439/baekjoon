import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		str=str.toUpperCase();
		
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			
			char c=str.charAt(i);
			
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c)+1);
				
			}else {
				map.put(c, 1);
			}
		
		}
		
		int max=0;
		char result='?';
		
		for(Map.Entry<Character, Integer>entry: map.entrySet()) {
			
			if(entry.getValue()>max) {
				max=entry.getValue();
				result=entry.getKey();
			}else if(entry.getValue()==max) {
				result='?';
			}
		}
		
	
		
		
		System.out.println(result);
		

		
		
	}

}