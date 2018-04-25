package practice;

public class Add {

	public void add() {
		
		int a = 10;
		int b = 20;
		int c;
		c = a+b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String args[]) {
		
		Add a = new Add();
		a.add();
		
		Add a3 = new Add();
		a3.add();
	}
	

}
