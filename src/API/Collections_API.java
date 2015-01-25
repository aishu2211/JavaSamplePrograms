package API;

import java.util.ArrayList;


//Arraylist is an inbuilt class in java
// it is used to create a dynamically growing datastructure


public class Collections_API {

	public static void main(String[] args) {
		
		ArrayList<String> List=new ArrayList<String>();
		List.add("Hi");//index 0
		List.add("Hello");//index 1
		List.add("How are you");//index 2
		List.add("Aishwarya");//index 3
		
		System.out.println(List.get(2));
		System.out.println(List.get(3));
		
		for(int i=0;i<List.size();i++){
			System.out.println(List.get(i));
		}
			
		
	}

}
