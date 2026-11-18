public class Operadores {
    public static void main (String[] args) {
        System.out.println("Operadores");

        // Operadores aritmeticos
        System.out.println((double)(1/3)); // si todos es entero me regresara un unetero
        System.out.println((double)1 / 3); // El uno lo casteamos de int a double y despues asignamos la regla

        int numero = 10;
        System.out.println(numero);
        numero += 5; // numero = numero + 5
        System.out.println(numero);

        numero++; // numero = numero + 1 o numero += 1
        System.out.println(numero);

        System.out.println(++numero);
        System.out.println("Al final la variable numero es: " + numero);

        int edad = 19;
        char genero = 'F';
        boolean necesitaSMN = genero == 'M' && edad >= 18;

        System.out.println(necesitaSMN);

        // Operador ternario
        String resultado = genero == 'M' && edad >=18? "Tiene que hacer el SNM": "Felicidades, no tiene sque hacer el servicio militar ";
        System.out.println(resultado);


    }
}
