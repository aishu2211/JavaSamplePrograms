package Java_Basics;

public class Functions {

	// function -> control comes - first time
	public static void main(String[] args) {
		System.out.println("start");
		
		print();
		print();
		print();
		int r = addNumbers(89,76,88,"hello");
		System.out.println("Returned result is -- " + r);
		r = addNumbers(819,726,838,"hello");
		System.out.println("Returned result is -- " + r);

		
		System.out.println("end");
	}
	
	// function body // 0 ip and 0 op
	public static void print(){
		System.out.println("Selenium with java");
	}
	// 4 ip 0 op
	public static int addNumbers(int a, int b, int c,String x){
		int result = a+b+c;
		System.out.println("Result is " + result);
		return result;
	}
	
	

}
