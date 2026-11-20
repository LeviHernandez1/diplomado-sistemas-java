public class SubRutinas {
// Todo : Paso de parametros a args desde el IDE
    public static int siempre2026(){

        return 2026; // Siempre va un return y se sugiere que se tenga siempre uno solo
    }

    // Sobrecarga donde podemos tener dos metodos con el mismo nombre con diferentes tipos para mesclar ambas
    public static double suma (int primerValor, int segundoValor){
        double resultado = 0;
        resultado = primerValor + segundoValor;
        return resultado;
    }

    public static double suma (double primerValor, double segundoValor){
        double resultado = 0;
        resultado = primerValor - segundoValor;
        return resultado;
    }

    public static double suma (double primerValor){ // Solo 1 parametro
        double resultado = 0;
        resultado = primerValor + 0.0;
        return resultado;
    }

    public static String suma (String primerValor, String segundoValor){
        String resultado ;
        resultado = primerValor + segundoValor;
        return resultado;
    }


    public static double sumaDouble (double primerValor, double segundoValor){
        double resultado = 0;
        resultado = primerValor + segundoValor;
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Subrutinas");
        saluda(); // Esto es el llamado/ejecucucion/invocacion de un procedimineto
        bienvenida("MUNDO");
        bienvenida("UNAM");
        bienvenida("Participantes" + "del" + " diplomado " + 2026);
        String variable = "Diplomado de Java, Edicion 21 del 2026";
        bienvenida(variable);
        //bienvenida('j');// COmo no es string es un char no lo tomara correcto

        // Ejecucion de funciones
        int entero = 0;
        siempre2026();
        System.out.println("La funcion al ejecutarce, regresa " + siempre2026());
        entero = siempre2026();
        System.out.println("La variable a esperar entera es: " + entero);

        System.out.println("La suma es: " + suma(1,1));// Regresa a double por el casteo

        byte variableByte = 100;
        long variableLong = 300;
        char variableChar = 300;

        System.out.println("suma regreso ..." + suma(10,20));
        //System.out.println("suma regreso ..." + suma(variableByte, variableLong)); // No se permite la promocion ya que no se permite int a long pero si entre byte a byte
        System.out.println("suma regreso ..." + suma(variableByte, variableChar));
        //System.out.println("suma regreso ..." + suma(10.0, 20.0));
        System.out.println("suma regreso ..." + sumaDouble(10.0, 20.0));

        System.out.println("suma regreso ..." + suma(10,20)); // int , int
        System.out.println("suma regreso ..." + suma(variableByte, variableChar)); // int, int
        System.out.println("suma regreso ..." + suma(variableByte, 200L)); // double, double ?? // Si fue double ,double
        System.out.println("suma regreso ..." + suma(100.0, 200.0)); //double , double
        System.out.println("suma regreso ..." + suma(1000F, 2000F)); // int, int ?? Fue double double
        System.out.println("suma regreso ..." + suma(111, 222.0)); // double, double ?? // Si fue double, double
        System.out.println("suma regreso ..." + suma("Hola", "Mundo")); // string, string
        System.out.println("suma regreso ..." + suma(33)); // double

        // Pruint tiene diferentes sobrecargas que son 10 por cada tipo de dato que podemos usar
        System.out.println();

        System.out.println("Fin del programa");
    }

    // Definicion de procedimineto, no regresan valor por el void a menos que se llame desde el main
    public static void saluda(){
        System.out.println("Hola");
    }

    public static void despedida(){
        System.out.println("Adiós");
    }

    public static void bienvenida(String nombre){ // Procedimineto (void) que recibe un parametro
        System.out.println("Hola " + nombre);
    }
}
