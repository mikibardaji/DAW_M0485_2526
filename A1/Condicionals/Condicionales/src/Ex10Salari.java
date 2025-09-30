import java.util.Scanner;

public class Ex10Salari {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TARIFA = 15;
        final double EXTRA = 1.5;
        final double SALARIO_SIN_IMPUESTOS = 1000;
        final double PORCENTAJE_IMPUESTOS = 0.45;
        int horas, horas_extra;
        double salario_final, salario_normal=0, salario_extra=0;

        System.out.print("Cuantas horas has hecho?");
        horas = sc.nextInt();

        //averiguar si he hecho horas extra
        if (horas>=130) //he hecho horas extras
        {
            horas_extra = horas - 130;
            //calcular horas extra
            salario_extra = horas_extra*TARIFA*EXTRA;
            //calcular salario extra horas extra por tarifa multiplicada por 1,5
            salario_normal = 130 * TARIFA;
            //calcular salario horas normales
            //salario_final = salario_normal + salario_extra;
        }
        else //sin horas extra //<130
        {//calcualr salario horas normales
            salario_normal = horas * TARIFA; 
        }

        salario_final = salario_normal + salario_extra;
        //sumar salario_normal mas el salario_extra
        System.out.println("Salario sin horas extra " + salario_normal + " euros.");
        System.out.println("Salario horas extra " + salario_extra + " euros.");
        System.out.println("Vas a cobrar  sin impuestos " + salario_final + " euros.");
        //mostrar salario
        //calculo los impuestos 
        double impuestos=0, sueldo_superior;
        if (salario_final> SALARIO_SIN_IMPUESTOS)
        {
            sueldo_superior = salario_final - SALARIO_SIN_IMPUESTOS; //
            impuestos = sueldo_superior * PORCENTAJE_IMPUESTOS;
            //calculare impuestos (45% de lo que supera a 1000)
        }

        salario_final = salario_final - impuestos;
        //mostrar resultado final salario final sin impuestos
        System.out.println("Impuestos : " + impuestos);
        System.out.println("Salario despues de impuestos : " + salario_final);

    }
}
