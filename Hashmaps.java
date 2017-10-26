import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class Hashmaps {
	public static void main(String [] args) {
		//Declare hashmap
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		//adding elements to a hashmap
		hmap.put(12,"Person1");
		hmap.put(2, "Person2");
		hmap.put(7, "Person3");
		hmap.put(49, "Person4");

		System.out.println(hmap.size());
		System.out.println(hmap.get(12));

		//display content using iterator
		Set set = hmap.entrySet(); //wtf is this
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.print("key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}

		//get values based on keys
		String var = hmap.get(2);
		System.out.println("Value at index 2 is: " + var);

		//remove values based on keys
		hmap.remove(49);
		System.out.println("Map key and values after removal: ");
		Set set2 = hmap.entrySet();
		Iterator iterator2 = set2.iterator();
		while(iterator2.hasNext()) {
			Map.Entry mentry2 = (Map.Entry)iterator2.next();
			System.out.print("Key is: " + mentry2.getKey() + " & Value is: ");
			System.out.println(mentry2.getValue());
		}
	}
}