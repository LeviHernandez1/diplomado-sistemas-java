public class Variables {
    public static void main (String[] args) {
        // Definicion de variables / Tipos de datos
        // tipo y nombre
        // tipo nombre = valor inicial

        // boolean solo permite valores true o false
        boolean asisitio;
        asisitio = true;

        boolean aprobo = false; // Podemos usar tildes pero no se recomienda
        System.out.println (aprobo);

        // Numericos
        // Enteros byte, short, int, long
        byte edad = 99;
        System.out.println(edad);

        short temperatura = 200;
        System.out.println(temperatura);

        int numero = 50_000;
        System.out.println(numero);

        long numeroGrande = 50_000;
        System.out.println(numeroGrande);

        long telefono = 100_000_000_000L;
        System.out.println(telefono * 2);

        // Cualquier literal entera es tomada como int

        ///  Reales (numeros con parte decimal)

        float   promedio = 6.89F;
        System.out.println(promedio);

        double precio = 6.89E3;
        System.out.println(precio);

        // Cualquier literar real es double por definicion

        // Caracteres (Un caracter)
        char inicial;
        inicial = 'E'; // Caracter UNICODE (2 bytes).
        System.out.println(inicial + 1); // char + int , se combierte el char a int que es su valor en la tabla unicode

        inicial = 12353; // No es entero es unicode ぁ
        System.out.println(inicial);

        // String No es un tipo de dato promitivo, realmente es una clase por eso es obligatorio iniciarlo con mayuscula
        String escuela = "UNAM";
        System.out.println(escuela);

        // Forma alterna de definir variables con var
        // var nombre de variable y un valor inicial forsado
        var universidad = "U.N.A.M.";   // String
        var ingreso = 2022D;             // int sin la D pero con la D es Double
        var calificacion = 9.56 + 10;        // double
        ingreso = 13.78;
        System.out.println(universidad);
        System.out.println(ingreso);
        System.out.println(calificacion);

        // Expresiones
        System.out.println(10);
        System.out.println(10.0);
        System.out.println("10");

        System.out.println(16-6);
        System.out.println(16-6.0);
        System.out.println(ingreso + 100); // "Promovio" al 100 a tipo real para poder ser utilisada

        ingreso = 70.67f;
        System.out.println((int)ingreso + 100); // "Castin"
        System.out.println((int)(ingreso + 100));

        System.out.println(ingreso = 123.45F);

        System.out.println(aprobo = calificacion > 8.0); // Una asignacion es un expresion
        // var objeto = new Clase();

        precio = 123.45D;
        System.out.println(precio);


    }
}
