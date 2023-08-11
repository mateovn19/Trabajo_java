package B2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     /*   Boolean esNUmerico = false;
        int edad = 17;
        if (esNUmerico) {
            System.out.println("el booleano esta null ");
        } else if (esNUmerico) {
            System.out.println("es nuemrico");
        } else {
            System.out.println("no es numerico");
        }

        System.out.println("+++++++++++++++++++++");
        String mensaje = (edad >= 18) ? "eres mayor de edad" : "eres menor de edad ";
        System.out.println(mensaje);
*/
        List<String> nombre = new ArrayList<>();//las listas son estructuras dinamicas ya que puedes meter las veces que quieran no hay limite
        nombre.add("mauricio");
        nombre.add("mateo");
        nombre.add("esteban");

        int[] edad = {12, 15, 22, 2, 5, 44};//un arreglo son estructuras de datos que almacenan informacion de un tipo concreto pueden o no estar ordenados su ventaja es que tienen un indice que es una pocicion absoluta que pueden guardar informacion es mas eficiente que tener una lista poque es mas dinamicas

        for (int age:edad){
            System.out.println(age);
        }
/*
        for (int i=0;i< edad.length; i++);{//length es una propiedad que tinen los arreglos
            System.out.println(edad[i]);
        }*/
    }
}
