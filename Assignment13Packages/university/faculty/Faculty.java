package university.faculty;

import java.util.ArrayList;
import java.util.List;

import university.courses.Courses;

public class Faculty {
	private String facultyName;
	private int facultyId;
	private static List<Faculty> facultyList = new ArrayList<>();

	
	public Faculty(String facultyName, int facultyId) {
		super();
		this.facultyName = facultyName;
		this.facultyId = facultyId;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	
	public static void addfaculty(Faculty faculty) {
		facultyList.add(faculty);
	}
	
	public static void displayFaculties() {
		for(Faculty faculty:facultyList) {
			System.out.println(faculty);
		}
	}
	
	
	@Override
	public String toString() {
		return "Faculty [facultyName=" + facultyName + ", facultyId=" + facultyId + "]";
	}
	
	
	
}
