package assignment;

public class ArrayClass {
	int numarray[];
	int numarraysize;
	int index = 0;

	public ArrayClass(int size) {
		numarray = new int[size];
		numarraysize = size;
	}

	public ArrayClass() {

	}

	public void insertion(int data) {

		if (index < numarraysize) {
			numarray[index] = data;
			index++;
		} else {
			System.out.println("please resize the array");
		}
	}

	public void display() {
		for (int i = 0; i < numarray.length; i++) {
			System.out.print(numarray[i] + ", ");

		}
	}

	public void resize(int newsize) {
		if (newsize > numarraysize) {
			int numarraynew[] = new int[newsize];
			for (int i = 0; i < numarray.length; i++) {
				numarraynew[i] = numarray[i];
			}
			numarray = numarraynew;
			numarraysize = newsize;
		} else {
			System.out.println("New size should greate than the old one: " + numarraysize);
		}

	}

//	public static void main(String[] args) {
//		ArrayClass arr = new ArrayClass(3);
//		arr.insertion(34);
//		arr.insertion(20);
//		arr.insertion(15);
//		arr.display();
//		arr.resize(2);
//	}
}
