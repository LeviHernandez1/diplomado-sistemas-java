public class Recursividad {

    public static double factorialRecursivo (int n) {
        /* Primer intento de recursividad
        double resultado = 0;
        if (n != 0) // Condicion de parada
            resultado = n * factorialRecursivo(n-1); // n! = n * (n-1)!
        else
            resultado = 1;
       return resultado;*/
        // Con un ternario de manera recursiva
        return (n==0)? 1:n*factorialRecursivo(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Recursividad");
        System.out.println("5! =" + factorialRecursivo(5));
        // Sucesión de Fibonacci (los primeros 10 elementos)

        for (int i=1; i<=10; i++){
            //System.out.println("Termino_" +i+ " = "+ termino (i)); //t_i = t_i-1 + t_i-2
        }

        // El arte de la programacion, Donald
    }
}
