package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public boolean isPassed() {
			return finalGrade() >= 60;
	}
	
	public double missingPoints() {
		if (isPassed()) {
			return 0.0;
		} else {
			return 60.0 - finalGrade();
		}
	}
}