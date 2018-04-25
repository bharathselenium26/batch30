package practice;

public class Meth2 {

	
	public static int add(int a , int b) {
		int c  = a+ b;
		return c;
	}
	
	public static int avg(int c) {
		int d = c/2;
		return d;
	}
	public static void main(String[] args) {
		int a  = 50;
		int b = 50;
		int c = add(a,b);
		int av = avg(c);
		System.out.println(av);
	}
	
	public static String getName() {
		String name = "bharath";
		return name;
	}
}
