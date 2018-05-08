package inherit;

public class B {
	
	public int getBTime() {
		return 1020;
	}

	public void useAmeth() {
		A a = new A();
		String name  = a.getName();
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		A ao = new A();
		System.out.println(ao.age);
		System.out.println(ao.getName());
		
		B b = new B();
		System.out.println(b.getBTime());
	}
}
