import java.util.HashMap;
import java.util.Map;

public class UserMainCode {

	public static Map<String,String> getStates(String data)
	{
		String[] stateCapital=data.split("-");
		Map<String, String> medalMap = new HashMap<String, String>();
		for(String i:stateCapital)
		{
			String[] sC=i.split("\\|\\|");
			medalMap.put(sC[0], sC[1]);
		}
		return medalMap;
	}
}
