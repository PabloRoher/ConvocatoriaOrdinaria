package Ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class RecordAcademico {
    private Map<Curso, Double> grades;
    private double averageGrade;

    public RecordAcademico() {
        grades = new HashMap<>();
    }

    public void addCourseGrade(Curso curso, double grade) {
        grades.put(curso, grade);
        calculateAverage();
    }

    public void calculateAverage() {
        if (!grades.isEmpty()) {
            averageGrade = grades.values().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        }
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public Map<Curso, Double> getGrades() {
        return grades;
    }
}
