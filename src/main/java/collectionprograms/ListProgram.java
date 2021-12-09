package collectionprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListProgram {
	
	public static void main(String[] args) {
		
		//can add duplicate element
		//insertion order maintained
		//negative indexing not allowed
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
	    //for each loop
		for(Integer i : list) {
			System.out.println(i);
		}
		
		System.out.println("------");
		
		//for loop
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("------");
		
		//lambda function
		list.stream().forEach(e -> System.out.println(e));
		
		System.out.println("------");
		
		//iterator
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			int text = itr.next();
			System.out.println(text);
		}
		
		System.out.println("------");
		
		//listiterator
		ListIterator<Integer> ltr = list.listIterator();
		while(ltr.hasNext()) {
			int t = ltr.next();
			System.out.println(t);
		}
	}

}

