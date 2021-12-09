package collectionprograms;

import java.util.HashSet;
import java.util.Set;

public class SetProgram {

	
	public static void main(String[] args) {
		
		//doest not contain duplicate element
		//Hashset does not maintain order
		
		Set<String> set = new HashSet<String>();
		set.add("Alpha");
		set.add("Almond");
		set.add("mohit");
		set.add("tom");
		set.add("papaya");
		
		System.out.println(set.contains("tom"));
		
		for(String s : set) {
			System.out.println(s);
		}
		
		
		
		
		
		
	}

}
