package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Empleado implements Observer{
    private String name;
    private RecordAcademico academicRecord;
    private List<Curso> courses;

    public Empleado(String name) {
        this.name = name;
        this.academicRecord = new RecordAcademico();
        this.courses = new ArrayList<>();
    }

    @Override
    public void update(Curso curso, double grade) {
        academicRecord.addCourseGrade(curso, grade);
    }

    public void enrollCourse(Curso curso) {
        courses.add(curso);
        curso.registerObserver(this);
    }

    public void concludeCourse(Curso curso, double grade) {
        curso.concludeCourse(grade);
    }

    public String getName() {
        return name;
    }

    public RecordAcademico getAcademicRecord() {
        return academicRecord;
    }
}
