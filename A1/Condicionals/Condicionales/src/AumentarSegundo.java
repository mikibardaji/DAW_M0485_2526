import java.util.Scanner;

public class AumentarSegundo {

    public static void main(String[] args) {
        int segundos, minutos, horas;
        Scanner sc = new Scanner(System.in);
        char letra = sc.nextLine().charAt(0);


        System.out.print("Pon horas ");
        horas = sc.nextInt();
        System.out.print("Pon minutos ");
        minutos = sc.nextInt();
        System.out.print("Pon segundos ");
        segundos = sc.nextInt();

        segundos = segundos + 1;

        if (segundos>=60)
            {
                minutos = minutos+1;
                segundos = 0;
                if (minutos>=60) //esta dentro para que solo se pregunte 
                    { //si he cambiado el segundo
                     horas = horas+1;
                     minutos = 0;   
                     if (horas>=24)
                     {
                        horas = 0;
                     }
                    }
            }
        
        System.out.println("el siguente segudno es " +
             horas + ":" + minutos + ":" + segundos );
        
       


    }
}
