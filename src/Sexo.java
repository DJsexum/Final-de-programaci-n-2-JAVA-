public enum Sexo
{
    MASCULINO("Masculino"),
    FEMENINO("Femenino"),
    OTRO("Otro");

    private final String sexo;

    Sexo(String sexo)
    {
        this.sexo = sexo;
    }

    public String obtenerSexo()
    {
        return this.sexo;
    }
}