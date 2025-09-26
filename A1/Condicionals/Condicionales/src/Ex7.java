import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        int valor1, valor2, valor3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Pon valor 1 ");
        valor1 = sc.nextInt();
        System.out.print("Pon valor 2 ");
        valor2 = sc.nextInt();
        System.out.print("Pon valor 3 ");
        valor3 = sc.nextInt();

        if (valor1>=valor2 && valor1 >= valor3)
        {
            System.out.println("el mas grande es " + valor1);
        }
        else if (valor2>=valor1 && valor2 >= valor3)
        {
            System.out.println("el mas grande es " + valor2);  
        }
        else if (valor3>=valor1 && valor3 >= valor2)
        { //PODRIA HABER SIDO UN ELSE A SECAS 
            System.out.println("el mas grande es " + valor3);  
        }

    }
}
