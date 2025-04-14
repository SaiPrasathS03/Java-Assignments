package university.main;

import university.courses.Courses;
import university.faculty.Faculty;
import university.students.Student;

public class UniversityMain {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Sai");
		Student.addStudent(student1);
		Student.displayStudents();
		
		Courses course1 = new Courses("Artificial Intelligence",6);
		Courses.addCourse(course1);
		Courses.displayCourses();
		
		Faculty faculty1 = new Faculty("Prasath",1);
		Faculty.addfaculty(faculty1);
		Faculty.displayFaculties();
	}

}
