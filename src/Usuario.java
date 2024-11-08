public class Usuario
{
    private String Usuario;
    private String Clave;
    private Persona Propietario;

    public Usuario(String usuario, String clave, Persona propietario)
    {
        this.Usuario = usuario;
        this.Clave = clave;
        this.Propietario = propietario;
    }

    // Métodos de Usuario
    public Usuario altaUsuario() { /* Implementación */ return null; }
    public void bajaUsuario() { /* Implementación */ }
    public void modificarUsuario(Usuario usuario) { /* Implementación */ }
    public Usuario buscarUsuario() { /* Implementación */ return null; }
    public ArrayList<Usuario> listarUsuarios() { /* Implementación */ return null; }
}