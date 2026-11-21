public class Arreglos {
    public static void main(String[] args) {
        System.out.println("Arreglos");
        // Definicion
        // tipo[] nombre;
        // tipo nombre[];

        int[] numeros; // int numeros[]
        double[] precios; // double precios[]
        String[] nombres; // String nombres[]
        // Clientes[] top10Clientes;

        //System.out.println("Todos los numeros: " + numeros);


        int[] asistencias = new int[5];
        double[] calificaciones = new double[6];
        String[] cursos = new String[3];
        int i;

        asistencias[1] = 100;
        asistencias[4] = 400;
        for (i=0; i<=4;i++)
            System.out.println("Asistencias["+i+"]:" + asistencias[i]);

        calificaciones[0]= 8.7;
        calificaciones[1]= 8.5;
        calificaciones[3]= 10;

        cursos[0] = "Java y POO";
        cursos[1] = "BBDD";
        cursos[2] = "Persistencia";
        for (i=0; i<=2;i++)
            System.out.println("Cursos["+i+"]:" + cursos[i]);
        System.out.println("******-------------\n Todos los cursos" + cursos);

        // Arreglos de arreglos
        // tipo[][] matriz = new tipo[filas][columnas]

        // calificacionesFinales
        double [][] calificacionesFinales = new double[19][6];

        double [][][] diplomado = new double[12][19][3];
    }
}
