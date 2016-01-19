package chapter6;

public class Project6_2 {

	public static void main(String[] args){
		Student6_2 s1 = new Student6_2("Karel", 110, 100, 99);
		Student6_2 s2 = new Student6_2();
		Student6_2 s3 = new Student6_2("", -5, 50, 500);
		Student6_2 s4 = new Student6_2("Iggy", 85, 90, 95);
		
		System.out.println("Student 1:\n" + s1.validateData());
		System.out.println("Student 2:\n" + s2.validateData());
		System.out.println("Student 3:\n" + s3.validateData());
		System.out.println("Student 4:\n" + s4.validateData());
	}
	
}

class Student6_2 extends chapter6.Student6_1 {
	
	public Student6_2(){  super();  }
	public Student6_2(String name){  super(name);  }
	public Student6_2(String name, int t1, int t2, int t3){  super(name, t1, t2, t3);  }
	
	public String validateData(){
		boolean valid = true;
		String result = "";
		if(this.getName().isEmpty()){
			result += "ERROR: Name field required.\n";
			valid = false;
		}
		for(int i = 1; i <= 3; i++){
			int score = this.getScore(i);
			if(score < 0 || score > 100){
				result += "ERROR: Test " + i + " is out of the range 0-100 (inclusive).\n";
				valid = false;
			}
		}
		return valid ? null : result;
	}
	
}