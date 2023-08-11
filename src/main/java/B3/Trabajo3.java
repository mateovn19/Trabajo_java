package B3;

import java.util.Scanner;

public class Trabajo3 {
    public static void main(String[] args) {
        //trabajo numero 3

        System.out.print("Bienvenido porfavor digite la opcion que desea elegir ");
        System.out.print("1. crear usuario");
        System.out.print("2. olvide usuario");
        System.out.print("3. ingreasr usuario");
        Scanner sc= new Scanner(System.in);
        System.out.print("ingresa un numero valido :");
        int num= sc.nextInt();
        int var= 0;
        String u="user";
        String p="123";
        while (var < 3){
            switch (num){
                case 1:
                    System.out.print("ingresar su correo y contrase para ser registrado");
                   break;
                case 2:
                    System.out.print("porfavor digite su contraseña enviaremos un correo");
                    break;
                case 3:
                    System.out.print("ingrese su usuario");
                    String user=sc.next();
                    System.out.print("ingrese su contraseña");
                    String pass=sc.next();

                    if (user.equals(u)  && pass.equals(p));{
                    System.out.print("Bienvenido");
                }

                   {var =var + 1 ;
                    System.out.print(var);
                    System.out.print(user);
                    System.out.print(pass);
                    }
                break;

                default:
                    System.out.print("por favor digite una opcion valida ");
                }

            }
        }


    }

