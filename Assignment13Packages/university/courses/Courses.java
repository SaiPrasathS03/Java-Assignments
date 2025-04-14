package university.courses;

import java.util.ArrayList;
import java.util.List;

public class Courses {
	private String courseName;
	private int durationInMonths;
	
	private static List<Courses> courseList = new ArrayList<>();
	
	public Courses(String courseName, int durationInMonths) {
		super();
		this.courseName = courseName;
		this.durationInMonths = durationInMonths;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDurationInMonths() {
		return durationInMonths;
	}
	public void setDurationInMonths(int durationInMonths) {
		this.durationInMonths = durationInMonths;
	}
	
	public static void addCourse(Courses course) {
		courseList.add(course);
	}
	
	public static void displayCourses() {
		for(Courses course:courseList) {
			System.out.println(course);
		}
	}
	
	
	@Override
	public String toString() {
		return "Courses [courseName=" + courseName + ", durationInMonths=" + durationInMonths + "]";
	}
	
	
}
