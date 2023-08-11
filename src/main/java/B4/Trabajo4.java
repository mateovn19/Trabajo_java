package B4;

import javax.swing.*;
public class Trabajo4 {
    public static void main(String[] args) {
        int inte=0;
        int res=0;




        while (inte< 3){

            int valor1= Integer.parseInt(JOptionPane.showInputDialog(null,"ingresar el primer un numero"));
            int valor2= Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el segundo numero"));

            try {
                if (valor1 == 0) {
                    throw new Exception("el primer valor no debe ir vacio");
                }
                if (valor2 == 0) {
                    throw new Exception("el segundo valor no debe ir vacio");

                }
                res = valor1 / valor2;


            }catch (Exception ElErrorr){
                JOptionPane.showInputDialog(null,ElErrorr.getMessage());
            }finally {
                JOptionPane.showInputDialog(null,"el resultado es :" + res);
            }

        }        JOptionPane.showInputDialog(null,"calculadora ha dejado de funcionar");




    }



}
