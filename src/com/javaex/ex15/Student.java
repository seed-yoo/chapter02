package com.javaex.ex15;

public class Student extends Person {

	// 필드
	private String schollName;

	// 생성자
	public Student() {
		super();
		System.out.println("Student()");
	}

	public Student(String schollName) {
		super();
		this.schollName = schollName;
		System.out.println("Student(1)");
	}

	public Student(String name, int age, String schollName) {
		// 부모의 생성자 호출
		// name, age 부모
		
		super(name, age);
//		super();
//		setName(name);
//		setAge(age);
		
//		super();
//		super.setName(name);
//		super.setAge(age);

		// 자신메모리에 올리는일
		// schollName 자신
		this.schollName = schollName;
		System.out.println("Student(3)");
	}

	// 메소드 - getter/setter
	public String getSchollName() {
		return schollName;
	}

	public void setSchollName(String schollName) {
		this.schollName = schollName;
	}

	// 메소드 - 일반
	@Override
	public String toString() {
		return "이름: " + getName() + ", 나이: " + getAge() + ", 학교: " + getSchollName();
	}

}
