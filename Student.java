package week3.day1;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Sathish");
	}
	public void studentDept() {
		System.out.println("Mechanical");
	}
	public void studendId() {
		System.out.println("114114");
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.departmentName();
		obj.studentName();
		obj.studentDept();
		obj.studendId();
	}

}
