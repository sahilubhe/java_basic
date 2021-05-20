package day_5;

import java.util.ArrayList;

public class Lambda {

	public Lambda() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("sahil");
		arrayList.add("pranav");
		arrayList.add("pranav 2");
		arrayList.add("pranav 3");
		arrayList.add(2, "Some Name"); // inserting element in between 2 elements

		ArrayList<String> arrayList2 = new ArrayList<>();
		
		arrayList.forEach((word) -> {
			if(word.contains("pranav"))
				arrayList2.add(word);
			}
		);
		
		arrayList2.forEach((word) -> System.out.println(word));

	}

}
