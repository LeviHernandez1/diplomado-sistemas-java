public class Instanciacion {
    public static void main(String[] args) {
        System.out.println("Ejemplo de instanciacion");

        // Instanciación
        // Clase objeto;
        // Clase objeto = new Clase();

        Casa casaLevi = new Casa();
        System.out.println("Casa de Levi: " + casaLevi);
        System.out.println("\tPrecio: $" + casaLevi.precio);

        Casa casaAdriana = new Casa();
        System.out.println("Casa de Adriana: " + casaAdriana);
        System.out.println("\tPrecio: $" + casaAdriana.precio);


        Casa[] calle = new Casa[10];

    }
}
