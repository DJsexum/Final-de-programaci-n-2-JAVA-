public class Movimiento
{
    private int Codigo;
    private String Tipo;
    private double MontoDebe;
    private double MontoHaber;
    private double SaldoAcumulado;
    private LocalDate FechaMovimiento;

    /*Esto de aca es un constructor para inicializar los valores de un movimiento*/
    public Movimiento(int codigo, String tipo, double montoDebe, double montoHaber, double saldoAcumulado, LocalDate fechaMovimiento)
    {
        this.Codigo = codigo;
        this.Tipo = tipo;
        this.MontoDebe = montoDebe;
        this.MontoHaber = montoHaber;
        this.SaldoAcumulado = saldoAcumulado;
        this.FechaMovimiento = fechaMovimiento;
    }

    /*Metodo para (no se que tiene que hacer este metodo)*/
    public Movimiento altaMovimiento()
    {
        /*Implementación*/ return null;
    }

    /*Metodo para modificar un movimiento existente*/
    public void modificarMovimiento()
    {
        /* Implementación */
    }

    /*Metodo para buscar un movimiento existente*/
    public Movimiento busquedaMovimiento()
    {
        /* Implementación */ return null;
    }

    /*Metodo que supongo que lo que hace es eliminar un movimiento o no se*/
    public void bajaMovimiento()
    {
        /* Implementación */
    }

    /*Metodos Getters y Setters si se necesitan*/
    public int ObtenerCodigo()
    {
        return Codigo;
    }

    public void EstablecerCodigo (int codigo)
    {
        this.Codigo = codigo;
    }

    public String ObtenerTipo ()
    {
        return Tipo;
    }

    public void EstablecerTipo (String tipo)
    {
        this.Tipo = tipo;
    }

    public double ObtenerMontoDebe ()
    {
        return MontoDebe;
    }

    public void EstablecerMontoDebe (double montoDebe)
    {
        this.MontoDebe = montoDebe;
    }

    public double ObtenerMontoHaber ()
    {
        return MontoHaber;
    }

    public void EstablecerMontoHaber (double MontoHaber)
    {
        this.MontoHaber = MontoHaber;
    }

    public double ObtenerSaldoAcumulado ()
    {
        return SaldoAcumulado;
    }

    public void EstablecerSaldoAcumulado (double saldoAcumulado)
    {
        this.SaldoAcumulado = saldoAcumulado;
    }

    public LocalDate ObtenerFechaMovimiento ()
    {
        return FechaMovimiento;
    }

    public void EstablecerFechaMovimiento (LocalDate fechaMovimiento)
    {
        this.FechaMovimiento = fechaMovimiento;
    }
}