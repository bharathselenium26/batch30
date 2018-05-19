package str;

public class Example1 {

	public void getSize(String str) {
		int l = str.length();
		System.out.println(l);
	}
	
	public void verifyContent(String str1,String str2) {
		if(str1.equals(str2)) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Both are not equal");
		}
	}
	public static void main(String[] args) {
		
		Example1 ex = new Example1();
		ex.getSize("bharath Kumar reedy kristipati");
		ex.verifyContent("I am happy", "I am sad");
		
		
	}
}
