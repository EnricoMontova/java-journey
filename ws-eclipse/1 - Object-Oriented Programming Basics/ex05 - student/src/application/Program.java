package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Name: ");
		student.name = sc.nextLine();
		
		System.out.println("Grades: ");
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		
		if(student.isPassed()) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING POINTS: %.2f POINTS%n", student.missingPoints());
		}
		
		sc.close();
	}

}
