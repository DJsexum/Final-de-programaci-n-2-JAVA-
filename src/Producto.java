import java.util.ArrayList;

public class Producto
{
    private int Codigo;
    private String Detalle;
    private String Talle;
    private double Precio;
    private String Marca;
    private String Material;
    private Categoria Categoria;
    private int Stock;

    public Producto(int codigo, String detalle, String talle, double precio, String marca, String material, Categoria categoria, int stock)
    {
        this.Codigo = codigo;
        this.Detalle = detalle;
        this.Talle = talle;
        this.Precio = precio;
        this.Marca = marca;
        this.Material = material;
        this.Categoria = categoria;
        this.Stock = stock;
    }

    public Producto altaProducto() { /* Implementación */ return null; }
    public void bajaProducto() { /* Implementación */ }
    public void modificarProducto() { /* Implementación */ }
    public ArrayList<Producto> listarProductos() { /* Implementación */ return null; }
    public Producto busquedaProducto() { /* Implementación */ return null; }
    public void verDetalleProducto() { /* Implementación */ }
}