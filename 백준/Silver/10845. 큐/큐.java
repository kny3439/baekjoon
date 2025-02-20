
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();

		int back=0;
		while (n-- > 0) {

			String str = sc.next();
			if (str.equals("push")) {
				int a = sc.nextInt();
				queue.offer(a);
				back=a;
			} else if (str.equals("pop")) {
				if (!queue.isEmpty()) {
					System.out.println(queue.poll());
				}else {
					System.out.println("-1");
				}
			}else if(str.equals("size")) {
				System.out.println(queue.size());
			}else if(str.equals("empty")) {
				if (queue.isEmpty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else if(str.equals("front")) {
				if(queue.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(queue.peek());
					
				}
			}else if(str.equals("back")) {
				if(queue.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(back);
				}
			}
		}
	}
}
