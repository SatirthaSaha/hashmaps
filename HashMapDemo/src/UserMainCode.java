import java.util.HashMap;
import java.util.Map;

public class UserMainCode {

	public static Map<Integer,Integer> getSquares(int[] array)
	{
		//Creating an empty map
		Map<Integer,Integer> map= new HashMap<Integer,Integer>();
		for(int n:array)
			map.put(n, n*n);
		//Returning the map
		return map;
	}
	
}
