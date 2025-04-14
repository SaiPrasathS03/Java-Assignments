
package university.students;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private int id;
	private String name;
	
	private static List<Student> studentList = new ArrayList<>();
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void addStudent(Student stud) {
		studentList.add(stud);
	}
	
	public static void displayStudents() {
		for(Student st:studentList) {
			System.out.println(st);
		}
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
