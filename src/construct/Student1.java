package construct;

public class Student1 {

	
	public int marks=0;
	public String name = "";
	

	public Student1(String name1 , int marks1) {
		name = name1;
		marks=marks1;
	}
	public void getDetails() {
		System.out.println("I am " + name +". My marks are " + marks);
	}
}
