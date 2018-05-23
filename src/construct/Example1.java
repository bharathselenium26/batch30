package construct;

import poly.Benz;
import poly.Maruthi;

public class Example1 {

	// Constructor

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.marks = 39;
		st1.name = "bharath";
		st1.getDetails();
		
		Student st2 = new Student();
		st2.marks =89;
		st2.name = "ramu";
		st2.getDetails();
		
		
		Student st3 = new Student();
		st3.marks = 43;
		st3.name = "siva";
		st3.getDetails();
		
		
		Student st4 = new Student();
		st4.marks = 67;
		st4.name = "kumar";
		st4.getDetails();
		
		
		
		Student1 st6 = new Student1("Lak", 54);
		st6.getDetails();
	}
}
