package assignment;
import java.util.Scanner;

public class DemoArray {
	static int arr[];
	static int pos;
	static int x, n;

	public static void insertion() {
		System.out.println("Enter number of elements you want in array:");
		int arr[] = new int[n + 1];
		System.out.println("Enter all the elements:");
		for (int i = 0; i <= n; i++) {
			System.out.println(arr[i] + "");
		}
		System.out.print("Enter the position where you want to insert element:");
		pos = s.nextInt();
		System.out.print("Enter the element you want to insert:");
		x = s.nextInt();
		for (int i = (n - 1); i >= (pos - 1); i--) {
			arr[i + 1] = arr[i];
		}
		arr[pos - 1] = x;
		System.out.print("After inserting:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.print(arr[n]);
	}

	public static void main(String args[]) {
		DemoArray d1 = new DemoArray();
		Scanner s = new Scanner(System.in);

		d1.insertion();
	}
}
