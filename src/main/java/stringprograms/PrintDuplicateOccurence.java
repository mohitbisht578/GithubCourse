package stringprograms;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateOccurence {
	
	public static void main(String[] args) {
		
	String str = "hello world hello to world";
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
	for(Map.Entry<String, Integer> entry : map.entrySet()) {
		
	    if(entry.getValue() > 1) {
	    	
        System.out.println(entry.getKey() + " " + entry.getValue());
    }
	
	}
}
}
