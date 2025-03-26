

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] arrA = new int[n];
		int[] arrB = new int[n];

		StringTokenizer numa = new StringTokenizer(br.readLine());

		for (int i = 0; i < arrA.length; i++) {
			arrA[i] = Integer.parseInt(numa.nextToken());
		}

		StringTokenizer numb = new StringTokenizer(br.readLine());
		for (int i = 0; i < arrA.length; i++) {
			arrB[i] = Integer.parseInt(numb.nextToken());
		}

		Arrays.sort(arrA);
		Arrays.sort(arrB);

		for (int i = 0; i < n / 2; i++) {
			int temp = arrB[i];
			arrB[i] = arrB[n - 1 - i];
			arrB[n - 1 - i] = temp;
		}

		int result = 0;

		for (int i = 0; i < n; i++) {
			result += arrA[i] * arrB[i];
		}
		
		System.out.println(result);

	}
}
