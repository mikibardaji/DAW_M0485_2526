import java.util.Scanner;

public class Variables {
    public static void main(String[] args)  {
        //sc es un objeto del tipo scanner y system in <-- teclado
        Scanner sc = new Scanner(System.in);
        //declarar 3 nuevas variable con valores enteros
        int nota1, nota2, nota3;
        //pedir nota1 al usuario
        System.out.println("Escribe la nota del examen 1: ");
        nota1 = sc.nextInt();
        //pedir nota2 al usuario
        System.out.println("pon la nota del examen 2");
        nota2 = sc.nextInt();
        //pedir nota3
        System.out.println("pon la nota del examen 3");
        nota3 = sc.nextInt();
         //a la variabla sumna de la linea 17, le tienes que asignar la suma de las 3  variables
        int suma=nota1+nota2+nota3;
        int media=suma/3;
        //mostrarlo por pantalla el valor de suma
        System.out.println("tu media es " + media);       

        /* int nota;
        nota=2;
        double precio = 4.75, precio2=4.6, precio3=10;
        char letra = 'c';
        boolean soyTonto = true;
        System.out.println("El precio es " + precio);
        System.out.println("has apretado la latre " + letra);
        System.out.println(" en el examen has sacado un " + nota);
        System.out.println("este programa sabes si eres tonto ... y eres tonto? " + soyTonto);
        precio = precio2 + precio3 ;
        System.out.println("El nuevo precio es " + precio);*/

        
   
}


}