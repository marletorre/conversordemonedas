package principal;


import filtros.DireccionAPI;
import modelos.MetodosUtiles;
import modelos.TipoCambio;

import java.io.IOException;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {
            DireccionAPI direccion = new DireccionAPI("https://v6.exchangerate-api.com/v6/c3969b791ca6d08c2ce67d0b/pair/");
            //Muestra las opciones disponibles
            System.out.println(MetodosUtiles.menu());
            //Selecciona la opcion
            opcion = teclado.nextInt();
            //redirecciona a la opcion escogida
            direccion.redireccionar(opcion);
            //valida si es una direccion valida
            if (direccion.esValida()) {
                TipoCambio cambio = MetodosUtiles.conversionElegida(direccion.getDireccion());
                System.out.println("Que cantidad desea convertir: ");
                Scanner teclado2 = new Scanner(System.in);
                double valor = teclado2.nextDouble();
                System.out.println(cambio.mostrarResultado(valor));
            }else if (opcion == 7) {
                break;
            }else{
                System.out.println("No es una opción valida, Ingrese de nuevo!");
            }
        }
        System.out.println("Saliendo del sistema");
    }
}
