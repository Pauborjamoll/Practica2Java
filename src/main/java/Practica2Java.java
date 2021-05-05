import java.util.Arrays;
import java.util.Scanner;

public class Practica2Java {
    static Scanner sc = new Scanner(System.in);
    static Double[] array = new Double[5];
    static int numero;

    public static void main(String[] args) {
        System.out.println("Bienvenido!");
        menu();
        while (numero != 0) {
            switch (numero) {
                case 1:
                    mostrarOrden();
                    break;
                case 2:
                    mostrarInvertido();
                    break;
                case 3:
                    mediaNumeros();
                    break;
                case 4:
                    contarLetras();
                    break;
                case 5:
                    invertirCadena();
                    break;
                case 6:
                    quitarEspacios();
                    break;
                case 7:
                    concatenarString();
                    break;
                case 8:
                    remplazarVocales();
                    break;
                case 9:
                    transformarAscii();
                    break;
                default:
                    numero = 0;
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("________________________________________________________________________________");
        System.out.println("|                         Inserta un número del 1 al 9                         |");
        System.out.println("________________________________________________________________________________");
        System.out.println("|   1.-     Inserta 5 números para que sean mostrados en orden                 |");
        System.out.println("|   2.-     Inserta 5 números para que sean mostrados alrevés                  |");
        System.out.println("|   3.-     Inserta 5 números para realizar la media de los números positivos, |\n|           la media de los negativos y contar el número de ceros que se han   |\n|           introducido                                                        |");
        System.out.println("|   4.-     Introduce un string para contar sus caracteres                     |");
        System.out.println("|   5.-     Introduce un string para invertirla                                |");
        System.out.println("|   6.-     Introduce un string con espacios para quitarselos                  |");
        System.out.println("|   7.-     Escribe 2 strings para que sean concatenados                       |");
        System.out.println("|   8.-     Escribe un string para remplazar las vocales por una introducida   |");
        System.out.println("|   9.-     Escribe un string para hacer print de cada caracter en ascii:      |");
        System.out.println("________________________________________________________________________________");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("|   Inserta el valor 0 para finalizar  |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        numero = sc.nextInt();
        sc.nextLine();
    }

    public static void mostrarOrden() {

        System.out.println("Inserta 5 números para que sean mostrados en orden");
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce El número " + (i + 1));
            array[i] = sc.nextDouble();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(Arrays.toString(array));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        menu();
    }

    public static void mostrarInvertido() {
        System.out.println("Has elegido el método 2");
        System.out.println("Inserta 5 números para que sean mostrados alrevés");
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce El número " + (i + 1));
            array[i] = sc.nextDouble();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        menu();
    }

    public static void mediaNumeros() {
        double countPos = 0;
        double countNeg = 0;
        int countZero = 0;
        double positive = 0;
        double negative = 0;
        double num;
        System.out.println("__________________________________________________________________________");
        System.out.println("Inserta 5 números para realizar la media de los números positivos,\n la media de los negativos y contar el número de ceros que se han introducido");
        System.out.println("__________________________________________________________________________");
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce El número " + (i + 1));
            array[i] = sc.nextDouble();
        }
        for ( int i = 0; i < 5; i++) {
            num = array[i];
            if (num > 0) {
                countPos++;
                positive = positive + num;
            } else if (num < 0) {
                countNeg++;
                negative = negative + num;
            } else {
                countZero++;
            }
        }
            if (countPos != 0) {
                countPos = positive / countPos;
            }
            if (countNeg != 0) {
                countNeg = negative / countNeg;
            }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("La media de los numeros positivos es " + (countPos));
        System.out.println("La media de los numeros negativos es " + (countNeg));
        System.out.println("Las veces que se han escrito un 0 han sido : " + (countZero));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        menu();

    }



    public static void contarLetras() {
        System.out.println("Introduce un string para contar sus caracteres");
        String texto = sc.nextLine();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(texto.replace(" ", "").length());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        menu();
    }

    public static void invertirCadena() {
        System.out.println("Introduce un string para invertirla");
        String str = sc.nextLine();
        StringBuilder strb = new StringBuilder(str);
        str = strb.reverse().toString();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        menu();
    }

    public static void quitarEspacios() {
        System.out.println("Introduce un string con espacios para quitarselos");
        String texto = sc.nextLine();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(texto.replace(" ", ""));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        menu();

    }

    public static void concatenarString() {
        System.out.println("Escribe 2 strings para que sean concatenados");
        System.out.println("Escribe el primer string :");
        String text1 = sc.nextLine();
        System.out.println("Escribe un segundo string :");
        String text2 = sc.nextLine();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(text1 + text2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        menu();
    }

    public static void remplazarVocales() {
        System.out.println("Escribe un string para remplazar las vocales por una introducida");
        System.out.println("Escribe un string :");
        String text = sc.nextLine();
        System.out.println("Escribe una vocal :");
        String vocal = sc.next();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(text.replaceAll("[aeiou]", vocal));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        menu();
    }

    public static void transformarAscii() {
        System.out.println("Escribe un string para hacer print de cada caracter en ascii:");
        String text = sc.nextLine();
        int[] iArr = new int[text.length()];
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            iArr[i] = character;
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(Arrays.toString(iArr));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        menu();
    }
}

