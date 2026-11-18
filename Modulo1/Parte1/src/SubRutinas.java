public class SubRutinas {

    // Definicion de procedimineto, no regresan valor por el void a menos que se llame desde el main
    public static void saluda(){
        System.out.println("Hola");
    }
    public static void main(String[] args) {
        System.out.println("Subrutinas");
        saluda(); // Esto es el llamado/ejecucucion/invocacion de un procedimineto
        System.out.println("Fin del programa");
    }

    public static void bienvenida(String nombre){ // Procedimineto (void) que recibe un parametro
        System.out.println("Hola " + nombre);
    }
}
