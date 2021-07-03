package org.college;

public class Dept extends Hostel {
public void dept() {
	System.out.println("dept");
}
public static void main(String[] args) {
	Dept d=new Dept();
	d.collegeName();
	d.collegeCode();
	d.collegeRank();
	d.studentName();
	d.studentDept();
	d.studentId();
	d.hostelName();
	d.dept();
}
}
