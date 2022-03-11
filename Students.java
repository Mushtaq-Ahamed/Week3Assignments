package week3.assignments;

public class Students {

	public void getStudentInfo(int 	Id) {
		System.out.println("Student ID : "  + Id);
	}
	
	public void getStudentInfo(String name) {
		System.out.println("Student Name : " + name);
	}
	
	public void getStudentInfo(String Email,String Department) {
		System.out.println("Student Email : " + Email + "    Student Department: "+ Department);
	}
	
	public static void main(String[] args) {
		Students std = new Students();
		std.getStudentInfo(1001);
		std.getStudentInfo("XYZ");
		std.getStudentInfo("xyz@gmail.com","Computer Science");

	}

}
