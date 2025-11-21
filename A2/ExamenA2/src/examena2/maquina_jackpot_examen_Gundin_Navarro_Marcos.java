import java.util.Random;

public class maquina_jackpot_examen_Gundin_Navarro_Marcos {
public static void main(String[] args) {
    //tiradaDisco();
    //calcularGanancia(A, A, A, 14);
    //calcularGanancia(B, B, B, 14);
    //calcularGanancia(C, C, C, 14);
    //acumularGanancia(5,14);
    //acumularGanancia(10,14);
    //acumularGanancia(28,14);
    //seguirJugando(1);
    //seguirJugando(36);
    int saldo = 20;
    int precio_tirada = 2;
    do{
    saldo = saldo - precio_tirada;
    System.out.println("---NOVA TIRADA---");

    char a = tiradaDisco();
    char b = tiradaDisco();
    char c = tiradaDisco();

    System.out.println("Discs: " +  a + " " +  b + " " + c);

    System.out.println("Cost tirada: " + precio_tirada + "$");
    int premio = calcularGanancia(a, b, c, saldo);
    System.out.println("Guany obtingut: " + premio);
    saldo = acumularGanancia(premio, saldo);
    System.out.println("Saldo actual: " + saldo + "$");
    }while(seguirjugant(saldo));

}
public static char tiradaDisco(){

    Random rd = new Random();
    
     int numerotirada = rd.nextInt(1,4); //1,2,3  

    if (numerotirada == 1) {
        return 'A';
    }
    else if (numerotirada == 2) {
        return 'B';
    }
    else{
        return 'C';
    }

}
public static int calcularGanancia(char a, char b, char c, int saldo){
    int premio=0;
    
//    if (a==b  && a==c)
//    {
//        switch(a)
//        {
//            case 'A':
//             premio =  5;
//                break;
//           case 'B':
//             premio = 10;
//                break;     
//                (...)
//        }
//            
//                    
//    }
    
    
    if ((a == 'A') && (b == 'A') && (c == 'A')) {
        return 10;
    }
    else if ((a == 'B') && (b == 'B') && (c == 'B')) {
        return 5;
    }
    else if (a == ('C') && b == ('C') && c == ('C')){
        premio = (saldo * 2);
         return premio;
    }else{
        return 0;
    }
}
public static int acumularGanancia(int premio, int saldo){
    if (premio <= 0) {
        return saldo;
    }
    else{
        return saldo + premio;
    }
}
public static boolean seguirjugant(int saldo){
    if (saldo <= 1 || saldo >= 34) {
        return false;
    }
    else{
        return true;
    }
}
}
