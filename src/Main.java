import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        Sexo sexo = null;

        System.out.println("Ingrese el numero correspondiente al sexo:");
        System.out.println("1) Masculino");
        System.out.println("2) Femenino");
        System.out.println("3) Otro");

        opcion = scanner.nextInt();

        switch (opcion)
        {
            case 1:
                sexo = Sexo.MASCULINO;
                break;
            case 2:
                sexo = Sexo.FEMENINO;
                break;
            case 3:
                sexo = Sexo.OTRO;
                break;
            default:
                System.out.println("Opcion invalida. Por favor, intente de nuevo");
                return;
        }

        System.out.println("Sexo seleccionado: " + sexo.obtenerSexo());
    }
}