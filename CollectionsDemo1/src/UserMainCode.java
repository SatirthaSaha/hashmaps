import java.util.ArrayList;

public class UserMainCode {

	public static Integer[] removeElements(Integer[] array1, Integer[] array2)
	{
		//Creating 2 empty ArrayLists for holding the values of array1 and array2
		ArrayList list1=new ArrayList();
		ArrayList list2=new ArrayList();
		//Copying all the elements of array1 to list1
		for(int n:array1)
			list1.add(n);
		//Copying all the elements of array2 to list2
		for(int n:array2)
			list2.add(n);
		list1.removeAll(list2);
		Integer[] array=new Integer[list1.size()];
		list1.toArray(array);
		return array;
	}
}
 