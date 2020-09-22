package data.structure;

import java.util.*;

public class HashTableAssignment {

	public static Hashtable<Integer, Student> stdTable = new Hashtable<Integer, Student>();

	public static void main(String[] args) {
		int test = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome...");
		do {
			System.out.println("Enter 1 to add student, 2 -show info, \n3 " + "-searh roll, 4 -delete Student: ");
			test = sc.nextInt();

			if (test == 1) {
				addStudent();
				System.out.println();
			} else if (test == 2) {
				showStudentsInfo();
				System.out.println();
			} else if (test == 3) {
				searchByRollNo();
				System.out.println();
			} else if (test == 4) {
				deleteStudent();
				System.out.println();
			} else {
				System.out.println("There is no data for your input number.");
			}

			System.out.println("Type 1 to continue program or 0 to exist: ");
			test = sc.nextInt();

		} while (test == 1);

	}

	static void addStudent() {

		Scanner sc = new Scanner(System.in);
		int loop = 1;
		do {
			System.out.print("Enter Student roll no: ");
			int rollNo = sc.nextInt();

			System.out.print("Enter Student name: ");
			String name = sc.next();

			System.out.print("Enter Student nrc: ");
			String nrc = sc.next();

			Student std = new Student(rollNo, name, nrc);
			stdTable.put(rollNo, std);

			System.out.println();
			System.out.println("Enter 1 to add more student or 0 to break: ");
			loop = sc.nextInt();

		} while (loop == 1);
	}

	static void showStudentsInfo() {

		if (stdTable.isEmpty()) {
			System.out.println("No Student data.");
		} else {
			Enumeration<Student> e = stdTable.elements();
			while (e.hasMoreElements()) {
				Student std = (Student) e.nextElement();
				System.out.println(std.toString());
			}
		}
	}

	static void searchByRollNo() {

		int loop = 1;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter roll no: ");
			int rollNo = sc.nextInt();

			if (stdTable.containsKey(rollNo)) {
				Student std = (Student) stdTable.get(rollNo);
				System.out.println(std.toString());
			} else {
				System.out.println("Roll No not found.");
			}

			System.out.println();
			System.out.println("Enter 1 to search again or 0 to exist: ");
			loop = sc.nextInt();

		} while (loop == 1);
	}

	static void deleteStudent() {

		int loop = 1;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Enter Roll No: ");
			int rollNo = sc.nextInt();

			if (stdTable.containsKey(rollNo)) {
				stdTable.remove(rollNo);
				System.out.println("Roll No " + rollNo + " delete successfully.");
			} else {
				System.out.println("No Data Found to delete.");
			}

			System.out.println();
			System.out.print("Enter 1 to delete again or 0 to exist: ");
			loop = sc.nextInt();
		} while (loop == 1);
	}

}
