package assignment;
//Stack with Array

public class StackD {
	int size, top;
	int arr[];
	int n;
	int data;

	StackD(int n) {
		this.size = n;
		this.arr = new int[size];
		this.top = -1;
	}

	public void push(int data2) {
		if (!isFull()) {
			top++;
			arr[top] = data2;
			System.out.println("Pushed Element:" + arr[top]);
		} else {
			size = size * 2;
			StackD s = new StackD(size);
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int temp = top;
			top--;
			System.out.println("Poped element is:" + arr[temp]);
			return temp;

		} else {
			System.out.println("Stack is empty:");
			return -1;
		}

	}

	public int peek() {
		if (!this.isEmpty()) {
			return arr[top];
		} else {
			System.out.println("stack is empty:");
			return -1;
		}
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return (size - 1) == top;
	}

	/*
	 * public static void main(String args[]) { StackD s1 = new StackD(10);
	 * s1.pop(); System.out.println("------------"); s1.push(10); s1.push(20);
	 * s1.push(30); s1.push(40); System.out.println("-------------"); s1.pop();
	 * s1.pop(); System.out.println("-------------"); }
	 */

}
