package practice;

public class VarExample {

	public String batch = "selenium";
	
	public void checkme() {
		String name = "checkme";
		System.out.println(batch);
		System.out.println(name);
	}
	
	public void testme() {
		String name = "testme";
		System.out.println(batch);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		VarExample var = new VarExample();
		var.checkme();
		var.testme();
	}
}
