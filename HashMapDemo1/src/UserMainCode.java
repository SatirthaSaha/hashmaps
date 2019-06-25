import java.util.HashMap;
import java.util.Map;

public class UserMainCode {

	public static Map<Integer, String> getStudents(Map<Integer, Integer> map) {
		// Creating the empty output map
		Map<Integer, String> medalMap = new HashMap<Integer, String>();
		// Iterating through the input map
		for (int key : map.keySet()) {
			// Optaining the marks by the key
			int marks = map.get(key);
			// Evaluating the medal type based on the marks
			if (marks >= 90)
				medalMap.put(key, "Gold");
			else if (marks >= 80)
				medalMap.put(key, "Silver");
			else
				medalMap.put(key, "Bronze");
		}
		return medalMap;

	}
}
