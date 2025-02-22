import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] firArr = new int[n];
		for (int i = 0; i < n; i++) {
			firArr[i] = sc.nextInt();
		}
		
		Arrays.sort(firArr);

		int m = sc.nextInt();
		int[] secArr = new int[m];
		for (int i = 0; i < m; i++) {
			secArr[i] = sc.nextInt();

		}

		for (int i = 0; i < secArr.length; i++) {
			
			if (check(firArr, secArr[i])) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}

		sc.close();
	}

	public static boolean check(int arr[], int a) {

		int l = 0;
		int r = arr.length - 1;

		while (l <= r) {
			
			int mid = (l + r) / 2;
			
			if (arr[mid] == a) {
				return true;
			} else if (a > arr[mid]) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}

		return false;
	}
}
