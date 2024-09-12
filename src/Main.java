import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void print(String mensaje) {
        System.out.println(mensaje);
    }
//ejercicio 5
    //  Solicite el ingreso de un número y conviértalo a un String mediante String.valueOf

    public static void convertirNumeroACadena() {
        Scanner scaner = new Scanner(System.in);
        print("introduci un numero");
        int numero = scaner.nextInt();
        String cadena = String.valueOf(numero);

        print("el nuumero como cadena es: " + cadena);


    }
// ejercicio 6
    //Del siguiente String “La lluvia en Mendoza es escasa” indique cual es el tamaño de la cadena es decir su número de caracteres.
    public static void tamañoDeLaCadena() {
        String texto = "La lluvia en Mendoza es escasa";
        int longitud = texto.length();
        print("el tamaño de la cadena es : " + longitud + " caracteres");


    }

    public static int contadoresDeVocales3 (String cadena) {
        int contadOrDeVocales = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracteres = cadena.charAt(i);
            Character.toLowerCase(caracteres);
            switch (caracteres) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contadOrDeVocales++;
                    break;


            }

        }
        return contadOrDeVocales;





    }
    // ejerccio 7
    // olicite el ingreso de una cadena y determine el tamaño de la misma y cuantas vocales
    //tiene en total (recorre el String con charAt)
public static void contadorDeVocales2() {
    Scanner scaner = new Scanner(System.in);
    print("introduce una cadena ");
    String cadena = scaner.nextLine();
    int tamaños= cadena.length();
    int totalDEvocales = contadoresDeVocales3(cadena);
    print("El tamaño de la cadena es:  " + tamaños + "  caracteres.");
    print("La cantidad de vocales en la cadena es: " + totalDEvocales );
    //ejerccio 7

    }
    // ejercicio 8
    //- Reemplaza todas las a del String anterior por una e. (aplique replace)
    public static void modificadorDeTexto (){
        String textos3 = "La lluvia en Mendoza es escasa";
        String textoModificado = textos3.replace('a', 'e');
        print("texto original :  " + textos3);
        print(" texto modificado :  " + textoModificado );

    }
    // ejercicio 9
    //Recorre el String del ejercicio 6 y transforma cada carácter a su código ASCII. Muéstralos en línea recta, separados por un espacio entre cada carácter.
    public static void convertidorDeTextoAascii() {

        String text0sacodigo = "La lluvia en Mendoza es escasa";
        for ( int x= 0; x < text0sacodigo.length(); x++) {
            char letras= text0sacodigo.charAt(x);
            int codigoAscii= (int) letras;
            System. out.print(codigoAscii + " ");
        }
        System.out.println();

    }


    public static void main(String[] args) {
        int opciones;

        do {
            System.out.println("Elija el ejercicio que decea ejecutar o precione 0 para finalizar" );

            Scanner scaner = new Scanner(System.in);
            opciones = scaner.nextInt();
            switch (opciones) {
                case 1:
                    print(" ejercicio 5 ");
                    convertirNumeroACadena();
                    break;

                case 2:
                    print("ejercicio 6 ");
                    tamañoDeLaCadena();
                    break;


                case 3:
                    print("ejercicio 7");
                    contadorDeVocales2();
                    break;

                case 4:
                    print("ejercicio 8");
                    modificadorDeTexto();
                    break;

                case 5:
                    print(" ejercicio 9 ");
                    convertidorDeTextoAascii();
                    break;
                case 0:
                    print(" saliendo del programa......");
                    break;
                default:
                    print(" option no valida.... precione 0 para finalizar");
                    break;
            }

        } while(opciones!= 0);
    }


















    }
