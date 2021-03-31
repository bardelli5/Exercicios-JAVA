package entities;

public class Student {
    public String student;
    public double t1;
    public double t2;
    public double t3;

    public double finalGrade() {
        double finalGrade = t1 + t2 + t3;
        System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
        return finalGrade;
    }
}
