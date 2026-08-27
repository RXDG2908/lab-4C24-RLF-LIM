import java.util.List;

/**
 * StudentReport — calcula estadisticas sobre la lista de estudiantes.
 */
public class StudentReport {

    public double calcularPromedio(List<StudentModel> estudiantes) {
        if (estudiantes.isEmpty()) {
            return 0.0;
        }
        double suma = 0.0;
        for (StudentModel estudiante : estudiantes) {
            suma += estudiante.getNota();
        }
        return suma / estudiantes.size();
    }

    public int contarAprobados(List<StudentModel> estudiantes) {
        int aprobados = 0;
        for (StudentModel estudiante : estudiantes) {
            if (estudiante.estaAprobado()) {
                aprobados++;
            }
        }
        return aprobados;
    }

    public String generarResumen(List<StudentModel> estudiantes) {
        int total = estudiantes.size();
        int aprobados = contarAprobados(estudiantes);
        return "=== REPORTE ===" + System.lineSeparator()
                + "Total estudiantes : " + total + System.lineSeparator()
                + "Aprobados         : " + aprobados + System.lineSeparator()
                + "Desaprobados      : " + (total - aprobados) + System.lineSeparator()
                + "Promedio general  : " + String.format("%.2f", calcularPromedio(estudiantes));
    }
}

