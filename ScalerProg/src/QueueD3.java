//implimentation3 : Queue using linked list

public class QueueD3 {
	class Node
	{
		int data;
		Node next;
		Node (int data)
		{
			this.data=data;
			next=null;
		}
	}
	static class Queue
	{
		static Node head=null;
		static Node tail=null;
		
		Queue (int n)	//constructor to know array size
		{
			arr=new int[n];
			this.size=n;
		}
		
		public static boolean isEmpty() //to check is queue empty or full.
		{
			return rear==-1 && front==-1;
		}
		
		public static boolean isFull()
		{
			return (rear+1)%size==front;
		}
		
		//enqueue O(1)
		
		public static void add(int data)
		{
			if(isFull())
			{
				System.out.println("Queue is full:");
				return;
			}
		//1st element added.	
			if(front==-1)
			{
				front=0;
			}
			
			rear=(rear+1)%size;
			arr[rear]=data;
		}
		
		//dequeue - O(1)
		
		public static int remove()
		{
			if(isEmpty())
			{
				System.out.println("Queue is Empty");
				return -1;
			}
			int result=arr[front];
		
		//Single element condition
		
			if(rear==front)
			{
				rear=front=-1;
			}
			else
			{
				front=(front+1)%size;
			}
			return result;
		}
		
		//peek - O(1)
		
		public static int peek()
		{
			if(isEmpty())
			{
				System.out.println("Queue is Empty");
				return -1;
			}
			return arr[front];
		}
	}
	
	public static void main(String args[])
	{
		Queue q =new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q.remove());
		q.add(6);
		System.out.println(q.remove());
		q.add(7);
		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}
	}

}