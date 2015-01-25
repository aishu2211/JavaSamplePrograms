package String;


public class TestString {

	public static void main(String[] args) {
		String str="Hi My name is aishwarya";
		String str1="Hello how are you";
		
		System.out.println("Length of the string is " + str.length());
		System.out.println("sixth index is " + str.charAt(6));
		System.out.println(str.indexOf('a')); //First occurrence of a
		System.out.println(str.indexOf("a", 9)); //second occurrence of a
		System.out.println(str.indexOf("hello"));
		System.out.println(str.equals(str1));
		System.out.println(str.substring(14,23)); //to print a part of string
		
		String temp[]=str.split("");
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
		
		

	}

}
