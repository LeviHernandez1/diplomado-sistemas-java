import java.util.Scanner; // 1
public class Ciclos {
    public static void main(String[] args) {
        System.out.println("Ciclos");
        // Cuando se el numero de veces que se que tengo que repetir
        // Desplegar los numeros del 1 al 10
        int numero = 1;
        while(numero <= 10 ){
            System.out.println("Voy en la vuelta " + numero++);
            //numero++;
        }

        // Cuando no cuantas veces tengo que repetirlo pero si se la condicion donde parar
        Scanner sc = new Scanner(System.in);
        char inicial = 'X';
        char miInicial = 'E';

        while (inicial != miInicial) {
            System.out.print("Con que letra cres que comienza mi nombre ? ");
            inicial = sc.next().charAt(0); // Captura UN caracter
            // Cambiar a mayusculas la inicial para compararla con la 'E'
        }

        // Ejercicio:
            /*
            Despliega la tabla de multiplicar que sera proporcionado por el usuario
            Si el usuario da el 7 el programa debe de desplegar la tabla del 7
            7x1 = 7
            7x2 = 14
            7x3 = 14
             */
        int solicitaTabla = 0;
        int posicion = 1;
        System.out.println("¿Cual es la tabla a consultar? ");
        solicitaTabla = sc.nextInt();

        while (posicion <= 10){
            System.out.println(solicitaTabla + "x" + posicion + " = " + (solicitaTabla * posicion) );
            posicion++;
        }

        // FOR
        // Condicion inicial / comparacion / incremento
        for (int contador = 20 ;contador<=100 ; contador = contador+2 ){ // contador++
            // Lo que se repite
            System.out.println(contador);
        }

        // tabla con for

    }
}
