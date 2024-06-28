import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.WeakHashMap;

public class Sample {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Test", "vijay");
		map.put("Uniq", "raja");
		map.put("Tech", "raja");

		System.out.println();
		Collections.synchronizedMap(map);

	}

}
