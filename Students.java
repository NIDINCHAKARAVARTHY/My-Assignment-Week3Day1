package week3.day1;

public class Students {
	public void getStudentsinfo(int a) {
		System.out.println("Studend Id : "+ a);
	}
	public void getStudentsinfo(int a, String b) {
		System.out.println("Student Id : "+ a);
		System.out.println("Studend Name : "+ b);
	}
	public void getStudentsinfo(String c, long d) {
		System.out.println("Student E.mail : "+c);
		System.out.println("Student PnoneNumber :"+d);
	}
	public static void main(String[] args) {
		Students std = new Students();
		std.getStudentsinfo(114);
		std.getStudentsinfo(112, "Naveen");
		std.getStudentsinfo("naveen@gmail.com", 9876543210l);
		
	}

}
