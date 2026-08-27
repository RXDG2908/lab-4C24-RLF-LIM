/**
 * StudentModel — representa los datos de un estudiante.
 * Responsable: Colaborador 1
 */
public class StudentModel {

    private String codigo;
    private String nombre;
    private double nota;

    public StudentModel(String codigo, String nombre, double nota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean estaAprobado() {
        return nota >= 13.0;
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " (" + nota + ")";
    }
}
