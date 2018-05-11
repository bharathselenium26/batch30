package vehical;

public class Student {
	public String name = "";
	public int marks  = 0;
	public String result = "";
	public void setName(String mName) {
		name = mName;
	}
	public void setMarks(int mMarks) {
		marks=mMarks;
	}
	public void setDetails(int mMarks,String mName) {
		name = mName;
		marks=mMarks;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	public void resultStatus() {
		if(marks>=40) {
			result = "Pass";
		}else {
			result = "Failed";
		}
	}
	
	public void result() {
		System.out.println("Student - " + name + " is " + result);
	}
}
