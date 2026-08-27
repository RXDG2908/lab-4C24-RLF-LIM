import java.util.List;

/**
 * StudentView — muestra la informacion de los estudiantes por consola.
 */
public class StudentView {

    public void mostrarEstudiante(StudentModel estudiante) {
        System.out.println("Codigo : " + estudiante.getCodigo());
        System.out.println("Nombre : " + estudiante.getNombre());
        System.out.println("Nota   : " + estudiante.getNota());
        System.out.println("Estado : " + (estudiante.estaAprobado() ? "APROBADO" : "DESAPROBADO"));
    }

    public void mostrarListado(List<StudentModel> estudiantes) {
        System.out.println("=== LISTADO DE ESTUDIANTES ===");
        for (StudentModel estudiante : estudiantes) {
            System.out.println("  " + estudiante);
        }
        System.out.println("Total: " + estudiantes.size());
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(">> " + mensaje);
    }
}

