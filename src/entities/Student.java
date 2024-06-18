package entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double missingPoints() {
        return 60.0 - finalGrade();
    }

    public String toString() {
        return "FINAL GRADE = " + String.format("%.2f", finalGrade()) + "\n" +
                (finalGrade() >= 60.0 ? "PASS" : "FAILED") + "\n" +
                (finalGrade() < 60.0 ? "MISSING " + String.format("%.2f", missingPoints()) + " POINTS" : "");
    }
}
