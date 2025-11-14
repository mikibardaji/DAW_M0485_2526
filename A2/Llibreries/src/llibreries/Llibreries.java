/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package llibreries;

/**
 *
 * @author mabardaji
 */
public class Llibreries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       // pruebasMath();
        //int valor = PedirDatosUsuario.pedirDatoPositivo("Pon dinero(positivo)");
        char seguir = PedirDatosUsuario.pedirLetra("Indica una letra de la a a la z ? ");
        System.out.println(seguir);
        
        int valor = PedirDatosUsuario.pedirDatoEntreIntervalo(12, 4);
    }
    
    public static void pruebasMath()
    {
        // Llibreria Math
        double numeroPi = Math.PI;
        double calculo = numeroPi * 2;
        System.out.println(numeroPi + "-" + calculo);
        double numero = -7;
        double numero_absoluto = Math.abs(numero);
        System.out.println(numero_absoluto);
        
        int v1=5, v2=9;
        int minimo = Math.min(v1, v2);
        //signo
        double n = 3;
        double signo = Math.signum(n);
        System.out.println(signo);
        System.out.println("Angulo tangente " + Math.tan(60));
        int maximo = Math.max(v1, v2);
        System.out.println(maximo);
        System.out.println(Math.cbrt(27));
        System.out.println(Math.ceil(3.01));
        System.out.println(Math.floor(3.99));
        
        System.out.println(Math.copySign(4, -1));
        System.out.println(Math.cos(30));
        System.out.println(Math.log10(100));
        System.out.println(Math.round(3.49));
        System.out.println(Math.addExact(2, 3));
        
    }
    
}
