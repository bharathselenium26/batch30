package inherit;

public class BB extends A{
	public void useAmeth1() {
		String name = getName();
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		BB b = new BB();
		b.useAmeth1();
		
	}
}
