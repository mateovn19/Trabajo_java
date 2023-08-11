package B3;

public class MainWhile {
    public static void main(String[] args) {
        int i = 20;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("__________________________________");
        do {//la diferencia de este con el while es que este cilco se ejecuta al menos una asi el sea mayor
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}


