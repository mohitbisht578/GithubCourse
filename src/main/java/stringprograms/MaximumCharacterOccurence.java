package stringprograms;

import java.util.HashMap;
import java.util.Map;

public class MaximumCharacterOccurence {
	
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
		
		int maxCount = 0;
		char maxChar = ' ';
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(maxCount < entry.getValue()) {
				maxCount = entry.getValue();
				maxChar = entry.getKey();
			}
		}
		
		System.out.println(maxChar + " - " + maxCount);
		
		
	}

}
