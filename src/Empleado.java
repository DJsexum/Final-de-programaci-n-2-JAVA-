import java.util.ArrayList;
import java.time.LocalDate;

public class Empleado extends Persona
{
    private LocalDate FechaIngreso;
    private LocalDate FechaEgreso;
    private int Legajo;
    private double Salario;

    public Empleado(int dni, boolean activo, String nombres, String apellidos, String telefono, String direccion, String localidad, Provincia provincia, Sexo sexo, LocalDate fechaNacimiento, LocalDate fechaIngreso, LocalDate fechaEgreso, int legajo, double salario)
    {
        super(dni, activo, nombres, apellidos, telefono, direccion, localidad, provincia, sexo, fechaNacimiento);
        this.FechaIngreso = fechaIngreso;
        this.FechaEgreso = fechaEgreso;
        this.Legajo = legajo;
        this.Salario = salario;
    }

    // Métodos de Empleado
    public Empleado altaEmpleado() { /* Implementación */ return null; }
    public void bajaEmpleado() { /* Implementación */ }
    public void modificarEmpleado(Empleado empleado) { /* Implementación */ }
    public Empleado buscarEmpleado(int legajo) { /* Implementación */ return null; }
    public ArrayList<Empleado> listarEmpleados() { /* Implementación */ return null; }
}