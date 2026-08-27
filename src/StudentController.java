import java.util.ArrayList;
import java.util.List;

/**
 * StudentController — orquesta el modelo, la vista y el reporte.
 * Responsable: Responsable del grupo
 */
public class StudentController {

    private final List<StudentModel> estudiantes = new ArrayList<>();
    private final StudentView vista = new StudentView();
    private final StudentReport reporte = new StudentReport();

    public void agregarEstudiante(StudentModel estudiante) {
        estudiantes.add(estudiante);
        vista.mostrarMensaje("Estudiante agregado: " + estudiante.getNombre());
    }

    public StudentModel buscarPorCodigo(String codigo) {
        for (StudentModel estudiante : estudiantes) {
            if (estudiante.getCodigo().equals(codigo)) {
                return estudiante;
            }
        }
        return null;
    }

    public void listarEstudiantes() {
        vista.mostrarListado(estudiantes);
    }

    public void mostrarReporte() {
        System.out.println(reporte.generarResumen(estudiantes));
    }

    public static void main(String[] args) {
        StudentController controlador = new StudentController();

        controlador.agregarEstudiante(new StudentModel("C001", "Renzo Leon", 16.5));
        controlador.agregarEstudiante(new StudentModel("C002", "Erick Gamarra", 14.0));
        controlador.agregarEstudiante(new StudentModel("C003", "Mishel Rojas", 11.5));

        controlador.listarEstudiantes();
        controlador.mostrarReporte();
    }
}
