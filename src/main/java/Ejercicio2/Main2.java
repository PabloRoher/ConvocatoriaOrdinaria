package Ejercicio2;

public class Main2 {
    public static void main(String[] args) {
        Curso curso = new Curso("Programación 2");
        Empleado empleado = new Empleado("Juan");
        empleado.enrollCourse(curso);
        empleado.concludeCourse(curso, 10);
        System.out.println(empleado.getAcademicRecord().getAverageGrade());
    }
}
