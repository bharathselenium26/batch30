package exp;

public class Example3 {

	static String st = "";
	
	public static void main(String[] args) {
		System.out.println("I am Bharath");
		String st2  = "bharath";
		boolean b =true;
		int k = 0;
		int m = 10;
		try {
			b= st.equals(st2);
			System.out.println(st);
			System.out.println(b);
			int f = m/k;
			System.out.println(f);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		int j = 0;
		if(b) {
			int i =0;
			System.out.println("Both are equal");
			System.out.println(j);
		}else {
			System.out.println("both are not equal");
			System.out.println(j);
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
	}
}
