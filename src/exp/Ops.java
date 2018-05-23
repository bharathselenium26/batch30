package exp;

public class Ops {

	public static void main(String[] args) {
		
		Example2 ex1 = new Example2();
		
		
		
		System.out.println(ex1.i);
		
		
		ex1.i = ex1.i + Example2.j ;// 10+20 30
		Example2.j = ex1.i + Example2.j ;// 30+20 50
		

		Example2 ex2 = new Example2();
		System.out.println(ex2.i);//10
		System.out.println(Example2.j);//50
		
		
		ex2.i = ex2.i + Example2.j ;//  60
		Example2.j = ex2.i + Example2.j ;//  110
		System.out.println(ex2.i);
		System.out.println(Example2.j);
		
		int l = ex2.name.length();
	}
}
