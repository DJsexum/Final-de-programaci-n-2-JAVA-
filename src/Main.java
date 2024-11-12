import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import Enumerados.Sexo;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        Sexo genero = Sexo.OTRO; // Inicializar genero con Sexo.OTRO

        do
        {
            System.out.println("Seleccion sexo: ");
            System.out.println("1) Masculino");
            System.out.println("2) Femenino");
            System.out.println("3) Otro");
            System.out.print("Elija su genero: ");
            opcion = scanner.nextInt();
        }
        while (opcion < 1 || opcion > 3);

        switch (opcion)
        {
            case 1:
                genero = Sexo.MASCULINO;
                break;

            case 2:
                genero = Sexo.FEMENINO;
                break;

            case 3:
                genero = Sexo.OTRO;
                break;
        }
        System.out.println("Genero elegido: " + genero.obtenerSexo());
    }
}