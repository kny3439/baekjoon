import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		if (n == 0) {
            System.out.println(0);
            return;
        }
		
		int round=(int)Math.round((double)n*15/100);
//		int[]arr=new int[n-(round*2)];
		int[]arr=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(br.readLine());	
		}
	
		Arrays.sort(arr);
		
		int sum=0;
		
		for(int i=round; i<n-round; i++) {
			sum+=arr[i];
		}
		
		System.out.println((int)Math.round((double)sum/(n-(round*2))));
	}
}