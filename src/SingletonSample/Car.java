package SingletonSample;

public class Car {
	
	static Car c= null;
	String name;
	//Constructor - private
	private Car(){
		
	}
	public void drive(){
		System.out.println("Driving "+ name);
	}
	//The below method can be called many times. But it return only one object.
	public static Car getInstance(){
		
		if(c==null)
			c= new Car();
		
		return c;	
	}
}
