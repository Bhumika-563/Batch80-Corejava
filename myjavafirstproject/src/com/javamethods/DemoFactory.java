package com.javamethods;
class StudentInfo{
	int sid;
	String sname;
	int age;
}
public class DemoFactory {
	//factory method
	StudentInfo getStudent()
	{
		StudentInfo s = new StudentInfo();
		s.sid = 18;
		s.sname = "Virate";
		s.age = 38;
		return s;
		
	}

	public static void main(String[] args) {
		DemoFactory dt = new DemoFactory();
		StudentInfo s1 = dt.getStudent();
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.age);

	}

}
