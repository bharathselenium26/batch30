package practice;

public class MethExample {

	
//Methods 
	
	public void add(){
		 System.out.println("I am add method");
	 }
	
	public int div() {
		int a  = 40;
		int b =20;
		int c  = a/b ;
		return c;
	}
	public static void main(String[] args) {
		MethExample e  = new MethExample();
		e.add();
		int d = e.div();
		int x = d + 10;
		System.out.println(x);
	}
}
