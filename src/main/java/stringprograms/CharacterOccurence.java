package stringprograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurence {
	
	public static void main(String[] args) {
		
		String str = "hello";
		char[] ch = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : ch) {
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
