package chapter06;

public class Project6_1 {
	
	public static void main(String[] args){
		
		Student6_1 student1 = new Student6_1("iggy");
		Student6_1 student2 = new Student6_1("karel", 100, 100, 100);
		
		student1 = new Student6_1(student1.getName(), 85, 90, 95);
		
		System.out.println("Student 1: \n" + student1);
		System.out.println("Student 2: \n" + student2);
		
	}
	
}

class Student6_1 extends chapter06.lib.case_study.Student {
	
	public Student6_1(){
		super();
	}
	public Student6_1(String name){
		setName(name);
	}
	public Student6_1(String name, int test1, int test2, int test3){
		this(name);
		setScore(1, test1);
		setScore(2, test2);
		setScore(3, test3);
	}
	
}