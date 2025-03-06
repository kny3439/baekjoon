import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a=Integer.parseInt(br.readLine());
		
		int[][] arr = new int[a][2];
		
		for(int i=0; i<a; i++) {
			StringTokenizer num=new StringTokenizer(br.readLine());
			arr[i][0]=Integer.parseInt(num.nextToken());
			arr[i][1]=Integer.parseInt(num.nextToken());
		}
		
	
		Arrays.sort(arr,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0]) {
					return Integer.compare(o1[1], o2[1]);
				}else  {
					return Integer.compare(o1[0], o2[0]);
				}
			}
		
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i < a; i++) {
			sb.append(arr[i][0]+ " "+arr[i][1]).append("\n");
		}
		
		System.out.println(sb);
	}
}