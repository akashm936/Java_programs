
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample2 {

	public static void main(String[] args) {

		Vector list = new Vector<>();
		
		list.addElement(10);
		list.addElement("20");
		list.addElement(30);
		list.addElement("fifty");
		list.addElement(50);
		
		System.out.println(list);
		
		// find only integer element from the Vector
		
		Enumeration enumeration = list.elements();
		Vector<Integer> list1 = new Vector<Integer>();

		while(enumeration.hasMoreElements())
		{
			Object obj = enumeration.nextElement();
			if(obj instanceof Integer)
			{
				Integer integer = (Integer)obj;
				list1.addElement(integer);
			}
		}
		System.out.println(list1);
	}

}
