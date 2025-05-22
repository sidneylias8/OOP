package actor;

import java.util.*;

import academic.Course;

public class Lecturer extends Person implements IAttendee{
	private String lectureCode;
	private List <Course> courses = new ArrayList<>();

	public Lecturer(String lectureCode, String name, String dob) {
		super(name, dob);
		this.lectureCode = lectureCode;
	}

	public String getLectureCode() {
		return lectureCode;
	}

	public void setLectureCode(String lectureCode) {
		this.lectureCode = lectureCode;
	}
	
	public void addCourseLecture(Course course) {
		courses.add(course);
	}

	@Override
	public void takeAttendance() {
		System.out.println(name + " is verifying the attendance.");
	}

	public void showCourse(int i) {
		System.out.println(name + " is teaching:");
		for(Course course : courses) {
			System.out.println(" - " + course.getCourseName());
		}
	}
}
