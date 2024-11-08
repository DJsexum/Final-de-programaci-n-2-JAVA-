import java.time.LocalDate;

public class Persona
{
    private int Dni;
    private boolean Activo;
    private String Nombres;
    private String Apellidos;
    private String Telefono;
    private String Direccion;
    private String Localidad;
    private Provincia Provincia;
    private Sexo Sexo;
    private LocalDate FechaNacimiento;

    // Constructor de la clase Persona
    public Persona(int dni, boolean activo, String nombres, String apellidos, String telefono, String direccion, String localidad, Provincia provincia, Sexo sexo, LocalDate fechaNacimiento)
    {
        this.Dni = dni;
        this.Activo = activo;
        this.Nombres = nombres;
        this.Apellidos = apellidos;
        this.Telefono = telefono;
        this.Direccion = direccion;
        this.Localidad = localidad;
        this.Provincia = provincia;
        this.Sexo = sexo;
        this.FechaNacimiento = fechaNacimiento;
    }

    // Metodo para ver los datos de la persona
    public void DatosPersona()
    {
        System.out.println("DNI: " + Dni);
        System.out.println("Nombre: " + Nombres + " " + Apellidos);
        System.out.println("Teléfono: " + Telefono);
        System.out.println("Dirección: " + Direccion);
        System.out.println("Localidad: " + Localidad);
        System.out.println("Provincia: " + Provincia);
        System.out.println("Sexo: " + Sexo);
        System.out.println("Fecha de Nacimiento: " + FechaNacimiento);
    }

    // Metodos Getters y Setters
    public int ObtenerDni()
    {
        return Dni;
    }

    public void EstablecerDni(int dni)
    {
        this.Dni = dni;
    }

    public boolean ObtenerActivo()
    {
        return Activo;
    }

    public void EstablecerActivo(boolean activo)
    {
        this.Activo = activo;
    }

    public String ObtenerNombres()
    {
        return Nombres;
    }

    public void EstablecerNombres(String nombres)
    {
        this.Nombres = nombres;
    }

    public String ObtenerApellidos()
    {
        return Apellidos;
    }

    public void EstablecerApellidos(String apellidos)
    {
        this.Apellidos = apellidos;
    }

    public String ObtenerTelefono()
    {
        return Telefono;
    }

    public void EstablecerTelefono(String telefono)
    {
        this.Telefono = telefono;
    }

    public String ObtenerDireccion()
    {
        return Direccion;
    }

    public void EstablecerDireccion(String direccion)
    {
        this.Direccion = direccion;
    }

    public String ObtenerLocalidad()
    {
        return Localidad;
    }

    public void EstablecerLocalidad(String localidad)
    {
        this.Localidad = localidad;
    }

    public Provincia ObtenerProvincia()
    {
        return Provincia;
    }

    public void EstablecerProvincia(Provincia provincia)
    {
        this.Provincia = provincia;
    }

    public Sexo ObtenerSexo()
    {
        return Sexo;
    }

    public void EstablecerSexo(Sexo sexo)
    {
        this.Sexo = sexo;
    }

    public LocalDate ObtenerFechaNacimiento()
    {
        return FechaNacimiento;
    }

    public void EstablecerFechaNacimiento(LocalDate fechaNacimiento)
    {
        this.FechaNacimiento = fechaNacimiento;
    }
}