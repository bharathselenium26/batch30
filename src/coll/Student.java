package coll;

public class Student {
	private String name ;
	private int marks ;
	private String result;
	
	public void setName(String mName) {
		name = mName;
	}
	public void setMarks(int mMarks) {
		marks = mMarks;
	}
	//instance variable
	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	private void getStatus() {
		if (marks >= 40) {
			result = "Pass";
		} else {
			result = "Failed";
		}
	}

	public void printStudentStatus() {
		getStatus();
		System.out.println("Student  " + name + " is  " + result);
	}
	
	
}
