package inherit;

public class A {

	
	public int age = 25;
	
	public String getName() {
		return "bharath";
	}
	
	public static void main(String[] args) {
		
		A a  = new A();
		System.out.println("Age is " + a.age);
		System.out.println("Name is " + a.getName());
	}
}
