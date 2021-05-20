package day_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class DataStructure {

	public DataStructure() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// ArrayList
		ArrayList<String>arrayList = new ArrayList<>();
		arrayList.add("pranav");
		arrayList.add("sahil");
		arrayList.add(2,"ubhe");
		
		Iterator <String> it = arrayList.iterator();
		while (it.hasNext()) {
		System.out.println(it.next());
		}
		for (int i =0;i <arrayList.size();i++) {
		System.out.println(arrayList.get(i));
		}
		arrayList.clear();
		System.out.println(arrayList.contains("pranav"));
		arrayList.forEach((word)->System.out.println(word));
		for (String word : arrayList) {
			System.out.println(word);
		}
		//LinkedList
		LinkedList <String> linkedList = new LinkedList<>();
		linkedList.add("suyesh");
		linkedList.add("suru");
		linkedList.add("test");
		linkedList.add("test 2");
		
		for (String word : linkedList) {
			System.out.println(word);
		}
		
		linkedList.addFirst("First Element");
		linkedList.addLast("Last Element");
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		
		System.out.println("After Adding First & Las Element");
		for (String word : linkedList) {
			System.out.println(word);
		}
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println("After Removing First & Las Element");
		
		for (String word : linkedList) {
			System.out.println(word);
		}
		Iterator<String> it2 = linkedList.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		//hashmap 
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("name 1", "Sahil");
		hashMap.put("name 2", "Test");
		hashMap.put("name 3", "Test 2");
		hashMap.put("name 4", "Test 3");
		hashMap.put("name 5", "sahil");
		hashMap.put("name 1", "Test");
		
		
		//Hash Set
				HashSet<String> hashSet = new HashSet<>();
				hashSet.add("sahil");
				hashSet.add("sahil");
				hashSet.add("sahil");
				hashSet.add("Test");
				hashSet.add("Test");
				hashSet.add("Test 2");
				
				for (String value : hashSet) {
					System.out.println(value);
				}
				
				Iterator<String> it4 = hashSet.iterator();
				while(it4.hasNext()) {
					System.out.println(it4.next());
				}
	}
}
