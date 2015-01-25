package API;

import java.util.Hashtable;

//Dynamically growing datastructure
//no index, only key value pair
//keys should be unique
//one key can hold only one value

public class Collections_API2 {

	public static void main(String[] args) {
		
		Hashtable<String,String> table=new Hashtable<String,String>();
		table.put("name","Aishu");
		table.put("place","Plano");
		table.put("Age","25");
		
		System.out.println(table.get("name"));
		System.out.println(table.get("place"));
		table.put("place","Minneapolis");
		System.out.println(table.get("place"));
		System.out.println(table.get("Age"));
		
		

}
} 