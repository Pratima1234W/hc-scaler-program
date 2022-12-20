import java.util.LinkedList;

//Design linked list using collection.

public class Assessment2 
{
	public static void main (String args[])
		{
			LinkedList<String> obj=new LinkedList<String>();
			obj.add("A");
			obj.add("B");
			obj.add("C");
			obj.add("D");
			System.out.println("List are:"+obj);
			System.out.println("get string according to mentioned index position:"+obj.get(0));
			obj.set(3, "Changed");
			System.out.println("get string according to mentioned index position:"+obj.get(3));
		
		}
}
