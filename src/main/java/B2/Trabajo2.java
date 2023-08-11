package B2;

import javax.swing.*;
import java.util.Scanner;
public class Trabajo2 {
    public static void main(String[] args) {
//trabajo en clase numero 2
        Scanner scanner = new Scanner(System.in);
        String pares="numeros pares:";
        String inpares="numeros inpares:";

        System.out.println("digite el numero maximo");
        int limite= scanner.nextInt();

        for (int i=0; i<= limite; i++) {
            if (i % 2 == 0) {
                pares = pares + i + "_";
            }else if (i %2!=0){
                inpares = inpares + i + "_";
            }
            else {
                System.out.println("el numero no es entero");
            }
        }
        System.out.println(pares);
        System.out.println(inpares);
    }
}
//public static String quitarUltimaLetra(String palabra) {
//
//        // Verificar si la palabra no está vacía
//
//        if (palabra != null && palabra.length() > 0) {
//
//            // Obtener la subcadena sin la última letra
//
//            return palabra.substring(0, palabra.length() - 1);
//
//        } else {
//
//            return "";
//
//        }
//
//    }