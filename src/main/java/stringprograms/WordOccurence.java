package stringprograms;

import java.util.HashMap;
import java.util.Map;

public class WordOccurence {
	
	public static void main(String[] args) {
		
		String str = "hello world hello to";
		String word[] = str.split(" ");
		
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String c : word) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		
		//for whole character occurence
		for(Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
		
	}

}
