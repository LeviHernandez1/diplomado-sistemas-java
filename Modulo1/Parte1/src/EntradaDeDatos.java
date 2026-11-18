import java.util.Scanner; // (1)

public class EntradaDeDatos {
    public static void main(String[] args) {
        System.out.println("Entrada de datos con Scanner");
        Scanner teclado = new Scanner(System.in); // (2)

        String nombre = "desconocido";
        System.out.println("Como te llamas ?");
        nombre = teclado.nextLine(); // Metodo que recibe un String del usuario/a

        int edad = 0;
        System.out.println("Cuantos años tienes");
        edad = teclado.nextInt(); // Metodo que permite regresar un int del usuario

        double calificacion = 0;
        System.out.println("Que calificacion obtubiste en el modulo 1 ?");
        calificacion = teclado.nextDouble(); // Metodo que recibe un doubledel usuario

        System.out.println("Hola " + nombre + ", veo que tienes " + edad + " años.");
        System.out.print("Como obtuviste un " + calificacion + " entonces estas ");
        System.out.println( calificacion >= 8 ? "Aprobado" : "Reprobado"); // "Aprobado" "Reprobado"

        // if
        if (edad >= 18){
            System.out.println("Felicidades, ya eres un adulto ");
            System.out.println("Ya puedes votar");
        } else {
            System.out.println("Aun no eres adulto por lo que no tienes que pagar inpuestos");
        }

        // switch
        switch (edad) {
            case 6:
                System.out.println("Vas a entrar a la primaria");
                break;
            case 15:
                System.out.println("Vas a entrar al bachilleraro");
                break;
            case 18:
                System.out.println("Vas a entrar a la universidad");
                System.out.println("Felicidades ya debes de pagar impuestos");
                break;
            default: // Si no fue ninguno de los anteriores entonces
                System.out.println("No entraste en el switch");
        }
    }
}
