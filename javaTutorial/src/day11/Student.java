package day11;

public class Student {

	int sid;
	String sname;
	char sgrade;
	
	void studentData() {
		System.out.println(sid+" "+sname+" "+sgrade );
	}
	
	void studentInfo(int id, String name, char grade) {
		
		sid = id;
		sname= name;
		sgrade = grade;
		System.out.println(sid+" "+sname+" "+sgrade );
	}
	
	Student(int id, String name, char g){
		
		sid = id;
		sname = name;
		sgrade = g;
		System.out.println(sid+" "+sname+" "+sgrade );
	}
}
