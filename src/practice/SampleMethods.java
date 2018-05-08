package practice;

public class SampleMethods {

	
	public void add(){
		int a = 10;
		int b = 20;
		int c = a +b;
		System.out.println(c);
	}
	
	
	public int add2(){
		int a = 20;
		int b = 20;
		int c = a +b;
		return c;
	}
	
	public void add3(int b){
		int a =20;
		int c = a +b;
		System.out.println(c);
	}
	
	public int add4(int a,int b){
		int c = a +b;
		System.out.println(c);
		return c;
	}
	public static void main(String[] args) {
		SampleMethods sam = new SampleMethods(); 
		sam.add();
		int d = sam.add2();
		System.out.println(d);
		int e  =44;
		sam.add3(e);
		
		d = sam.add4(10,43);
		int f = sam.add4(43, 222);
		System.out.println(d);
		System.out.println(f);
	}
}
